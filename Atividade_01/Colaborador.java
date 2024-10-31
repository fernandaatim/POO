package Atividade_01;

public class Colaborador extends Pessoa {
    private String descricao;
    private Departamento departamento; 

    public Colaborador(String nome, String cpf, String endereco, String telefone, String descricao, Departamento departamento) {
        super(nome, cpf, endereco, telefone);
        this.descricao = descricao;
        this.departamento = departamento;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados(); 
        System.out.println("Descrição do Colaborador: " + descricao);
        System.out.println("Departamento: " + departamento.getDescricao());
    }
}
