import bt.com.alura.screenmatch.calculadora.CalculadoraTempo;
import bt.com.alura.screenmatch.calculadora.FiltroRecomendacao;
import bt.com.alura.screenmatch.modelos.Episodio;
import bt.com.alura.screenmatch.modelos.Filme;
import bt.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão");
        Serie nomeSerie = new Serie();
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        nomeSerie.setNome("Peaky Blnders");
        nomeSerie.setAnoDeLancamento(2018);
        nomeSerie.exibeFichaTecnica();
        nomeSerie.setTemporadas(10);
        nomeSerie.setEpisodiosTemporada(10);
        nomeSerie.setMinutosEpisodio(50);
        System.out.println("Duração para maratonar a série: " +nomeSerie.getDuracaoEmMinutos());

        CalculadoraTempo calculo = new CalculadoraTempo();
        calculo.inclui(meuFilme);
        System.out.println(calculo.getTotalTemp());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(nomeSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville");
        //filmeDoPaulo.setNome("DogVille");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);

        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do " + listaDeFilmes.get(0).toString());


    }
}