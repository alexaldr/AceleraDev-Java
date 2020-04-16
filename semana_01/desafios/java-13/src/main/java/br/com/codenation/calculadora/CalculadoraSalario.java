package br.com.codenation.calculadora;


public class CalculadoraSalario {

    public long calcularSalarioLiquido(double salarioBase) {
        //Use o Math.round apenas no final do método para arredondar o valor final.
        //Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
        if (salarioBase < 1039 || salarioBase < 0){
            return 0;
        }
        return Math.round(salarioBase - calcularInss(salarioBase) - calcularIRRF(salarioBase));
    }
    //Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
    private double calcularInss(double salarioBase) {
        double salario_inss;
        if (salarioBase <= 1500) {
            salario_inss = salarioBase * 0.08;
        } else if (salarioBase <= 4000) {
            salario_inss = salarioBase * 0.09;
        } else {
            salario_inss = salarioBase * 0.11;
        }
        return salario_inss;
    }

    private double calcularIRRF(double salarioBase) {
        double salario_irrf;
        salarioBase = salarioBase - calcularInss(salarioBase);
        if (salarioBase <= 3000) {
            salario_irrf = 0;
        } else if (salarioBase <= 6000) {
            salario_irrf = salarioBase * 0.075;
        } else {
            salario_irrf = salarioBase * 0.15;
        }
        return salario_irrf;
    }
}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/