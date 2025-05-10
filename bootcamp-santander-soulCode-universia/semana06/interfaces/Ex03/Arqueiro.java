package interfaces.Ex03;

class Arqueiro extends ClasseBasePersonagem {
    public Arqueiro(String nome) {
        super(nome);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(getNome() + " disparou uma chuva de flechas!");
    }
}
