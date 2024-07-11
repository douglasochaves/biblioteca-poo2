package entities;

import java.util.List;

public class BibliotecaFacade {

    BibliotecaAdapter buscaLivros = new BuscaLivros();
    EmprestaLivros emprestaLivros = new EmprestaLivros();

    public List<Livro> buscarLivro(String busca, Integer tipoBusca) {
        switch (tipoBusca){
            case 1:
                return buscaLivros.buscaPorTitulo(busca);
            case 2:
                return buscaLivros.buscaPorAutor(busca);
            case 3:
                return buscaLivros.buscaPorCategoria(busca);
            default:
                return null;
        }
    }

    public void emprestarLivro(String livro) {
        emprestaLivros.emprestarLivros(livro);
    }

    public void devolverLivro(String livro){

    }
}
