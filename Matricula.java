import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {
    private int idMatricula;
    private Date dataMatricula;
    private String status;
    private Aluno aluno;
    private Turma turma;
    private List<Prova> provas = new ArrayList<>();

    public Matricula(int idMatricula, Date dataMatricula, String status, Aluno aluno, Turma turma) {
        this.idMatricula = idMatricula;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.aluno = aluno;
        this.turma = turma;
        aluno.adicionarMatricula(this);
        turma.adicionarMatricula(this);
    }

    // Getters e Setters
    public int getIdMatricula() { return idMatricula; }
    public void setIdMatricula(int idMatricula) { this.idMatricula = idMatricula; }
    public Date getDataMatricula() { return dataMatricula; }
    public void setDataMatricula(Date dataMatricula) { this.dataMatricula = dataMatricula; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Aluno getAluno() { return aluno; }
    public Turma getTurma() { return turma; }
    public List<Prova> getProvas() { return provas; }

    public void adicionarProva(Prova prova) {
        if ("ativa".equalsIgnoreCase(status)) {
            provas.add(prova);
        } else {
            throw new IllegalStateException("Matrícula não está ativa.");
        }
    }
}
