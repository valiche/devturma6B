package prjClientes;

public class Dependente {
    private String nome, mail;

    public Dependente() {
        nome = "Não cadastrado";
        mail = "Não cadastrado";
    }

    public Dependente(String nome, String mail) {
        this.nome = nome;
        this.mail = mail;
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

    @Override
    public String toString() {
        if (nome != null && nome.length() > 0) {
            return nome + ": " + mail;
        } else {
            return "-";
        }
    }

}