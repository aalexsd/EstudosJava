import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Top Gun Maverick");
        filme1.setAnoDeLancamento(2022);
        filme1.setDuracaoEmMinutos(120);

        Filme filme2 = new Filme();
        filme2.setNome("Questão de Tempo");
        filme2.setAnoDeLancamento(2015);
        filme2.setDuracaoEmMinutos(100);

        filme1.exibeFichaTecnica();
        filme1.avalia(9.5);
        filme1.avalia(8.7);
        filme1.avalia(9.8);
        System.out.println(filme1.mediaAvaliacoes());
        System.out.println(filme1.getTotalAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.avalia(10);
        lost.avalia(0);
        lost.setTemporadas(10);
        lost.setEpisodiasPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(200);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        System.out.println(listaDeFilmes);

    }
}