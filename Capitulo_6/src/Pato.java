public class Pato extends Animal{

    private float tamanhoBico;

    public Pato(String nome, int nPatas, String cor, float tamanhoBico) {
        super(nome, nPatas, cor);
        this.tamanhoBico = tamanhoBico;
    }

    @Override
    public void fazBarulho() {
        super.fazBarulho();
        System.out.println("Quaqua");
        System.out.println();
    }

    @Override
    public void mostraInfo() {
        System.out.println("-PATO-");
        super.mostraInfo();
        System.out.println("Tamanho do bico: "+this.tamanhoBico);
    }

    public float getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(float tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
}
