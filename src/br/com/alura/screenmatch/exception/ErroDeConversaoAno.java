package br.com.alura.screenmatch.exception;

public class ErroDeConversaoAno extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoAno(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
