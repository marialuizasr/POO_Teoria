public class AnimalPet {

    //características (ou atributos)
    String nome;
    String especie;
    String som;
    String comida;
    int idade;

    //ações (ou métodos)
    void comer()
    {
        System.out.println(nome + " esta comendo");
    }

    void dormir(int horas)
    {
        System.out.println(nome + " vai dormir por " + horas + " horas");
    }

    void movimentar(int metros)
    {
        System.out.println(nome + " vai se movimentar por " + metros + " metros" );
    }

    void fazerBarulho()
    {
        System.out.println(nome + " esta fazendo barulho");
    }

}
