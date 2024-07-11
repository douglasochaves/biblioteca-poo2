package entities;

public abstract class Usuario {

    private String codigo;

    private String nome;

    private String idade;

    private TipoUsuario tipoUsuario;

    public Usuario(String codigo, String nome, String idade, TipoUsuario tipoUsuario) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.tipoUsuario = tipoUsuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public abstract Integer quantidadeHistorico(String usuario);
}
