import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        //comentário de uma linha
        /*
        comentário de múltiplas linhas
         */
        /**
         * comentário especial para criar documentos pro software
         * JAVADOC
         */
    /*
        //criando um tipo primitivo
        int idade = 20;

        //criando uma classe
        String nome = "Maria Luiza"; //toda classe a 1ª letra é maiúscula

     */
    /*
        System.out.println("Meu nome eh: " + nome + " e minha idade eh: " + idade);

        System.out.println(nome.toUpperCase()); //todos caracteres com letra maiúscula
        System.out.println(nome.toLowerCase()); //todos caracteres com letra minúsculas
        System.out.println(nome.length()); //tamanho da string
     */

        //como fazer entrada de dados
        //usando a classe scannerMaria
        /*
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com seu nome:");
        nome = leitor.nextLine(); //nextInt, nextFloat...

        System.out.println("Nome: " + nome);

         */

        // EXERCÍCIO
        //criando variáveis
        int ano1, ano2, ano3; //total de vilões por ano
        int t; //total de vilões

        //entrada de dados
        Scanner leitor = new Scanner(System.in);
        System.out.println("Entre com a quantidade de vilões do ano 1:");
        ano1 = leitor.nextInt();
        System.out.println("Entre com a quantidade de vilões do ano 2:");
        ano2 = leitor.nextInt();
        System.out.println("Entre com a quantidade de vilões do ano 3:");
        ano3 = leitor.nextInt();

        //somando vilões de todos os anos
        t = ano1 + ano2 + ano3;

        //saída de dados
        System.out.println("Ano 1: " + ano1 + "; Ano 2: " + ano2 + "; Ano 3: " + ano3);
        System.out.println("Total de vilões: " + t);

    }

}
