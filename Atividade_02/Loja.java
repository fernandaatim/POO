package Atividade_02;

public abstract class Loja {
    private String cnpj;
    private String razaoSocial;
    private boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public boolean isAberta() {
        return aberta;
    }

    protected void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getStatus() {
        return aberta ? "Aberta" : "Fechada";
    }
}