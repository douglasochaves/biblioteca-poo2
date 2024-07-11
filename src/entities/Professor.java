package entities;

import java.util.List;

public class Professor implements TipoUsuario {

    private Historico historico;

    @Override
    public Integer quantidadeHistorico(String usuario) {
        List<Emprestimo> emprestimos = historico.carregaHistorico();
        Integer resultado = 0;

        for(Emprestimo emprestimo : emprestimos) {
            if(emprestimo.getNome().equals(usuario)){
                resultado += 1;
            }
        }

        return resultado;
    }
}
