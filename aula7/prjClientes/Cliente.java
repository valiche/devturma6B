package prjClientes;

public class Cliente {
    private String nome, mail;
    private Float credito = 0.0f;
    Dependente dependente;

    public Cliente() {
        nome = "Não cadastrado";
        mail = "Não cadastrado";
        credito = 0.0f;
    }

    public Cliente(String nome, String mail, float credito) {
        this.nome = nome;
        this.mail = mail;
        this.credito = credito;
    }

    public Cliente(String nome, String mail, Dependente dependente) {
        this.nome = nome;
        this.mail = mail;
        this.dependente = new Dependente();

    }

    public Cliente(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
        this.dependente = null;
    }

    public String toString() {
            return "Cliente: " + nome + " | E-mail: " + mail + " | Crédito: " + credito + " | Dependente: " + dependente.toString();    
    }

    public boolean fazerCompra(float valor) {
        if (valor > 0 && credito >= valor) {
            credito = credito - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean colocarCredito(float valor) {
        if (valor >= 0) {
            credito = credito + valor;
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Float getCredito() {
        return credito;
    }

    public void setCredito(Float credito) {
        this.credito = credito;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    

}