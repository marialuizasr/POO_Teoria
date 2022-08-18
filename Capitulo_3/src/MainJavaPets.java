public class MainJavaPets {

    public static void main(String[] args) {

        //Exercício JavaPets
        AnimalPet pet1 = new AnimalPet();
        pet1.nome = "Lola";
        pet1.especie = "cachorro";
        pet1.comida = "Racao";
        pet1.som = "Au";
        pet1.idade = 11;

        AnimalPet pet2 = new AnimalPet();
        pet2.nome = "Leia";
        pet2.especie = "gato";
        pet2.comida = "Racao";
        pet2.som = "Miau";
        pet2.idade = 5;

        AnimalPet pet3 = new AnimalPet();
        pet3.nome = "Gaia";
        pet3.especie = "passaro";
        pet3.comida = "semente";
        pet3.som = "piu";
        pet3.idade = 2;

        pet1.comer();
        pet1.fazerBarulho();
        pet2.comer();
        pet2.movimentar(2);
        pet3.fazerBarulho();
        pet3.dormir(5);

    }
}
