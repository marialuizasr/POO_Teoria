public class Ingresso {

    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao;

    public float calculaTotalIngresso(){

    }

    public void mostraInfos(){
        System.out.println("Numero da compra: "+this.numero);
        System.out.println("Valor do Ingresso: "+this.valorIngresso);
    }
}
