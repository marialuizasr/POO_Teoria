public class Vip extends Ingresso{
    protected String tamanhoAbada;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho do abada: "+this.tamanhoAbada);
    }
}
