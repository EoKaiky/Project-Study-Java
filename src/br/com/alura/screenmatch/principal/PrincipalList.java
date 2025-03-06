package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.lang.reflect.Array;
import java.util.*;

public class PrincipalList {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        Filme outroFilme = new Filme("Avatar", 2023);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> TitulosList = new LinkedList<>();
        TitulosList.add(meuFilme);
        TitulosList.add(filmeDoPaulo);
        TitulosList.add(outroFilme);
        TitulosList.add(lost);

        for (Titulo item: TitulosList) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Rafael");
        buscaPorArtista.add("Murillo");
        buscaPorArtista.add("Kaiky");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        TitulosList.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(TitulosList);
    }
}
