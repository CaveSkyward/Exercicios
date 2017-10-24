package Questao2;

public class Urso extends Mamifero{
    private String alimento;

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    
    public Urso(){
        super.setCor("Castanho");
        this.alimento = "Mel";
    }
}
