public class Zoologico {
    private String nome;
    private String endereco;
    Animal[] animais = new Animal[100];

    public Zoologico(String nome, String endereco, Animal[] animais) {
        this.nome = nome;
        this.endereco = endereco;
        for (int i = 0; i < this.animais.length; i++) {
            if(this.animais[i] != null){
                this.animais[i] = animais[i];
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome do Zoologico: "+this.nome);
        System.out.println("Endereco do Zoologico: "+this.endereco);
        System.out.println("Animais:");
        for (int i = 0; i < this.animais.length; i++) {
            if (this.animais[i] != null){

            }
        }
    }
}
