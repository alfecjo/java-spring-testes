package semana06;

enum StatusSistema {
    EXECUCAO("O sistema está em execução."),
    FALHA("O sistema falhou. Por favor, corrija o problema."),
    PAUSADO("O sistema está pausado."),
    DESCONHECIDO("Status desconhecido.");

    private final String mensagem;

    StatusSistema(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}

public class Sistema {
    private StatusSistema status;

    public Sistema() {
        this.status = StatusSistema.EXECUCAO;
    }

    public void alterarStatus(StatusSistema novoStatus) {
        this.status = novoStatus;
    }

    public void alterarStatus(String novoStatus) {
        try {
            this.status = StatusSistema.valueOf(novoStatus.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Status desconhecido. Mantendo o status atual.");
        }
    }

    public void notificar() {
        System.out.println(status.getMensagem());
    }
}
