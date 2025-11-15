import java.util.ArrayList;
import java.util.List;
package model;

public class Aluno {
    private int idAluno;
    private String nome;
    private String matricula;
    private String email;
    private List<Matricula> matriculas = new ArrayList<>();
    public Aluno(int idAluno, String nome, String matricula, String email) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    // Getters e Setters
    public int getIdAluno() { return idAluno; }
    public void setIdAluno(int idAluno) { this.idAluno = idAluno; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public List<Matricula> getMatriculas() { return matriculas; }
    public void adicionarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
}
