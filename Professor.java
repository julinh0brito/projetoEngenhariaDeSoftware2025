import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int idProfessor;
    private String nome;
    private String departamento;
    private List<Turma> turmas = new ArrayList<>();

    // --- Construtores ---
    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public Professor(int idProfessor, String nome, String departamento) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.departamento = departamento;
    }

    // --- Getters e Setters ---
    public int getIdProfessor() {
        return idProfessor; 
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getDepartamento() { 
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public List<Turma> getTurmas() { 
        return turmas;
    }
    public void setTurmas(List<Turma> turmas) { 
        this.turmas = turmas; 
    }
}
