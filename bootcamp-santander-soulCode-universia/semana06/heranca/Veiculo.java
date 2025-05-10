package semana06.heranca;

public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes do Veículo:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void mostrarDetalhes(String cor) {
        mostrarDetalhes();
        System.out.println("Cor: " + cor);
    }
}

class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, int ano, int numeroPortas) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Número de Portas: " + numeroPortas);
    }
}

class Barco extends Veiculo {
    private String tipoCasco;

    public Barco(String modelo, int ano, String tipoCasco) {
        super(modelo, ano);
        this.tipoCasco = tipoCasco;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo de Casco: " + tipoCasco);
    }
}
