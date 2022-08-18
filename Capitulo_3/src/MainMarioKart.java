public class MainMarioKart {

    public static void main(String[] args) {

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();
        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.nome = "Standard";
        k1.m1.cilindradas = "50cc";
        k1.m1.velocidadeMaxima = 100.00F;

        p1.nome = "Mario";
        p1.vilao = false;

        k1.pilot = p1;

        k2.nome = "Egg1";
        k2.m1.cilindradas = "150cc";
        k2.m1.velocidadeMaxima = 120.00F;

        p2.nome = "Wario";
        p2.vilao = true;

        k2.pilot = p2;

        k1.pular();
        k2.soltarTurbo();
        k1.fazerDrift();

        //p1.soltaSuperPoder();
        k1.pilot.soltaSuperPoder();

    }

}
