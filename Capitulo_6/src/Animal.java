public class Animal {

    protected String nome;
    protected int nPatas;
    protected String cor;

    public Animal(){

    }

    public Animal(String nome, int nPatas, String cor) {
        this.nome = nome;
        this.nPatas = nPatas;
        this.cor = cor;
    }

    public void fazBarulho(){
        System.out.println("O animal "+this.nome+" esta fazendo barulho.");
    }

    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Numero de patas: "+this.nPatas);
        System.out.println("Cor: "+this.cor);
    }
}
