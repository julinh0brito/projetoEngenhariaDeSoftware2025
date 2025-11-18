import java.util.Date;
package model;

public class Prova {
    private int idProva;
    private String titulo;
    private Date dataAplicacao;
    private String situacao;
    
    private Turma turma;

    // --- Construtores ---
    // 1. Cadastro
    public Prova(Turma turma, String titulo, Date dataAplicacao) {
        this.turma = turma;
        this.titulo = titulo;
        this.dataAplicacao = dataAplicacao;
        this.situacao = "Agendada";
    }

    // 2. Completo
    public Prova(int idProva, Turma turma, String titulo, Date dataAplicacao, String situacao) {
        this.idProva = idProva;
        this.turma = turma;
        this.titulo = titulo;
        this.dataAplicacao = dataAplicacao;
        this.situacao = situacao;
    }

    // --- Lógica de Negócio ---
    public void aplicarProva() {
        if ("Agendada".equals(this.situacao)) this.situacao = "Aplicada";
    }

    public void lancarTodasAsNotas() {
        if ("Aplicada".equals(this.situacao)) this.situacao = "Corrigida";
    }

    public void divulgarNotas() {
        if ("Corrigida".equals(this.situacao)) this.situacao = "Divulgada";
    }

    public void cancelarProva() {
        if (!"Divulgada".equals(this.situacao)) this.situacao = "Cancelada";
    }

    // --- Getters e Setters ---
    public int getIdProva() { 
        return idProva;
    }
    public void setIdProva(int idProva) {
        this.idProva = idProva; 
    }

    public String getTitulo() { 
        return titulo;
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    public Date getDataAplicacao() {
        return dataAplicacao; 
    }
    public void setDataAplicacao(Date dataAplicacao) { 
        this.dataAplicacao = dataAplicacao;
    }

    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma; 
    }
}
