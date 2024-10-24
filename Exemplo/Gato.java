package Exemplo;

public class Gato extends Felino{
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca==null){
            this.raca = "SRD";
        } else{
            this.raca = raca;
        }
    }

    public Gato(String raca, String nome, int idade, String cor){
        super(nome, idade,cor);
        this.raca = raca;
    }

    @Override
    public void fazerSom(){
        System.out.println("MIAR!");
    }

    @Override
    public void brincar(){
        System.out.println("brincando...");
    }

    public void comer(){
        System.out.println("Comendo no pratinho!\n");
    }

    public void comer(String comida){
        System.out.printf("Comendo %s",comida);
    }

    public void comer(Gato amigo){
        System.out.printf("Comendo a comida do %s",amigo.getNome());
    }

    public void correr(){
        System.out.println("CORRENDO PELA CASAAAAAAAA");
    }

    public void dormir(){
        System.out.println("Dormindo na cama da Fernanda");
    }
}
