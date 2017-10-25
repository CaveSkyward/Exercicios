package Questao2;

public class Mamifero extends Animal{
    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public void dados(){
        System.out.println("_____________");
        System.out.println("Alimento: " + this.getAlimento());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento());
        System.out.println("Patas: " + this.getPatas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade: " + this.getVelocidade());
    }
}
