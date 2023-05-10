package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio {
    private String nome;
    private int ano;
    private String album;
    private int duracaoEmSegundos;
    private String autor;
    private String genero;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() >= 2000) {
            return 10;
        } else if (this.getTotalDeReproducoes() >= 500) {
            return 5;
        } else {
            return 2;
        }
    }
}
