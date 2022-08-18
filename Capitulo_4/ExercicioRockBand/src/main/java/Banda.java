public class Banda {

    public String nome;
    public String genero;
    public Musico[] musicos;
    public Musica[] musicas;
    public Empresario empresario;

    public Banda(String nome, String genero, Musico[] musicos, Musica[] musicas, Empresario empresario) {
        this.nome = nome;
        this.genero = genero;
        this.musicos = musicos;
        this.musicas = musicas;
        this.empresario = empresario;
    }

    void mostraInfosBanda(){
        System.out.println("Nome da banda: "+this.nome);
        System.out.println("Genero da banda: "+this.nome);
        System.out.println();
        System.out.println("Musicos:");
        for (int i = 0; i < musicos.length; i++) {
            if (this.musicos[i] != null) {
                System.out.println("Nome: " + this.musicos[i].nome);
                System.out.println("Funcao: " + this.musicos[i].funcao);
                System.out.println();
            }
        }
        System.out.println("Musicas: ");
        for (int i = 0; i < musicas.length; i++) {
            if (this.musicas[i] != null) {
                    System.out.println("Nome: " + this.musicas[i].nome);
                    System.out.println("Tempo: " + this.musicas[i].tempo);
                    System.out.println();

            }
        }
        if(this.empresario != null) {
            System.out.println("CNPJ do empresario: "+this.empresario.cnpj);
            System.out.println("Nome do empresario: "+this.empresario.nome);
        }
    }
}
