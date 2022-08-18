public class MainTrabalhadorBrasileiro {

    public static void main(String[] args) {

        //Exercício TrabalhadorBrasileiro
        //criando objeto-funcionários
        TrabalhadorBrasileiro f1 = new TrabalhadorBrasileiro();
        TrabalhadorBrasileiro f2 = new TrabalhadorBrasileiro();

        //dando as especificações para os objetos
        f1.nome = "Maria Luiza";
        f1.profissao = "Monitora";
        f1.salario = 400.00F;
        f1.rg = "MG-20.046.940";
        f1.dataDeNascimento = "19/06/2002";
        f2.nome = "Maria Luiza";
        f2.profissao = "Monitora";
        f2.salario = 400.00F;
        f2.rg = "MG-20.046.940";
        f2.dataDeNascimento = "19/06/2002";


        //chamar ações para os objetos
        f1.mostraInfosFuncionario();
        System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
        f1.recebeAumento(330.00F);

        //dirá que são diferentes, pois não é possível fazer essse tipo de comparação
        if(f1 == f2)
        {
            System.out.println("Objetos Iguais!");
        }
        else
        {
            System.out.println("Objetos Diferentes!");
        }
        //comparando atributos dos objetos
        if (f1.nome.equals(f2.nome))
        {
            System.out.println("Nomes Iguais!");
        }
        else
        {
            System.out.println("Nomes Diferentes!");
        }
        if (f1.salario == f2.salario)
        {
            System.out.println("Salarios Iguais!");
        }
        else
        {
            System.out.println("Salarios Diferentes!");
        }

    }
}
