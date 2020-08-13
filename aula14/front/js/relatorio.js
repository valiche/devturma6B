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

