package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalList {
    public static void main(String[] args){
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        Filme outroFilme = new Filme("Avatar", 2023);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> TitulosList = new ArrayList<>();
        TitulosList.add(meuFilme);
        TitulosList.add(filmeDoPaulo);
        TitulosList.add(outroFilme);
        TitulosList.add(lost);

        for (Titulo item: TitulosList){
            System.out.println(item);
        }
    }
}
