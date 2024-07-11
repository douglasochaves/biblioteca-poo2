package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmprestaLivros {

    BancoLivros bancoLivros = new BancoLivros();

    public void emprestarLivros(String titulo) {
        List<Livro> livros = bancoLivros.carregarLivrosDoArquivo();

        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)) {
                livro.setDisponivel(false);
                break;
            }
        }

        bancoLivros.atualizarArquivo(livros);
    }
}
