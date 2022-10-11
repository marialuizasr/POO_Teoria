public class Usuario {

    private String nome;
    private String email;
    RedeSocial[] redesSociais = new RedeSocial[4];

    public Usuario(String nome, String email, RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = redesSociais;
    }
}