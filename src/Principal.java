import br.com.zorp.pessoas.Aluno;
import br.com.zorp.pessoas.Professor;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();

        aluno1.setNome("Kethellyn");
        aluno1.setCpf("15023368041");
        aluno1.setGenero("Feminino");
        aluno1.setIdade(18);
        aluno1.setMatricula("2321010");

        professor1.setNome("Lenício Jr");
        professor1.setCpf("01530001471");
        professor1.setGenero("Maculino");
        professor1.setIdade(27);
        professor1.setDepartamento("Computação");



        aluno1.apresentar();
        professor1.apresentar();


    }
}
