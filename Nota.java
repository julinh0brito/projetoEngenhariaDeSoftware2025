package model; 

public class Nota {
    private double valor;
    private Matricula matricula;
    private Prova prova;

    // --- Construtores ---
    public Nota(double valor) {
        this.valor = valor;
    }

    public Nota(double valor, Matricula matricula, Prova prova) {
        this.valor = valor;
        this.matricula = matricula;
        this.prova = prova;
        if (matricula != null) matricula.adicionarNota(this);
    }

    // --- Getters e Setters ---
    public double getValor() {
      return valor; 
    }
    public void setValor(double valor) {
      this.valor = valor; 
    }

    public Matricula getMatricula() { 
      return matricula;
    }
    public void setMatricula(Matricula matricula) {
      this.matricula = matricula; 
    }

    public Prova getProva() { 
      return prova; 
    }
    public void setProva(Prova prova) {
      this.prova = prova; 
    }
}
