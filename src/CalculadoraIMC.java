import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC {
    private JPanel panelMain;
    private JTextField txtPeso;
    private JButton btnSomar;
    private JTextField txtAltura;
    private JLabel lblResultado;
    private JLabel lblCategoria;

    public CalculadoraIMC() {

        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double peso = Double.valueOf(txtPeso.getText());
                    double altura = Double.valueOf(txtAltura.getText());

                    if (peso <= 0 || altura <= 0) {
                        lblResultado.setText("Peso e altura devem ser maiores que zero.");
                        return;
                    }
                    double imc = peso / (altura * altura);

                    if (imc < 18.5) {
                        lblCategoria.setText("Baixo peso");
                    } else if (imc < 24.9) {
                        lblCategoria.setText("Peso normal");
                    } else if (imc < 29.9) {
                        lblCategoria.setText("Sobrepeso");
                    } else {
                        lblCategoria.setText("Obesidade");
                    }

                    lblResultado.setText("IMC: " + String.format("%.2f", imc));
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Insira valores numéricos válidos.");
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame tela = new JFrame("Calculadora IMC");
        tela.setContentPane(new CalculadoraIMC().panelMain);
        tela.setVisible(true);
        tela.setSize(300,250);
    }
    }
