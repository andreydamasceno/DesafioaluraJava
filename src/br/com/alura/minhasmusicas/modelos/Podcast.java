package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador(String andrey) {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    private int duracaoEmMinutos;

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 100){
            return 10;
        } else if (this.getTotalCurtidas() >= 50) {
            return 5;
        } else {
            return 2;
        }
     }
}
