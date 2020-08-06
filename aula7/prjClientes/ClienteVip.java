package prjClientes;

public class ClienteVip extends Cliente {
   static float CredEsp;

    public ClienteVip(String nome, String mail) {
        super(nome, mail);
    }

    public ClienteVip(String nome, String mail, String nomedep, String maildep) {
        super(nome, mail);
        dependente = new Dependente (nomedep, maildep);
    }

    @Override
    public String toString() {
        return super.toString() + " | Crédito Especial: " + CredEsp;
    }

    @Override
    public boolean fazerCompra(float valor) {
        if (valor > 0 && getCredito() + CredEsp >= valor) {
            setCredito(getCredito() - valor);
            return true;
        } else {
            return false;
        }
    }

    public float getCredEsp() {
        return CredEsp;
    }

    public static void setCredEsp(float credEsp) {
        CredEsp = credEsp;
    }

@Override
public Float getCredito() {
    return super.getCredito() + CredEsp;
}
    
}