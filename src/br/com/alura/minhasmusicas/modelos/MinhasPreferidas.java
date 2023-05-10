package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){

        if(audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + " preferido por todos!");
        } else if (audio.getClassificacao() >= 5) {
            System.out.println(audio.getTitulo() + " é bastante ouvido.");
        } else {
            System.out.println(audio.getTitulo() + " tem puca procura.");
        }
    }
}
