import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculadoraPane extends JPanel{
    private JPanel resultPanel = new JPanel();
    public JLabel resultLabel;

    private JButton addBtn = new JButton("+");
    private JButton subBtn = new JButton("-");
    private JButton multBtn = new JButton("X");
    private JButton divBtn = new JButton("/");
    private JButton oneBtn = new JButton("1");
    private JButton twoBtn = new JButton("2");
    private JButton threeBtn = new JButton("3");
    private JButton fourBtn = new JButton("4");
    private JButton fiveBtn = new JButton("5");
    private JButton sixBtn = new JButton("6");
    private JButton sevenBtn = new JButton("7");
    private JButton eightBtn = new JButton("8");
    private JButton nineBtn = new JButton("9");
    private JButton zeroBtn = new JButton("0");
    private JButton dZeroBtn = new JButton("00");
    private JButton equalsBtn = new JButton("=");

    public CalculadoraPane(CalculadoraController controller){
        setLayout(null);
        setSize(400, 600);


        resultPanel.setBounds(0, 0, 400, 100);
        resultLabel = new JLabel(controller.total);
        resultLabel.setVerticalAlignment(JLabel.CENTER);
        resultLabel.setHorizontalAlignment(JLabel.RIGHT);
        resultPanel.add(resultLabel);

        addBtn.setBounds(300, 100, 100, 100);
        addBtn.addActionListener(e -> controller.somaListener());
        
        subBtn.setBounds(300, 200, 100, 100);
        subBtn.addActionListener(e -> controller.subListener());
        
        multBtn.setBounds(300,  300, 100, 100);
        multBtn.addActionListener(e -> controller.multListener());
        
        divBtn.setBounds(300, 400, 100, 100);
        divBtn.addActionListener(e -> controller.divListener());
        
        oneBtn.setBounds(0, 200, 100, 100);
        oneBtn.addActionListener(e -> controller.oneListener());
        
        twoBtn.setBounds(100, 200, 100, 100);
        twoBtn.addActionListener(e -> controller.twoListener());
        
        threeBtn.setBounds(200, 200, 100, 100);
        threeBtn.addActionListener(e -> controller.threeListener());
        
        fourBtn.setBounds(0, 300, 100, 100);
        fourBtn.addActionListener(e -> controller.fourListener());
        
        fiveBtn.setBounds(100, 300, 100, 100);
        fiveBtn.addActionListener(e -> controller.fiveListener());
        
        sixBtn.setBounds(200, 300, 100, 100);
        sixBtn.addActionListener(e -> controller.sixListener());
        
        sevenBtn.setBounds(0, 400, 100, 100);
        sevenBtn.addActionListener(e -> controller.sevenListener());
        
        eightBtn.setBounds(100, 400, 100, 100);
        eightBtn.addActionListener(e -> controller.eightListener());
        
        nineBtn.setBounds(200, 400, 100, 100);
        nineBtn.addActionListener(e -> controller.nineListener());

        zeroBtn.setBounds(0, 500, 100, 100);
        zeroBtn.addActionListener(e -> controller.zeroListener());

        dZeroBtn.setBounds(100, 500, 200, 100);
        dZeroBtn.addActionListener(e -> controller.dZeroListener());

        equalsBtn.setBounds(300, 500, 100, 100);
        equalsBtn.addActionListener(e -> System.out.println("oi"));

        add(resultPanel);
        add(addBtn);
        add(subBtn);
        add(multBtn);
        add(divBtn);
        add(oneBtn);
        add(twoBtn);
        add(threeBtn);
        add(fourBtn);
        add(fiveBtn);
        add(sixBtn);
        add(sevenBtn);
        add(eightBtn);
        add(nineBtn);
        add(zeroBtn);
        add(dZeroBtn);
        add(equalsBtn);
        
    }

    @Override
    public Dimension getPreferredSize() {
        // Retorna o tamanho que você definiu originalmente com setSize(400, 600)
        return new Dimension(400, 600);
    }
}   
