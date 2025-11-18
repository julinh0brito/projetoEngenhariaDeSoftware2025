import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int idDisciplina;
    private String nome;
    private int cargaHoraria;
    private List<Turma> turmas = new ArrayList<>();

    // --- Construtores ---
    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(int idDisciplina, String nome, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    // --- Getters e Setters ---
    public int getIdDisciplina() { 
        return idDisciplina; 
    }
    public void setIdDisciplina(int idDisciplina) { 
        this.idDisciplina = idDisciplina;
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria; 
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria; 
    }
    
    public List<Turma> getTurmas() {
        return turmas; 
    }
    public void setTurmas(List<Turma> turmas) { 
        this.turmas = turmas; 
    }
}
