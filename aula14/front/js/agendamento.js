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

function novoAgendamento(event) {
    event.preventDefault();
    let cliente = document.getElementById("client");
    let email = document.getElementById("email");
    let celular = document.getElementById("celular");
    let agencia = document.getElementById("sel_agencias");
    let data = document.getElementById("date");
    let horain = document.getElementById("timein");
    let novadata = new Date (data.value);
    
    novadata = novadata.toLocaleDateString("pt-BR");

    let agendaMsg = {
        nome: cliente.value,
        email: email.value,
        celular: celular.value,
        agencia: {id: agencia.value},
        dataAgendamento: novadata,
        horaAgendamento: horain.value
    }

    let mensagem = {
        method: 'POST',
        body: JSON.stringify(agendaMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }
    console.log(agendaMsg)
    fetch('http://localhost:8080/agendamento/novo', mensagem).then(res => tratarResposta(res));

}


function tratarResposta(res) {
    if (res.status == 200) {
        document.getElementById("msgOK").innerHTML ="Agendamento cadastrado com sucesso. Use máscara.";
    } else {
        document.getElementById("msgNOK").innerHTML = "Agendamento não realizado. Tente novamente.";
    }
}