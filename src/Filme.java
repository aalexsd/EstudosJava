public class Filme {
    String nome;
    int anoDeLancamento;
    boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    void exibeFichaTecnica (){
        System.out.println("Nome do Filme: "+ nome);
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
    }

    void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes += 1;
    }

    double mediaAvaliacoes (){
        return somaDasAvaliacoes/totalAvaliacoes;
    }
}
