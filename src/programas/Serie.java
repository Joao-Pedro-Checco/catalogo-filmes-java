package programas;

public class Serie extends Titulo {
    private int[] periodoDeExibicao;
    private int temporadas;
    private boolean emAndamento;

    public Serie(String nome, int[] periodoDeExibicao, int temporadas, boolean emAndamento) {
        super(nome);
        this.periodoDeExibicao = periodoDeExibicao;
        this.temporadas = temporadas;
        this.emAndamento = emAndamento;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Período de Exibição: " + formataPeriodoExibicao());
        System.out.println("Em andamento: " + formataAndamento());
        System.out.println("Nota: " + mediaDeAvaliacoes());
        System.out.println("Avaliações: " + this.totalAvaliacoes);
    }

    private String formataAndamento() {
        if (emAndamento) return "Sim";
        return "Não";
    }

    private String formataPeriodoExibicao() {
        if (this.periodoDeExibicao[1] == 0) {
            return this.periodoDeExibicao[0] + "~";
        }
        return this.periodoDeExibicao[0] + " - " + this.periodoDeExibicao[1];
    }

    private void atualizaStatusAndamento(boolean emAndamento) {
        this.emAndamento = emAndamento;
    }

    private void adicionaTemporada() {
        this.temporadas++;
    }

    private void atualizaPeriodoExibicao(int ano) {
        this.periodoDeExibicao[1] = ano;
    }
}
