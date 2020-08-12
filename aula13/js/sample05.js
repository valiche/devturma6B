function avisar(){
    let a; //criação da variável a, sem especificar tipo
    var b; //declaração de variável mais antiga
    console.log ('Clicou no botão');
}

function login(){
    let campnome = document.getElementById("txtnome");
let camporesposta = document.getElementById("resposta");
    console.log('Nome do usuário: '+campnome.value);
 
    let resposta = "valiche";
 
    if (resposta == campnome.value){
        alert('Login com sucesso');
        camporesposta.value = 'Olá, ' + campnome.value;
    }else   
        alert('Falha no login')
}