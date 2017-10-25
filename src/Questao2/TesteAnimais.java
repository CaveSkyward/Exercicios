package Questao2;

public class TesteAnimais {
    public static void main(String args[]){
        Animal animal = new Animal();
        animal.alteraNome("Camelo");
        animal.alteraComprimento(150);
        animal.alteraCor("Amarelo");
        animal.alteraAmbiente("Terra");
        animal.alteraVelocidade(2.0f);
        animal.dados();
        
    }    
}
