public class Kart {

    String nome;
    Piloto pilot;

    Motor m1 = new Motor();


    void pular(){
        System.out.println("O Kart "+this.nome+" pulou.");
    }

    void soltarTurbo(){
        System.out.println("O Kart "+this.nome+" soltou turbo.");
    }

    void fazerDrift(){
        System.out.println("O Kart "+this.nome+" fez drift.");
    }

}
