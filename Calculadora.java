public class Calculadora {
    
    public static int somar(int valor1, int valor2){
        return valor1 + valor2;
    }

    public static int somar(int ...valores){
        int total = 0;
        for(int valor : valores){
            total += valor;
        }
        return total;
    }

    public static int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }

    public static int multiplcar(int valor1, int valor2){
        return valor1 * valor2;
    }

    public static double dividir(int valor1, int valor2){
        return valor1 / valor2;
    }
    
    public static void main(String[] args) {
        int resultado1 = somar(1, 2, 3, 4, 5);
        int resultado2 = subtrair(10, 3);
        int resultado3 = multiplcar(6, 7);
        double resultado4 = dividir(16, 5);
        System.out.printf("soma: %d | subtração: %d | multiplicação: %d | divisão: %.2f", resultado1, resultado2, resultado3, resultado4);
    }
}
