package br.com.zorp.pessoas;

public class Professor extends Pessoa {
    String departamento;


    @Override
    public void apresentar() {
        System.out.printf("""
                *************************************************
                Nome: %s
                Idade: %d
                CPF: %s
                Genero: %s
                Departamento: %s
                *************************************************
                """, this.nome, this.idade, this.cpf, this.genero, this.departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento.isEmpty()) {
            throw new IllegalArgumentException("O departamento não pode ser nulo!");
        }

        this.departamento = departamento;
    }
}
