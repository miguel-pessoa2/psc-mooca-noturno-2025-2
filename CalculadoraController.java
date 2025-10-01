import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class CalculadoraController {
    
    JFrame frame;
    JPanel mainPanel;
    CalculadoraPane calcPanel;
    
    String total = "";
    boolean isFirstType = true;
    String tempStorage = "";

    CalculadoraController(){
        frame = new JFrame();

        mainPanel = new JPanel(new BorderLayout());
        calcPanel = new CalculadoraPane(this);

        mainPanel.add(calcPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
    public void updateDisplay(){
        calcPanel.resultLabel.setText(total);
    }

    public void oneListener(){
        if(isFirstType){
            total = total.concat("1");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("1");
            System.out.println(tempStorage);
            updateDisplay();
        }

    }
    public void twoListener(){
        if(isFirstType){
            total = total.concat("2");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("2");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void threeListener(){
        if(isFirstType){
            total = total.concat("3");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("3");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void fourListener(){
        if(isFirstType){
            total = total.concat("4");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("4");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void fiveListener(){
        if(isFirstType){
            total = total.concat("5");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("5");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void sixListener(){
        if(isFirstType){
            total = total.concat("6");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("6");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void sevenListener(){
        if(isFirstType){
            total = total.concat("7");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("7");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void eightListener(){
        if(isFirstType){
            total = total.concat("8");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("8");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void nineListener(){
        if(isFirstType){
            total = total.concat("9");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("9");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void zeroListener(){
        if(isFirstType){
            total = total.concat("0");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("0");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void dZeroListener(){
        if(isFirstType){
            total = total.concat("00");
            System.out.println(total);
            updateDisplay();
        }
        else{
            tempStorage = tempStorage.concat("00");
            System.out.println(tempStorage);
            updateDisplay();
        }
    }
    public void somaListener(){
        if(isFirstType){
            isFirstType = false;

        }
        else{
            int intTotal = Integer.parseInt(total);
            int intTemp = Integer.parseInt(tempStorage);

            total = Integer.toString(intTotal + intTemp);
            tempStorage = "";

            updateDisplay();
            System.out.println("total: " + total + " temp: " + tempStorage);
        }
    }
    public void subListener(){
        if(isFirstType){
            isFirstType = false;
            
        }
        else{
            int intTotal = Integer.parseInt(total);
            int intTemp = Integer.parseInt(tempStorage);

            total = Integer.toString(intTotal - intTemp);
            tempStorage = "";

            updateDisplay();
            System.out.println("total: " + total + " temp: " + tempStorage);
        }
    }
    public void multListener(){
        if(isFirstType){
            isFirstType = false;
            
        }
        else{
            int intTotal = Integer.parseInt(total);
            int intTemp = Integer.parseInt(tempStorage);

            total = Integer.toString(intTotal * intTemp);
            tempStorage = "";

            updateDisplay();
            System.out.println("total: " + total + " temp: " + tempStorage);
        }
    }
    public void divListener(){
        if(isFirstType){
            isFirstType = false;
            
        }
        else{
            int intTotal = Integer.parseInt(total);
            int intTemp = Integer.parseInt(tempStorage);

            total = Integer.toString(intTotal / intTemp);
            tempStorage = "";

            updateDisplay();
            System.out.println("total: " + total + " temp: " + tempStorage);
        }
    }
}
