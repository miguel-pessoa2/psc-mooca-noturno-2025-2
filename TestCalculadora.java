import javax.swing.JOptionPane;

public class TestCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Calculadora cc = new CalculadoraCientifica();
        
        int op = 0;
        int modelo = 0;

        double valor1;
        double valor2;
        double resultado;

        // Obtém o tipo de operação e os valores

        try{
            modelo = Integer.parseInt(JOptionPane.showInputDialog("Escolha um modelo de calculadora: \n1 - normal\n2 - cientifica"));
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ESCOLHA INVÁLIDA!");
            JOptionPane.showMessageDialog(null, "ENCERRANDO PROGRAMA...");
            return;
        }

        try{
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação:\n1-soma \n2-subtração \n3-multiplicação \n4-divisao"));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ESCOLHA INVÁLIDA!");
            JOptionPane.showMessageDialog(null, "ENCERRANDO PROGRAMA...");
            return;
        }
        
        try{
            valor1 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro valor"));
            valor2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha o primeiro valor"));
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "ESCOLHA INVÁLIDA!");
            JOptionPane.showMessageDialog(null, "ENCERRANDO PROGRAMA...");
            return;

        }

        switch(op){
            case 1 -> resultado = calc.somar(valor1, valor2);
            case 2 -> resultado = calc.subtrair(valor1, valor2);
            case 3 -> resultado = calc.multiplicar(valor1, valor2);
            case 4 -> resultado = calc.dividir(valor1, valor2);
            default -> resultado = 0;

        }

        JOptionPane.showMessageDialog(null, "Resultado: \n" + resultado + "\nmodelo da calculadora: " + getModeloResponse(modelo));
    }

    public static String getModeloResponse(int modelo){
        if(modelo == 1){
            return "normal";

        }
        else if(modelo == 2){
            return "científica";

        }else{
            return "não identificado";
        }

    }
}