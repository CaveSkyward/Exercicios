package Questao2;

public class Peixe extends Animal{
    private String caracteristica;
    
    public Peixe() {
        super.alteraPatas(0);
        super.alteraAmbiente("Mar");
        super.alteraCor("Cinzenta");        
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public void dados(){
        System.out.println("_____________");
        System.out.println("Característica: " + this.getCaracteristica());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Comprimento: " + this.getComprimento());
        System.out.println("Patas: " + this.getPatas());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Velocidade: " + this.getVelocidade());
    }
}
