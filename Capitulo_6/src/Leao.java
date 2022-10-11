public class Leao extends Animal{

    private float tamanhoJuba;

    public Leao(String nome, int nPatas, String cor, float tamanhoJuba) {
        super(nome, nPatas, cor);
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public void fazBarulho() {
        super.fazBarulho();
        System.out.println("Raaaarrr");
        System.out.println();
    }

    @Override
    public void mostraInfo() {
        System.out.println("-LEAO-");
        super.mostraInfo();
        System.out.println("Tamanho da juba: "+this.tamanhoJuba);
    }

    public float getTamanhoJuba() {
        return tamanhoJuba;
    }

    public void setTamanhoJuba(float tamanhoJuba) {
        this.tamanhoJuba = tamanhoJuba;
    }
}
