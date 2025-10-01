import javax.swing.JOptionPane;

public class CalculadoraCientifica extends Calculadora{
    
    CalculadoraCientifica(){
        this.modelo = "XF991";
    }
    
    @Override
    public void mensagem(){
    JOptionPane.showMessageDialog(null, "modelo é: " + modelo);
    }
}
