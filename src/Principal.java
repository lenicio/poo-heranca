import br.com.zorp.pessoas.Pessoa;
import br.com.zorp.validacoes.Validar;
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Lenício Jr");
        pessoa1.setIdade(27);
        pessoa1.setCpf("96782076055");
        pessoa1.setGenero("Masculino");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getCpf());
        System.out.println(pessoa1.getGenero());

    }
}
