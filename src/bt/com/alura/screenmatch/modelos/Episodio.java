package bt.com.alura.screenmatch.modelos;

import bt.com.alura.screenmatch.calculadora.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie Serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return Serie;
    }

    public void setSerie(Serie serie) {
        Serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }


    }
}
