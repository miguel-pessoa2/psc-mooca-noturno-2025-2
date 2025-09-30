import javax.swing.JOptionPane;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        int op = 0;

        while(true){
            try{
            
                op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação:\n1-soma \n2-subtração \n3-multiplicação \n4-divisao"));
                if(op < 5 && op > 0){
                    break;
                }
                else{
                    JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!");
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ESCOLHA INVÁLIDA!");
            }
        }

        double valor1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro valor"));
        double valor2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro valor"));

        double resultado;

        switch(op){
            case 1 -> resultado = calc.somar(valor1, valor2);
            case 2 -> resultado = calc.subtrair(valor1, valor2);
            case 3 -> resultado = calc.multiplicar(valor1, valor2);
            case 4 -> resultado = calc.dividir(valor1, valor2);
            default -> resultado = 0;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}