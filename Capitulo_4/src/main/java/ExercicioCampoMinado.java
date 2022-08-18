import java.util.Random;
import java.util.Scanner;

public class MainCampoMinado {
    public static void main(String[] args) {

        //declarando variáveis do exercício
        int linha = 0;
        int coluna = 0;
        int pontos = 0;

        //declarando a matriz
        int[][] matriz = new int[3][3];

        //selecionando aleatoriamente uma posição da matriz
        Random numAleatorio = new Random();
        linha = numAleatorio.nextInt(2);
        coluna = numAleatorio.nextInt(2);

        //número 1 vai representar a bomba
        //bosição da matriz recebendo a bomba
        matriz[linha][coluna] = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("CAMPO MINADO");
        do {
            System.out.println("Entre com a linha:");
            linha = teclado.nextInt();
            System.out.println("Entre com a coluna:");
            coluna = teclado.nextInt();

            if (matriz[linha][coluna] == 0){
                pontos++;
                System.out.println("GREAT JOB! GO AHEAD! ;)");
                matriz[linha][coluna] = 2;
            }
            else if (matriz[linha][coluna] == 1){
                System.out.println("BOOOM!! GAME OVER!!");
                break;
            }
            else {
                System.out.println("Linha e coluna repetidas!");
            }

        }while(pontos<8);
        if(pontos == 8)
        {
            System.out.println("CONGRAT! YOU WIN!!!! :)");
        }
    }
}
