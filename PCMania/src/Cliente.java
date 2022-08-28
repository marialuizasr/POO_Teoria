public class Cliente {
    String nome;
    String cpf;

    public Cliente(){

    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    float calculaTotalCompra(float total, float compras){
        total = total + compras;
        return total;
    }
}
