package IteratorMethod;

public class Seguidor {

    private String nomeConta;
    private boolean seguindo;

    public Seguidor(String nomeConta, boolean seguindo) {
        this.nomeConta = nomeConta;
        this.seguindo = seguindo;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public boolean isSeguindo() {
        return seguindo;
    }

    public void setSeguindo(boolean seguindo) {
        this.seguindo = seguindo;
    }
}
