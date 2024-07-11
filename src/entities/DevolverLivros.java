package entities;

import java.util.List;

public class DevolverLivros {

    BancoLivros bancoLivros = new BancoLivros();

    public void devolverLivros(String titulo, String nomeUsuario) {
        List<Livro> livros = bancoLivros.carregarLivrosDoArquivo();

        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo) && livro.getNomeUsuario().equals(nomeUsuario)) {
                livro.setDisponivel(true);
                break;
            }
        }

        bancoLivros.atualizarArquivo(livros);
    }
}
