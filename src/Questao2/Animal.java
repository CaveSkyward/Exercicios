package Questao2;

public class Animal {
    private String nome, cor, ambiente;
    private int comprimento; 
    private float velocidade;
    private int patas;

    public Animal() {
        this.patas = 4;
    }
        
    public String getNome() {
        return nome;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void alteraAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getPatas() {
        return patas;
    }

    public void alteraPatas(int patas) {
        this.patas = patas;
    }

    public void dados() {
        System.out.println("_____________");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento() + " cm");
        System.out.println("Patas: " + this.getPatas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade: " + this.getVelocidade() + " m/s");
       
    }
 

}
