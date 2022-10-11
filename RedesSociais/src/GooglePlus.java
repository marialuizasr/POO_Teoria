public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Google Plus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Google Plus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Google Plus!");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.println(" no Google Plus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma video conferencia pelo Google Plus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicacao no Google Plus");
    }
}
