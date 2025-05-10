package semana06.heranca;

public class MainEx02 {
    public static void main(String[] args) {
        Animal animal = new Animal("AnimalGenérico", "Desconhecida");
        Gato gato = new Gato("Garfield");
        Cachorro cachorro = new Cachorro("Rex");

        animal.emitirSom();  // O animal emite um som.
        gato.emitirSom();    // Miau!
        cachorro.emitirSom(); // Au au!
    }
}

