import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int idAluno;
    private String matricula;
    private String nome;
    private String cpf;
    private String email;
    
    private List<Matricula> matriculas = new ArrayList<>();

    // --- Construtores ---
    // 1. Básico
    public Aluno(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // 2. Completo
    public Aluno(int idAluno, String matricula, String nome, String cpf, String email) {
        this.idAluno = idAluno;
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    // --- Métodos de Apoio ---
    public void adicionarMatricula(Matricula m) {
        this.matriculas.add(m);
    }

    // --- Getters e Setters ---
    public int getIdAluno() {
        return idAluno; 
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome;
    }

    public String getCpf() {
        return cpf; 
    }
    public void setCpf(String cpf) {
        this.cpf = cpf; 
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email; 
    }

    public List<Matricula> getMatriculas() { 
        return matriculas;
    }
    public void setMatriculas(List<Matricula> matriculas) { 
        this.matriculas = matriculas;
    }
}
