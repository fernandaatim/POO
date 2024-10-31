package Atividade_01;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("DTA");

        Cliente cliente = new Cliente("Siegklenes", "111.111.111-11", "Rua no Aventureiro", "479999999", 150000.00, 255000.00);
        
        Colaborador colaborador = new Colaborador("Leandro Paulo Silva", "222.222.222-22", "Mesmo do Ziglas", "4799999999", "Joga Xadrez", departamento);

        System.out.println("Dados do Cliente:");
        cliente.mostrarDados();
        
        System.out.println("\nDados do Colaborador:");
        colaborador.mostrarDados();
    }
}
