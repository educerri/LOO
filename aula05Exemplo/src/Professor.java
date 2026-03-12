public class Professor extends PessoaFisica {
    private String formacao;
    private String numeroRegistro;

    public Professor(int idade, String cpf, String nome, String formacao, String numeroRegistro) {
        super(idade, cpf, nome);
        this.formacao = formacao;
        this.numeroRegistro = numeroRegistro;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    // Implementação do método abstrato da classe PessoaFisica
    @Override
    public String getIdentificacao() {
        return getNumeroRegistro(); // Retorna o número de registro como identificação
    }

    @Override
    public String toString() {
        return "Professor{" +
               "idade=" + getIdade() +
               ", cpf='" + getCpf() + '\'' +
               ", nome='" + getNome() + '\'' +
               ", formacao='" + formacao + '\'' +
               ", numeroRegistro='" + numeroRegistro + '\'' +
               '}';
    }
    
}
