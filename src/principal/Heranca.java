package principal;

import heranca.Aluno;
import heranca.Funcionario;
import heranca.Professor;

public class Heranca {

    public static void main(String[] args) {
        Aluno a = new Aluno("João", 26, "M", 1, "Informática");
        Professor p = new Professor("Informatica", 500, "João Filho", 26, "M");
        Funcionario f = new Funcionario("Limpeza", true, "Chico", 40, "M");
        
        a.fazerAniversario();
        p.fazerAniversario();
        f.fazerAniversario();
    }
    
}
