import java.text.DecimalFormat;

public class Filme {
    private final String nome;
    private final int anoLancamento;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private final int duracaoMinutos;

    Filme(String nome, int anoLancamento, int duracaoMinutos) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracaoMinutos = duracaoMinutos;
    }

    protected void exibeFichaTecnica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Lançamento: " + this.anoLancamento);
        System.out.println("Duração: " + this.duracaoMinutos + " minutos");
        System.out.println("Nota: " + mediaDeAvaliacoes());
        System.out.println("Avaliações: " + this.totalAvaliacoes);
    }

    protected void avalia(double avaliacao) {
        this.somaAvaliacoes += avaliacao;
        this.totalAvaliacoes++;
    }

    private String mediaDeAvaliacoes() {
        final DecimalFormat df = new DecimalFormat("0.0");
        return df.format(this.somaAvaliacoes / totalAvaliacoes);
    }
}
