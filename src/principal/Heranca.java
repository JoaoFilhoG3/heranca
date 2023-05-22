package principal;

import heranca.Aluno;
import heranca.Funcionario;
import heranca.Pessoa;
import heranca.Professor;

public class Heranca {

    public static void main(String[] args) {
        Pessoa a = new Aluno("João", 26, "M", 1, "Informática");
        Pessoa p = new Professor("Informatica", 500, "João Filho", 26, "M");
        Pessoa f = new Funcionario("Limpeza", true, "Chico", 40, "M");

        
        a.fazerAniversario();
        p.fazerAniversario();
        f.fazerAniversario();
    }

}
