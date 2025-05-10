package interfaces.Ex03;

public class MainEx03 {
    public static void main(String[] args) {
        Personagem mago = new Mago("Gandalf");
        Personagem guerreiro = new Guerreiro("Aragorn");
        Personagem arqueiro = new Arqueiro("Legolas");

        mago.atacar();
        mago.usarHabilidadeEspecial();
        System.out.println("__________________");
        guerreiro.defender();
        guerreiro.usarHabilidadeEspecial();
        System.out.println("__________________");
        arqueiro.usarHabilidadeEspecial();
    }
}