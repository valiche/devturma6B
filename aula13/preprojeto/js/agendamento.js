function login() {
    let campoNome = document.getElementById("user");
    console.log('Nome do usuário:' + campoNome.value);

    let resposta = "valiche";
    if(resposta == campoNome.value){
        alert('Usuário válido');
    }else{
        alert('Usuário inválido');
    }
    
}