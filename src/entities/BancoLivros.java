package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BancoLivros {

    public List<Livro> carregarLivrosDoArquivo() {
        List<Livro> livros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("livros.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String id = dados[0].trim();
                String titulo = dados[1].trim();
                String autor = dados[2].trim();
                String categoria = dados[3].trim();
                boolean disponivel = Boolean.parseBoolean(dados[4].trim());
                String nomeUsuario = dados[5].trim();

                Livro livro = new Livro(id, titulo, autor, categoria, disponivel, nomeUsuario);
                livros.add(livro);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return livros;
    }

    public void atualizarArquivo(List<Livro> livros) {
        try (FileWriter writer = new FileWriter("livros.txt")) {
            for (Livro livro : livros) {
                writer.write(livro.getId() + ";" +
                        livro.getTitulo() + ";" +
                        livro.getAutor() + ";" +
                        livro.getCategoria() + ";" +
                        livro.getDisponivel() + ";" +
                        livro.getNomeUsuario() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
