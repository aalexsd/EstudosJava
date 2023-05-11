package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiasPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiasPorTemporada() {
        return episodiasPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiasPorTemporada(int episodiasPorTemporada) {
        this.episodiasPorTemporada = episodiasPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas*episodiasPorTemporada*minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return (int )mediaAvaliacoes() / 2;
    }
}
