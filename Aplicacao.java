public class Aplicacao {
    public static void main(String[] args) {
        // Instâncias
        Aluno aluno = new Aluno(1, "Ana Silva", "2024001", "ana@email.com");
        Professor professor = new Professor(1, "Prof. João", "Engenharia");
        Disciplina disciplina = new Disciplina(1, "Banco de Dados", "BD101", 60);
        Turma turma = new Turma(1, "2025/1", "Sala 202", "Ter-Qui 10h-12h");
        disciplina.adicionarTurma(turma);
        professor.adicionarTurma(turma);

        Matricula matricula = new Matricula(1, new Date(), "ativa", aluno, turma);

        Prova prova = new Prova(1, new Date(), 9.0);
        matricula.adicionarProva(prova);

        // Exemplo de saída
        System.out.println("Aluno: " + aluno.getNome() + " matriculado em " + aluno.getMatriculas().size() + " turma(s).");
        System.out.println("Turma ministrada por: " + turma.getProfessor().getNome());
        System.out.println("Nota da prova: " + matricula.getProvas().get(0).getNota());
    }
}
