package br.com.zorp.pessoas;
import br.com.zorp.validacoes.Validar;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O campo nome não pode estar vazio!");
        }

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade precisa ser maior que 0! ");
        }

        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty()) {
            throw new IllegalArgumentException("O campo CPF não pode estar vazio!");
        }

        if (!Validar.validarCPF(cpf)) {
            throw new IllegalArgumentException("O CPF precisa ser válido!");
        }

        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero.isEmpty()) {
            throw new IllegalArgumentException("O gênero não pode estar vazio!");
        }
        this.genero = genero;
    }
}
