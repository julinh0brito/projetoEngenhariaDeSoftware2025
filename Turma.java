import java.util.ArrayList;
import java.util.List;
package model; 

public class Turma {
    private int idTurma;
    private String periodo;
    private String sala;
    private String horario;
    private Professor professor;
    private List<Matricula> matriculas = new ArrayList<>();

    public Turma(int idTurma, String periodo, String sala, String horario) {
        this.idTurma = idTurma;
        this.periodo = periodo;
        this.sala = sala;
        this.horario = horario;
    }

    // Getters e Setters
    public int getIdTurma() { return idTurma; }
    public void setIdTurma(int idTurma) { this.idTurma = idTurma; }
    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }
    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
    public List<Matricula> getMatriculas() { return matriculas; }

    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
}
