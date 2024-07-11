package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Historico {

    public List<Emprestimo> carregaHistorico() {
        List<Emprestimo> emprestimos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("historico.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                String nome = dados[0].trim();
                String livro = dados[1].trim();

                Emprestimo emprestimo = new Emprestimo(nome, livro);
                emprestimos.add(emprestimo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return emprestimos;
    }
}
