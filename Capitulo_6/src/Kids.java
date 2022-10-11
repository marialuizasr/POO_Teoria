public class Kids extends Vip{
    private String docResponsavel;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Documento do Responsável: "+this.docResponsavel);
    }
}
