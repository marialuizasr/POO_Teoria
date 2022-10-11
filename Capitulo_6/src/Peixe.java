public class Peixe extends Animal{

    private int nBarbatanas;

    public Peixe(String nome, int nPatas, String cor, int nBarbatanas) {
        super(nome, nPatas, cor);
        this.nBarbatanas = nBarbatanas;
    }

    @Override
    public void fazBarulho() {
        System.out.println("Peixes nao fazem barulho.");
        System.out.println("Logo, o peixe "+this.nome+" nao esta fazendo barulho.");
        System.out.println();
    }

    @Override
    public void mostraInfo() {
        System.out.println("-PEIXE-");
        super.mostraInfo();
        System.out.println("Numero de barbatanas: "+this.nBarbatanas);
    }

    public int getnBarbatanas() {
        return nBarbatanas;
    }

    public void setnBarbatanas(int nBarbatanas) {
        this.nBarbatanas = nBarbatanas;
    }
}
