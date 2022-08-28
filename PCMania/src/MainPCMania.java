import java.util.Scanner;

public class MainPCMania {

    public static void main(String[] args) {

        // VARIÁVEIS DE REFERÊNCIA DO ARRAY DE COMPUTADORES
        Computador[] computadores = new Computador[3];
        Computador[] computadoresComprados = new Computador[100];

        // VARIÁVEL DE REFERÊNCIA DO ARRAY DE HARDWARES
        HardwareBasico[] h1 = new HardwareBasico[3];
        HardwareBasico[] h2 = new HardwareBasico[3];
        HardwareBasico[] h3 = new HardwareBasico[3];

        // VARIÁVEIS DE REFERÊNCIA DAS POSIÇÕES DO ARRAY

        // HARDWARES
        for (int i = 0; i < h1.length; i++) {
            h1[i] = new HardwareBasico();
        }
        for (int i = 0; i < h2.length; i++) {
            h2[i] = new HardwareBasico();
        }
        for (int i = 0; i < h3.length; i++) {
            h3[i] = new HardwareBasico();
        }

        // COMPUTADORES
        for (int i = 0; i < computadores.length; i++) {
            computadores[i] = new Computador();
        }

        // COMPUTADORES COMPRADOS
        for (int i = 0; i < computadoresComprados.length; i++) {
            computadoresComprados[i] = new Computador();
        }

        // CRIANDO OBJETOS
        // PRIMEIRO OBJETO DA PROMOÇÃO
        MemoriaUSB m1 = new MemoriaUSB("Pen Drive", 16);
        h1[0] = new HardwareBasico("Pentium Core i3", 1200F);
        h1[1] = new HardwareBasico("Memoria RAM", 4F);
        h1[2] = new HardwareBasico("HD",500F);
        SistemaOperacional s1 = new SistemaOperacional("Linuz Ubuntu",32);
        computadores[0] = new Computador("Positivo", 1300.00F, m1, h1, s1);

        // SEGUNDO OBJETO DA PROMOÇÃO
        MemoriaUSB m2 = new MemoriaUSB("Pen Drive", 32);
        h2[0] = new HardwareBasico("Pentium Core i5", 2260F);
        h2[1] = new HardwareBasico("Memoria RAM", 8F);
        h2[2] = new HardwareBasico("HD",1000F);
        SistemaOperacional s2 = new SistemaOperacional("Windows 8",64);
        computadores[1] = new Computador("Acer", 1800.00F, m2, h2, s2);

        // TERCEIRO OBJETO DA PROMOÇÃO
        MemoriaUSB m3 = new MemoriaUSB("HD", 1000);
        h3[0] = new HardwareBasico("Pentium Core i7", 3500F);
        h3[1] = new HardwareBasico("Memoria RAM", 16F);
        h3[2] = new HardwareBasico("HD",2000F);
        SistemaOperacional s3 = new SistemaOperacional("Windows 8",64);
        computadores[2] = new Computador("Vaio", 2800.00F, m3, h3, s3);

        // VARIÁVEL DE REFERÊNCIA DO CLIENTE
        Cliente cliente = new Cliente("Maria Luiza", "111.222.333-44");


        // POSSIBILITANDO ENTRADA DE DADOS
        Scanner input = new Scanner(System.in);

        // INTERFACE COM O USUÁRIO
        System.out.println("Informacoes sobre os computadores: ");
        System.out.println();
        System.out.println("OPCAO 1:");
        computadores[0].mostraPCConfigs();
        System.out.println();
        System.out.println("OPCAO 2:");
        computadores[1].mostraPCConfigs();
        System.out.println();
        System.out.println("OPCAO 3:");
        computadores[2].mostraPCConfigs();
        System.out.println();

        System.out.println("Para comprar um Computador digite a opcao do mesmo (1, 2 ou 3):");
        System.out.println("Para sair digite 0");
        int compra = input.nextInt();
        float totalCompra = 0;
        int j = 0;
        while(compra != 0){
            switch(compra){
                case 1:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computadores[0].preco);
                    computadoresComprados[j] = computadores[0];
                    j++;
                    break;
                case 2:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computadores[1].preco);
                    computadoresComprados[j] = computadores[1];
                    j++;
                    break;
                case 3:
                    totalCompra = cliente.calculaTotalCompra(totalCompra, computadores[2].preco);
                    computadoresComprados[j] = computadores[2];
                    j++;
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
            System.out.println("Para comprar outro Computador digite a opcao do mesmo (1, 2 ou 3):");
            System.out.println("Para sair digite 0");
            compra = input.nextInt();
        }

        System.out.println("Nome do cliente: "+cliente.nome);
        System.out.println("CPF do cliente: "+cliente.cpf);
        System.out.println();
        System.out.println("Computadores comprados:");
        System.out.println();
        for (int i = 0; i < computadoresComprados.length; i++) {
            if(computadoresComprados[i].marca != null)
            {
                computadoresComprados[i].mostraPCConfigs();
                System.out.println();
            }
            else break;
        }
        System.out.println("Total da Compra: "+totalCompra);
    }
}
