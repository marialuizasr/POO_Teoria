public class TrabalhadorBrasileiro {

    //atributos
    String nome;
    String profissao;
    float salario;
    String rg;
    String dataDeNascimento;
    float salarioAlterado;

    //ações
    void recebeAumento(float valor)
    {
        System.out.println("Novo salario de " + nome + ": " + (salario + valor));
    }
    float calculaGanhoAnual()
    {
        return salario*13;
    }
    void mostraInfosFuncionario()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Profissao: " + profissao);
        System.out.println("Salario: " + salario);
        System.out.println("RG: " + rg);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }
}
