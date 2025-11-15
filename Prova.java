import java.util.Date;
package model;

public class Prova {
    private int idProva;
    private Date data;
    private double nota;

    public Prova(int idProva, Date data, double nota) {
        this.idProva = idProva;
        this.data = data;
        this.nota = nota;
    }

    // Getters e Setters
    public int getIdProva() { return idProva; }
    public void setIdProva(int idProva) { this.idProva = idProva; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
}
