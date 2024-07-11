package entities;

import java.util.ArrayList;
import java.util.List;

public class BuscaLivros extends BancoLivros implements BibliotecaAdapter{

    @Override
    public List<Livro> buscaPorTitulo(String titulo) {
        List<Livro> resultado = new ArrayList<>();
        List<Livro> livros = carregarLivrosDoArquivo();

        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                resultado.add(livro);
            }
        }

        return resultado;
    }

    @Override
    public List<Livro> buscaPorAutor(String autor) {
        List<Livro> resultado = new ArrayList<>();
        List<Livro> livros = carregarLivrosDoArquivo();

        for (Livro livro : livros) {
            if (livro.getAutor().equals(autor)) {
                resultado.add(livro);
            }
        }

        return resultado;
    }

    @Override
    public List<Livro> buscaPorCategoria(String categoria) {
        List<Livro> resultado = new ArrayList<>();
        List<Livro> livros = carregarLivrosDoArquivo();

        for (Livro livro : livros) {
            if (livro.getCategoria().equals(categoria)) {
                resultado.add(livro);
            }
        }

        return resultado;
    }
}
