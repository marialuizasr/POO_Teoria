import java.util.Scanner;

public class MainRockBand {
    public static void main(String[] args) {
        //variáveis de referência
        Musico[] musicos = new Musico[100];
        Musica[] musicas = new Musica[100];

        //habilitando entrada de dados
        Scanner input = new Scanner(System.in);

        //entrada de dados da banda
        System.out.println("Entre com o nome da banda:");
        String nomeDaBanda = input.nextLine();
        System.out.println("Entre com o genero da banda:");
        String generoDaBanda = input.nextLine();

        //variavel flag
        boolean flag = true;

        //variavel de contagem
        int i = 0;


        //entrando com os musicos
        while(flag){
            System.out.println("Digite OK para entrar com os musicos e PARAR para sair do loop: ");
            String parar2 = input.nextLine();
            if (parar2.equals("PARAR")) {
                flag = false;
            }
            else {
                musicos[i] = new Musico();
                System.out.println("Nome do musico:");
                musicos[i].nome = input.nextLine();
                System.out.println("Funcao do musico:");
                musicos[i].funcao = input.nextLine();
                i++;
            }
        }

        //voltando ao estado inicial
        flag = true;
        i = 0;

        //entradando com as musicas
        while(flag){
            System.out.println("Digite OK para entrar com as musicas e PARAR para sair do loop: ");
            String parar = input.nextLine();
            if (parar.equals("PARAR")) {
                flag = false;
            }
            else {
                musicas[i] = new Musica();
                System.out.println("Nome da musica:");
                musicas[i].nome = input.nextLine();
                System.out.println("Tempo da musica:");
                musicas[i].tempo = input.nextInt();
                input.nextLine();
                i++;
            }
        }

        //variavel de referencia do empresario
        Empresario empresario = new Empresario();

        //perguntando se há ou nao empresario
        System.out.println("Essa musica possui empresario? digite SIM ou NAO:");
        String possuiEmpresario = input.nextLine();
        if (possuiEmpresario.equals("SIM")){
            System.out.println("CNPJ do empresario:");
            empresario.cnpj = input.nextLong();
            System.out.println("Nome do empresario:");
            input.nextLine();
            empresario.nome = input.nextLine();
        }
        else {
            System.out.println("Ok, nao possui empresario.");
        }

        //variáveis de referencia da banda
        Banda banda = new Banda(nomeDaBanda, generoDaBanda, musicos, musicas, empresario);

        //mostrando informações da banda
        banda.mostraInfosBanda();
    }
}
