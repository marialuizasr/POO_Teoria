public class Main {

    public static void main(String[] args) {

        //ARRAY = ARRANJO
        //arrays de primitivos guardam valores
        //array de objetos guardam referências

        //CARACTERÍSTICAS IMPORTANTES DE UM ARRAY
        //1. TAMANHO PRÉ-DEFINIDO
        //2. GUARDA ELEMENTOS HOMOGÊNEOS
        //3. É DECLARADO COMO UM OBJETO (USAR new)

        // Declarando o array
        // Duas partes
        // Parte 1 - criando como se fosse um objeto
        // Parte 2 - criando um ponteiro

        int[] numeros = new int[10];

        // colocando elementos no array
        numeros[0] = 15;
        numeros[8] = 20;

        /*
        for (int numero : numeros) {
            System.out.println(numero);
        }
        */

        //"ARRAY DE OBJETOS"

        Conta[] contas = new Conta[10];

        // criando contas
        Conta c1 = new Conta();
        c1.numero = 77;

        Conta c2 = new Conta();
        c2.numero = 88;

        contas[0] = c1;
        contas[1] = c2;
        contas[2] = new Conta();

        contas[2].numero = 99;

        for (int i = 0; i < contas.length; i++) {
            if(contas[i] != null)
            {
                System.out.println(contas[i].numero);
            }

        }


    }
}
