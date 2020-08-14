function autenticar(event) {
    event.preventDefault();
    let usuario = document.getElementById("user");
    let senha = document.getElementById("password");

    let loginMsg = {
        email: usuario.value,
        racf: usuario.value,
        senha: senha.value,
    }

    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(loginMsg),
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch('http://localhost:8080/login', cabecalho).then(res => tratarResposta(res));

}

function tratarResposta(res) {
    if (res.status == 200) {
        res.json().then(res => fazerLogin(res));
    } else {
        document.getElementById("msgErro").innerHTML = "Usuário/senha inválido";
    }
}

function fazerLogin(res) {
    localStorage.setItem("userLogged", JSON.stringify(res));
    window.location = "relatorio.html";
}

function agendar() {
    window.location = "agendamento.html";
}
