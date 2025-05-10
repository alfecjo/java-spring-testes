package semana05;

public class Dispositivo {
    protected String marca;
    protected String modelo;
    protected String ano;
    protected double porcentagemBateria;

    public Dispositivo(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.porcentagemBateria = 100.0;
    }

    public void tirarFoto() {
        if (porcentagemBateria >= 10.0) {
            System.out.println("Foto tirada. Reduzindo a bateria em 10%.");
            porcentagemBateria -= 10.0;
        } else {
            System.out.println("Não há bateria suficiente para tirar uma foto.");
        }
    }

    public void recarregar() {
        System.out.println("Recarregando a bateria. Porcentagem agora é 100%.");
        porcentagemBateria = 100.0;
    }

    public void rodarAplicativo(String nomeAplicativo) {
        if (porcentagemBateria >= 5.0) {
            System.out.println("Aplicativo '" + nomeAplicativo + "' sendo executado. Reduzindo a bateria em 5%.");
            porcentagemBateria -= 5.0;
        } else {
            System.out.println("Não há bateria suficiente para executar o aplicativo.");
        }
    }
}

