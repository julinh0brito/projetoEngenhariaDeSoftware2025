package controller;
import java.util.Date;

public class CtrlPrograma {
    public static void main(String[] args) {
        // 1. Instâncias Básicas (Cadastros)
        // Aluno agora pede CPF no construtor completo
        Aluno aluno = new Aluno(1, "2024001", "Ana Silva", "123.456.789-00", "ana@email.com");
        
        Professor professor = new Professor(1, "Prof. João", "Engenharia");
        
        // Disciplina (construtor atualizado conforme sua classe)
        Disciplina disciplina = new Disciplina(1, "Banco de Dados", 60);

        // --------------------------------------------------------------------
        
        // 2. Criar a Turma (Fluxo: Planejada -> Aberta -> EmAndamento)
        // Agora passamos a capacidade (ex: 40 alunos) e as referências de objeto
        Turma turma = new Turma(1, disciplina, professor, "2025/1", "Sala 202", "Ter-Qui 10h", 40);
        
        // Simulação de mudança de estado da Turma para permitir matrículas
        System.out.println("Estado inicial da turma: " + turma.getSituacao()); // Planejada
        turma.abrirInscricoes(); 
        System.out.println("Estado após abrir: " + turma.getSituacao()); // Aberta

        // --------------------------------------------------------------------

        // 3. Realizar Matrícula (Fluxo: Pendente -> Ativa)
        // O construtor verifica se a turma tem vaga (método temVaga)
        try {
            Matricula matricula = new Matricula(aluno, turma);
            
            System.out.println("Situação Matrícula: " + matricula.getSituacao()); // Pendente
            matricula.confirmar(); // Confirmar matrícula conforme diagrama de estado
            System.out.println("Situação Matrícula pós-confirmação: " + matricula.getSituacao()); // Ativa

        } catch (Exception e) {
            System.out.println("Erro ao matricular: " + e.getMessage());
            return; // Para o programa se der erro
        }

        // 4. Iniciar as aulas (Turma vai para EmAndamento)
        turma.iniciarAulas();

        // --------------------------------------------------------------------

        // 5. Criar e Aplicar Prova (Fluxo: Agendada -> Aplicada -> Corrigida)
        // A nota NÃO é passada aqui. A prova é apenas o evento.
        Prova prova1 = new Prova(turma, "Prova 1 - SQL", new Date());
        
        prova1.aplicarProva();       // Muda estado para Aplicada
        prova1.lancarTodasAsNotas(); // Muda estado para Corrigida

        // --------------------------------------------------------------------

        // 6. Lançar a Nota do Aluno (Nova Classe!)
        // Aqui recuperamos a matrícula que criamos (ou buscamos na lista da turma)
        // Supondo que pegamos a matrícula da Ana:
        Matricula matriculaAna = aluno.getMatriculas().get(0);
        
        // Criamos o objeto Nota associando a Matrícula à Prova
        Nota notaAna = new Nota(9.0, matriculaAna, prova1);

        // --------------------------------------------------------------------

        // 7. Exibição dos Resultados Atualizados
        System.out.println("\n=== RELATÓRIO FINAL ===");
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Curso/Disciplina: " + turma.getDisciplina().getNome());
        System.out.println("Professor: " + turma.getProfessor().getNome());
        System.out.println("Turma (Situação): " + turma.getSituacao());
        
        // Para pegar a nota, acessamos a lista de notas da matrícula
        // Como só adicionamos uma, pegamos a get(0)
        if (!matriculaAna.getNotas().isEmpty()) {
            Nota n = matriculaAna.getNotas().get(0);
            System.out.println("Prova: " + n.getProva().getTitulo());
            System.out.println("Nota Obtida: " + n.getValor());
        }
    }
}
