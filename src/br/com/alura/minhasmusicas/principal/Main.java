package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        Podcast meuPodcast = new Podcast();
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhaMusica.setTitulo("Over and over");
        minhaMusica.setAutor("Black Sabbath");
        minhaMusica.setGenero("Heavy Metal");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.cutir();
        }

        meuPodcast.setApresentador("Andrey");
        meuPodcast.setTitulo("podcast");

        for (int i = 0; i < 100; i++){
            meuPodcast.cutir();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }

        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);
    }
}
