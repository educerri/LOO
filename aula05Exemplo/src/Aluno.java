public class Aluno extends PessoaFisica implements IMatriculaval{
    private String rga;
    private boolean matriculado;

    public Aluno(int idade, String cpf, String nome) {
        super(idade, cpf, nome);
        this.rga = null;
        this.matriculado = false;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    // Implementação do método abstrato da classe PessoaFisica
    @Override
    public String getIdentificacao() {
        return getCpf(); // Retorna o CPF como identificação
    }

    @Override
    public String toString() {
        return "Aluno{" +
               "idade=" + getIdade() +
               ", cpf='" + getCpf() + '\'' +
               ", nome='" + getNome() + '\'' +
               ", rga='" + rga + '\'' +
               '}';
    }

    @Override
    public void matricular(String rga){
        setRga(null);
        setMatriculado(false);
    }

    @Override
    public void cancelarMatricula() {
        this.matriculado = false;
        this.rga = null;
}
}

