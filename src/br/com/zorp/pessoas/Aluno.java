package br.com.zorp.pessoas;

public class Aluno extends Pessoa {
    String matricula;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula.isEmpty()) {
            throw new IllegalArgumentException("O campo matrícula não pode ser nulo!");
        }

        this.matricula = matricula;
    }
}

// Crie uma classe Professor, que extenda de Pessoa, onde o mesmo tenha o atributo departamento.
// Implemente os métodos getters e setters.
