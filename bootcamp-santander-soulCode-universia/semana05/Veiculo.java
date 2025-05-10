package semana05;

public class Veiculo {
    private boolean ligado;
    private int ano;
    private String marca;
    private double kmRodados;
    private double consumo;
    private double tanqueAtual;

    public Veiculo(int ano, String marca, double consumo, double tanqueAtual) {
        this.ligado = false;
        this.ano = ano;
        this.marca = marca;
        this.kmRodados = 0.0;
        this.consumo = consumo;
        this.tanqueAtual = tanqueAtual;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Veículo ligado.");
            ligado = true;
        } else {
            System.out.println("O veículo já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Veículo desligado.");
            ligado = false;
        } else {
            System.out.println("O veículo já está desligado.");
        }
    }

    public void viajar(double distancia) {
        if (ligado) {
            double gasolinaNecessaria = distancia / consumo;
            if (gasolinaNecessaria <= tanqueAtual) {
                System.out.println("Viajando " + distancia + " km.");
                tanqueAtual -= gasolinaNecessaria;
                kmRodados += distancia;
            } else {
                System.out.println("Não há combustível suficiente para viajar essa distância.");
            }
        } else {
            System.out.println("O veículo está desligado. Ligue o veículo antes de viajar.");
        }
    }

    public void revisao() {
        consumo *= 0.9;
        System.out.println("Revisão realizada. Consumo melhorado em 10%.");
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public double getConsumo() {
        return consumo;
    }

    public double getTanqueAtual() {
        return tanqueAtual;
    }
}

