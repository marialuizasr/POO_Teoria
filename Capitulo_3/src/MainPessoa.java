public class MainPessoa {

    public static void main(String[] args) {

        //criando um objeto
        Pessoa p1 = new Pessoa(); //ponteiro para manipular o objeto
        p1.nome = "Diego";
        p1.idade = 19;
        p1.cpf = "123.456.789-00";

        Pessoa p2 = new Pessoa();
        p2.nome = "Izaque";
        p2.idade = 19;
        p2.cpf = "987.654.321-00";

        Pessoa p3 = new Pessoa();
        p3.nome = "Maria Luiza";
        p3.idade = 20;
        p3.cpf = "081.349.486-93";

        p1.comer();
        p2.dormir();
        p3.tomarAgua();

    }

}
