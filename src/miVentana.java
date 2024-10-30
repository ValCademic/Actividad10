import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class miVentana extends JFrame {
    double total;
    private JPanel miPanel;
    private JTextField cajaCalcula;
    private JButton sumarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JButton restarButton;
    private JButton resultadoButton;
    private JTextField textNum1;
    private JTextField textNum2;

    public miVentana() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textNum1.getText());
                double num2 = Double.parseDouble(textNum2.getText());
                total=num1+num2;
                JOptionPane.showMessageDialog(miPanel,"Resultado: "+total);
            }
        });
        sumarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sumarButton.setBackground(Color.DARK_GRAY);
            }
        });
        sumarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                sumarButton.setBackground(Color.WHITE);
            }
        });

        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textNum1.getText());
                double num2 = Double.parseDouble(textNum2.getText());
                total=num1-num2;
                JOptionPane.showMessageDialog(miPanel,"Resultado: "+total);
            }
        });
        restarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            restarButton.setBackground(Color.DARK_GRAY);
        }
    });
        restarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseExited(MouseEvent e) {
            restarButton.setBackground(Color.WHITE);
        }
    });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textNum1.getText());
                double num2 = Double.parseDouble(textNum2.getText());
                total=num1/num2;
                JOptionPane.showMessageDialog(miPanel,"Resultado: "+total);
            }
        });
    dividirButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            dividirButton.setBackground(Color.DARK_GRAY);
        }
    });
        dividirButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseExited(MouseEvent e) {
            dividirButton.setBackground(Color.WHITE);
        }
    });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(textNum1.getText());
                double num2 = Double.parseDouble(textNum2.getText());
                total=num1*num2;
                JOptionPane.showMessageDialog(miPanel,"Resultado: "+total);
            }
        });

        multiplicarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            multiplicarButton.setBackground(Color.DARK_GRAY);
        }
    });
        multiplicarButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseExited(MouseEvent e) {
            multiplicarButton.setBackground(Color.WHITE);
        }
    });
}

    public static void main(String[] args){
        miVentana v = new miVentana();
        v.setContentPane(v.miPanel);
        v.setSize(350,200);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
