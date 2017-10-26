package Questao4;

class Aluno {
    private String nome;
    private int n1, n2;
    
    public Aluno(String n, int n1, int n2){
        this.nome = n;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void media(){
        System.out.println("A média de " + this.nome + " é " + (n1 + n2)/2);
    }
}
