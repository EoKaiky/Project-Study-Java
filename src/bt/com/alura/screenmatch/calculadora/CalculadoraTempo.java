package bt.com.alura.screenmatch.calculadora;
import bt.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int totalTemp;

    public int getTotalTemp() {
        return totalTemp;
    }

    public void inclui (Titulo titulo) {
        System.out.println("Adicionar duração em minutos de " +titulo);
        this.totalTemp += titulo.getDuracaoEmMinutos();
    }
}
