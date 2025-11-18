import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {
    private int idMatricula;
    private Date dataMatricula;
    private String situacao;
    
    private Aluno aluno;
    private Turma turma;
    private List<Nota> notas = new ArrayList<>();

    // --- Construtores ---
    // 1. Nova Matrícula
    public Matricula(Aluno aluno, Turma turma) {
        this.aluno = aluno;
        this.turma = turma;
        this.dataMatricula = new Date();
        this.situacao = "Pendente";
        
        aluno.adicionarMatricula(this);
        turma.adicionarMatricula(this);
    }

    // 2. Carregamento Completo
    public Matricula(int idMatricula, Aluno aluno, Turma turma, Date data, String situacao) {
        this.idMatricula = idMatricula;
        this.aluno = aluno;
        this.turma = turma;
        this.dataMatricula = data;
        this.situacao = situacao;
    }

    // --- Lógica de Negócio (Máquina de Estados) ---
    public void confirmar() {
        if ("Pendente".equals(this.situacao)) this.situacao = "Ativa";
    }

    public void trancar() {
        if ("Ativa".equals(this.situacao)) this.situacao = "Trancada";
    }

    public void destrancar() {
        if ("Trancada".equals(this.situacao)) this.situacao = "Ativa";
    }

    public void finalizarSemestre() {
        if ("Ativa".equals(this.situacao)) this.situacao = "Concluída";
    }

    public void cancelar() {
        if (!"Concluída".equals(this.situacao) && !"Cancelada".equals(this.situacao)) {
            this.situacao = "Cancelada";
        }
    }

    public void adicionarNota(Nota nota) {
        this.notas.add(nota);
    }
    
    // --- Getters e Setters ---
    public int getIdMatricula() {
        return idMatricula; 
    }
    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula; 
    }

    public Date getDataMatricula() { 
        return dataMatricula; 
    }
    public void setDataMatricula(Date dataMatricula) { 
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() { 
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma; 
    }

    public List<Nota> getNotas() {
        return notas; 
    }
    public void setNotas(List<Nota> notas) { 
        this.notas = notas;
    }
}
