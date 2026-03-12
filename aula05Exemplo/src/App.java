public class App {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(20, "12345678910", "Ana");
        Aluno aluno02 = new Aluno(30, "10987654321", "joao");
        Aluno aluno03 = new Aluno(25, "014785203697", "diogo");
        Aluno aluno04 = new Aluno(45, "36985201478", "Larissa");

        Turma turma01 = new Turma(3, "LOO");
        turma01.adicionarAluno(aluno03);
        turma01.adicionarAluno(aluno02);
        turma01.adicionarAluno(aluno01);
        turma01.listarAlunos();
        turma01.adicionarAluno(aluno04);

    }
}
