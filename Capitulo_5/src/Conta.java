public class Conta {

    private int numero;
    private float saldo;
    private String proprietario;

    // ATRIBUTO DE CLASSE
    // UM ATRIBUTO QUE TODOS OS OBJETOS DESTA
    // CLASSE PODEM ACESSAR/MANIPULAR
    static int totalDeContas;

    // CRIANDO UM CONSTRUTOR COM PARAMETRO
    Conta(int numero, float saldo, String proprietario){
        this.numero = numero;
        this.saldo = saldo;
        this.proprietario = proprietario;
        System.out.println("Objeto conta sendo criado.");
    }

    //CRIANDO UM CONSTRUTOR SEM PARAMETROS
    Conta(){
        totalDeContas++;
        System.out.println("Construtor simples sendo criado");
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor){
        if(valor > saldo){
            System.out.println("Não é possível realizar um saque nesse valor");
        }else{
            System.out.println("Saque realizado com sucesso");
            saldo = saldo - valor;
            System.out.println("Saldo: " + saldo);
        }
    }
}
