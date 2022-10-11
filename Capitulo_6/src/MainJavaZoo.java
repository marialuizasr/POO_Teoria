public class MainJavaZoo {
    public static void main(String[] args) {

        Pato pato = new Pato("Mario",2,"branco",2.3f);
        Leao leao = new Leao("Simba",4,"caramelo",30.8f);
        Peixe peixe = new Peixe("Nemo",0,"laranja",2);
        Coruja coruja = new Coruja("Lua",2,"cinza",20);

        Animal[] animais = new Animal[100];

        animais[0] = pato;
        animais[1] = leao;
        animais[2] = peixe;
        animais[3] = coruja;

        Zoologico zoologico = new Zoologico("Mundo Selvagem","Rio de Janeiro",animais);

        /*
        // LENDO OS BIXOS DENTRO DO ARRAY
        for (int i = 0; i < animais.length; i++) {
            if(animais[i] != null)
            {
                animais[i].mostraInfo();
                animais[i].fazBarulho();
            }
        }
         */

        // FAZENDO CASTING
        for (int i = 0; i < animais.length; i++) {
            if(animais[i] != null){
                System.out.println("Nome: "+animais[i].nome);
                System.out.println("Cor: "+animais[i].cor);
                System.out.println("Numero de patas: "+animais[i].nPatas);
                if(animais[i] instanceof Coruja){
                    Coruja coruja_aux = (Coruja) animais[i];
                    System.out.println("Altura do voo: "+coruja_aux.getAlturaVoo());
                }
                else if(animais[i] instanceof Pato){
                    Pato pato_aux = (Pato) animais[i];
                    System.out.println("Tamanho do bico: "+pato_aux.getTamanhoBico());
                }
                else if(animais[i] instanceof Leao){
                    Leao leao_aux = (Leao) animais[i];
                    System.out.println("Tamanho da juba: "+leao_aux.getTamanhoJuba());
                }
                else if(animais[i] instanceof Peixe) {
                    Peixe peixe_aux = (Peixe) animais[i];
                    System.out.println("Numero de barbatanas: " + peixe_aux.getnBarbatanas());
                }
            }
        }
    }
}
