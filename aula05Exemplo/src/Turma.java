public class Turma {
    private Aluno[] alunos;
    private Professor professor;
    private int quantidadeAlunos;
    private String nome;

    public Turma(int tamanhoMaximo, String nome) {
        alunos = new Aluno[tamanhoMaximo];
        quantidadeAlunos = 0;
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void listarAlunos() {
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Posição do Array ["+ i +"]" + alunos[i].getNome());
        }
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            int anoAtual = java.time.Year.now().getValue();
            String novoRga = nome + "/" + anoAtual + "-" + aluno.getCpf();
            aluno.matricular(novoRga);
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("A turma já está cheia.");
        }
    }
}

