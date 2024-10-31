package Atividade_02;

public class LojaShopping extends Loja implements Registro {
    private String endereco;
    private String gerente;

    public LojaShopping(String cnpj, String razaoSocial, String endereco, String gerente) {
        super(cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void mostrarDados() {
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Endereço: " + endereco);
        System.out.println("Gerente: " + gerente);
        System.out.println("Status: " + getStatus());
    }

    @Override
    public void registra_abertura_dia() {
        if (!isAberta()) {
            setAberta(true);
            System.out.println("Loja aberta com sucesso.");
        } else {
            System.out.println("A loja já está aberta.");
        }
    }

    @Override
    public void registra_fechamento_dia() {
        if (isAberta()) {
            setAberta(false);
            System.out.println("Loja fechada com sucesso.");
        } else {
            System.out.println("A loja já está fechada.");
        }
    }
}