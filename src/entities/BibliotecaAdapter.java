package entities;

import java.util.List;

public interface BibliotecaAdapter {

    List<Livro> buscaPorTitulo(String titulo);
    List<Livro> buscaPorAutor(String autor);
    List<Livro> buscaPorCategoria(String categoria);

}
