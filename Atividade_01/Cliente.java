package Atividade_01;

public class Cliente extends Pessoa {
    private Double valorUltimaCompra;
    private Double valorMaiorCompra;

    public Cliente(String nome, String cpf, String endereco, String telefone, Double valorUltimaCompra, Double valorMaiorCompra) {
        super(nome, cpf, endereco, telefone);
        this.valorUltimaCompra = valorUltimaCompra;
        this.valorMaiorCompra = valorMaiorCompra;
    }

    public Double getValorUltimaCompra() {
        return valorUltimaCompra;
    }
    public void setValorUltimaCompra(Double valorUltimaCompra) {
        this.valorUltimaCompra = valorUltimaCompra;
    }

    public Double getValorMaiorCompra() {
        return valorMaiorCompra;
    }
    public void setValorMaiorCompra(Double valorMaiorCompra) {
        this.valorMaiorCompra = valorMaiorCompra;
    }
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Valor da última compra: R$ " + valorUltimaCompra);
        System.out.println("Valor da maior compra: R$ " + valorMaiorCompra);
    }
}
