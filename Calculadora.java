

public class Calculadora {

    public double somar(double ...valores){
        double total = 0;
        for(double valor : valores){
            total += valor;
        }
        return total;
    }

    public double subtrair(double valor1, double valor2){
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2){
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2){
        return valor1 / valor2;
    }

}
