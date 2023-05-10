package br.com.alura.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void cutir(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

}
