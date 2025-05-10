package interfaces.Ex03;

public class Mago extends ClasseBasePersonagem {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " lançou uma bola de fogo!!!");
    }

}
