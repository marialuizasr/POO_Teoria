public class Camarote extends Ingresso{
    private String tamanhoCamiseta;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho da camiseta: "+this.tamanhoCamiseta);
    }
}
