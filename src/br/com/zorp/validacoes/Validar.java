package br.com.zorp.validacoes;

public class Validar {

    public static boolean validarCPF(String cpf) {
        // Remove pontos e traços do CPF
        cpf = cpf.replace(".", "").replace("-", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais, o que é um CPF inválido
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int firstCheckDigit = 11 - (sum % 11);
        firstCheckDigit = (firstCheckDigit > 9) ? 0 : firstCheckDigit;

        // Calcula o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int secondCheckDigit = 11 - (sum % 11);
        secondCheckDigit = (secondCheckDigit > 9) ? 0 : secondCheckDigit;

        // Verifica se os dígitos calculados são iguais aos dígitos informados
        return (firstCheckDigit == Character.getNumericValue(cpf.charAt(9))
                && secondCheckDigit == Character.getNumericValue(cpf.charAt(10)));
    }
}