
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;
import java.sql.*;

public class ConversorDeTemperatura {

    public static void criarTela(){

        JFrame tela = new JFrame("Conversor de temperatura");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JLabel resultadoLabel = new JLabel("Resultado");

        JButton converterButton = new JButton("Converter");
        converterButton.addActionListener(e -> {

            String SQL = "INSERT INTO teste VALUES (?, ?, ?)";
            String USER = "root";
            String PASSWORD = "anima123";
            String URL = "jdbc:mysql://localhost:3306/meu_db";

            try(
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(SQL);
            )
            {
                ps.setInt(1, 123);
                ps.setString(2, "Miguel");
                ps.setInt(3, 18);
                int linhasAfetadas = ps.executeUpdate();

                if(linhasAfetadas > 0){
                    System.out.println("Total de linhas afetadas: " + linhasAfetadas);
                }
                else{
                    System.out.println("Nenhuma linha foi inserida");
                }
                
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        });

        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2, 2, 4, 4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(converterButton);
        painelDeConteudo.add(resultadoLabel);

        tela.pack();
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> criarTela());
    }
}

/*
            try{
 
                double celsius = Double.parseDouble(celsiusTextField.getText());
                double fahrenheit = celsius / 5 * 9 + 32;
                resultadoLabel.setText(String.format("%.2f\u00B0F", fahrenheit));
            }
            catch(NumberFormatException w){
                resultadoLabel.setText("Inválido");

            }
*/