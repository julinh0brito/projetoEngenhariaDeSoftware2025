import java.util.ArrayList;
import java.util.List;
package model; 


public class Disciplina {
    private int idDisciplina;
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private List<Turma> turmas = new ArrayList<>();

    public Disciplina(int idDisciplina, String nome, String codigo, int cargaHoraria) {
        this.idDisciplina = idDisciplina;
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    // Getters e Setters
    public int getIdDisciplina() { return idDisciplina; }
    public void setIdDisciplina(int idDisciplina) { this.idDisciplina = idDisciplina; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
    public List<Turma> getTurmas() { return turmas; }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}
