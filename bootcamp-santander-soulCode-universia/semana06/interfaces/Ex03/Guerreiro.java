package interfaces.Ex03;

public class Guerreiro extends ClasseBasePersonagem {
    public Guerreiro(String nome) {
        super(nome);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " usou escudo mágico!!!");
    }
}