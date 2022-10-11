public class Main {
    public static void main(String[] args) {
        RedeSocial[] redeSociais = new RedeSocial[4];
        Facebook facebook = new Facebook("hf57j3k@", 1200);
        Instagram instagram = new Instagram("dkjfiuh3847#",500);

        redeSociais[0] = facebook;
        redeSociais[1] = instagram;

        Usuario usuario = new Usuario("Maria Luiza","malusraimundo@gmail.com",redeSociais);

        for (int i = 0; i < redeSociais.length; i++) {
            if(redeSociais[i] != null){
                if(redeSociais[i] instanceof Facebook){
                    Facebook f = (Facebook) redeSociais[i];
                    f.fazStreaming();
                    f.compartilhar();
                    f.curtirPublicacao();
                }
                if(redeSociais[i] instanceof Instagram){
                    Instagram inst = (Instagram) redeSociais[i];
                    inst.postarComentario();
                    inst.postarFoto();
                    inst.postarVideo();
                }
            }
        }
    }
}
