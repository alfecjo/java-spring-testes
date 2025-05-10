package interfaces.Ex03;

public class ClasseBasePersonagem implements Personagem {
    private String nome;

    public ClasseBasePersonagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou!!!");
    }

    @Override
    public void defender() {
        System.out.println(this.nome + " se defendeu!!!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(this.nome + " usou habilidade especial !!!");
    }
}
