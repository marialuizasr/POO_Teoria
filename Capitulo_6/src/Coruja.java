public class Coruja extends Animal{

    private int alturaVoo;

    public Coruja(String nome, int nPatas, String cor, int alturaVoo) {
        super(nome, nPatas, cor);
        this.alturaVoo = alturaVoo;
    }

    @Override
    public void fazBarulho() {
        super.fazBarulho();
        System.out.println("Pruuu pruuu");
    }

    @Override
    public void mostraInfo() {
        System.out.println("-CORUJA-");
        super.mostraInfo();
        System.out.println("Altura do voo: "+this.alturaVoo);
    }

    public int getAlturaVoo() {
        return alturaVoo;
    }

    public void setAlturaVoo(int alturaVoo) {
        this.alturaVoo = alturaVoo;
    }
}
