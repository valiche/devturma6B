function validaLogin() {
    let user = localStorage.getItem("userLogged");

    if (!user) {
        window.location = "index.html";
    }

    let jsonuser = JSON.parse(user);
    document.getElementById("user").innerHTML = `${jsonuser.nome} (${jsonuser.racf})`;
    document.getElementById("imguser").innerHTML = `<img src = "${jsonuser.linkFoto}">`;
    obterAgencias()
}

function logout() {
    localStorage.removeItem("userLogged");
    window.location = "index.html";
}

function obterAgencias() {

    fetch("http://localhost:8080/agencias").then(res => res.json()).then(res => preencheAgencias(res));

}

function preencheAgencias(res) {
    let agencias;

    for (let index = 0; index < res.length; index++) {
        agencias = agencias + `<option value = ${res[index].id} > ${res[index].nomeagencia} </option>`;

    }

    document.getElementById("sel_agencias").innerHTML = agencias;

}

function gerarRelatorio(event) {
    event.preventDefault();
    let agenc = document.getElementById("cxagencia").checked;
    let date = document.getElementById("cxdate").checked;
    let client = document.getElementById("cxclient").checked;
    console.log(client);
    if (client == true) {
        console.log('client');
        let agencia = document.getElementById("sel_agencia");
        let data = document.getElementById("date");
        let cliente = document.getElementById("client");
        
        let relatorioMsg = {
            nome: cliente.value
        }

        let cabecalho = {
            method: 'POST',
            body: JSON.stringify(relatorioMsg),
            headers: {
                'Content-type': 'application/json'
            }
        }
        console.log(cabecalho);
        fetch('http://localhost:8080/relatorio/cliente', cabecalho).then(res => res.json()).then(res => tratarRelatorio(res));
    }else{
        fetch('http://localhost:8080/relatorio').then(res => res.json()).then(res => tratarRelatorio(res));
    }

}

function tratarRelatorio(res) {
    let agendamentos = '';
    let agencia;
    let nome;

    for (let index = 0; index < res.length; index++) {
        agendamentos += `<tr>
        <td>${res[index].agencia.nomeagencia}</td>
        <td>${res[index].dataAgendamento}</td>
        <td>${res[index].horaAgendamento}</td>
        <td>${res[index].nome}</td>
        </tr>`
    }

    document.getElementById("get_agendamentos").innerHTML = agendamentos;

}
