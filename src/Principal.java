import bt.com.alura.screenmatch.calculadora.CalculadoraTempo;
import bt.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import bt.com.alura.screenmatch.modelos.Filme;
import bt.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        minhaSerie.setNome("Peaky Blnders");
        minhaSerie.setAnoDeLancamento(2018);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosTemporada(10);
        minhaSerie.setMinutosEpisodio(50);
        System.out.println("Duração para maratonar a série: " +minhaSerie.getDuracaoEmMinutos());

        CalculadoraTempo calculo = new CalculadoraTempo();
        calculo.inclui(meuFilme);
        System.out.println(calculo.getTotalTemp());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
    }
}