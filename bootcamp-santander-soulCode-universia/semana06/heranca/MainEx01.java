package semana06.heranca;

public class MainEx01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Smith", 40, "Matemática");
        Estudante estudante = new Estudante("Alice", 20, "Engenharia");

        System.out.println(professor.getNome() + " ensina " + professor.getDisciplina());
        System.out.println(estudante.getNome() + " estuda " + estudante.getCurso());
    }
}

