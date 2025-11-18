import java.util.ArrayList;
import java.util.List;

public class Turma {
    
    private int idTurma;
    private String periodo;
    private String sala;
    private String horario;
    private int capacidade;
    private int quantidadeAlunosAtual;
    private String situacao; 

    private Disciplina disciplina;
    private Professor professor;
    private List<Matricula> matriculas = new ArrayList<>();

    // --- Construtores ---
    // 1. Criação
    public Turma(Disciplina disciplina, Professor professor, String periodo, int capacidade) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.periodo = periodo;
        this.capacidade = capacidade;
        this.quantidadeAlunosAtual = 0;
        this.situacao = "Planejada";
    }

    // 2. Completo
    public Turma(int idTurma, Disciplina disciplina, Professor professor, String periodo, String sala, String horario, int capacidade) {
        this.idTurma = idTurma;
        this.disciplina = disciplina;
        this.professor = professor;
        this.periodo = periodo;
        this.sala = sala;
        this.horario = horario;
        this.capacidade = capacidade;
        this.situacao = "Planejada";
    }

    // --- Lógica de Negócio (Diagramas) ---
    public boolean temVaga() {
        return quantidadeAlunosAtual < capacidade;
    }

    public void abrirInscricoes() {
        if ("Planejada".equals(this.situacao)) this.situacao = "Aberta";
    }

    public void iniciarAulas() {
        if ("Aberta".equals(this.situacao)) this.situacao = "EmAndamento";
    }

    public void encerrarSemestre() {
        if ("EmAndamento".equals(this.situacao)) this.situacao = "Finalizada";
    }

    public void cancelarTurma() {
        if (!"Finalizada".equals(this.situacao)) this.situacao = "Cancelada";
    }

    public void adicionarMatricula(Matricula m) {
        if (temVaga()) {
            matriculas.add(m);
            this.quantidadeAlunosAtual++;
        } else {
            throw new IllegalStateException("Turma lotada.");
        }
    }

    // --- Getters e Setters ---
    public int getIdTurma() {
        return idTurma; 
    }
    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma; 
    }

    public String getPeriodo() {
        return periodo; 
    }
    public void setPeriodo(String periodo) { 
        this.periodo = periodo; 
    }

    public String getSala() {
        return sala; 
    }
    public void setSala(String sala) {
        this.sala = sala; 
    }

    public String getHorario() {
        return horario; 
    }
    public void setHorario(String horario) {
        this.horario = horario; 
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade; 
    }

    public int getQuantidadeAlunosAtual() {
        return quantidadeAlunosAtual;
    }
    // Geralmente atualizado via adicionarMatricula, mas útil para correções manuais
    public void setQuantidadeAlunosAtual(int quantidadeAlunosAtual) {
        this.quantidadeAlunosAtual = quantidadeAlunosAtual; 
    }

    public String getSituacao() { 
        return situacao; 
    }
    public void setSituacao(String situacao) { 
        this.situacao = situacao; 
    }

    public Disciplina getDisciplina() {
        return disciplina; 
    }
    public void setDisciplina(Disciplina disciplina) { 
        this.disciplina = disciplina; 
    }

    public Professor getProfessor() {
        return professor; 
    }
    public void setProfessor(Professor professor) { 
        this.professor = professor; 
    }

    public List<Matricula> getMatriculas() { 
        return matriculas;
    }
    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
