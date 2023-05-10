public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Top Gun Maverick";
        filme1.anoDeLancamento = 2022;
        filme1.duracaoEmMinutos = 120;
        filme1.inclusoNoPlano = true;

        filme1.exibeFichaTecnica();
        filme1.avalia(9.5);
        filme1.avalia(8.7);
        filme1.avalia(9.8);
        System.out.println(filme1.mediaAvaliacoes());
        System.out.println(filme1.getTotalAvaliacoes());
    }
}