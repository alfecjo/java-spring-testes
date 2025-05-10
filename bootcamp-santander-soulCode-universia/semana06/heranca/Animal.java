package semana06.heranca;

public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome, "Gato");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome, "Cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

