import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimples {
    private JPanel MainPanel;
    private JButton bnt7;
    private JButton bntMultiplicacao;
    private JButton bnt8;
    private JButton bnt9;
    private JButton bntC;
    private JButton bntDividir;
    private JButton bntSubtracao;
    private JButton bntAdicao;
    private JButton bntCalculo;
    private JButton bnt0;
    private JButton bnt4;
    private JButton bnt5;
    private JButton bnt6;
    private JButton bnt1;
    private JButton bnt2;
    private JButton bnt3;
    private JTextField txtPrimeiroNumero;
    private int primeiroValor;
    private int segundoValor;
    private String operacao;

    public CalculadoraSimples() {
        bnt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "1");

            }
        });
        bnt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "2");
            }
        });
        bnt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "3");
            }
        });
        bnt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "4");
            }
        });
        bnt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "5");
            }
        });
        bnt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "6");
            }
        });
        bnt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "7");
            }
        });
        bnt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "8");
            }
        });
        bnt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText(txtPrimeiroNumero.getText() + "9");
            }
        });
        bntDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                primeiroValor = Integer.parseInt(txtPrimeiroNumero.getText());
                operacao = "/";
                txtPrimeiroNumero.setText("");

            }
        });
        bntMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                primeiroValor = Integer.parseInt(txtPrimeiroNumero.getText());
                operacao = "*";
                txtPrimeiroNumero.setText("");

            }
        });
        bntSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                primeiroValor = Integer.parseInt(txtPrimeiroNumero.getText());
                operacao = "-";
                txtPrimeiroNumero.setText("");

            }
        });
        bntAdicao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                primeiroValor = Integer.parseInt(txtPrimeiroNumero.getText());
                operacao = "+";
                txtPrimeiroNumero.setText("");

            }
        });
        bntCalculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundoValor = Integer.parseInt(txtPrimeiroNumero.getText());

                if(operacao.equals("+")){
                    int soma = primeiroValor + segundoValor;
                    txtPrimeiroNumero.setText(String.valueOf(soma));
                }
                if(operacao.equals("*")){
                    int soma = primeiroValor * segundoValor;
                    txtPrimeiroNumero.setText(String.valueOf(soma));
                }
                if(operacao.equals("/")){
                    int soma = primeiroValor / segundoValor;
                    txtPrimeiroNumero.setText(String.valueOf(soma));
                }
                if(operacao.equals("-")){
                    int soma = primeiroValor - segundoValor;
                    txtPrimeiroNumero.setText(String.valueOf(soma));
                }
            }
        });


        bntC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrimeiroNumero.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("CalculadoraSimples");
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().add(new CalculadoraSimples().MainPanel);
        frame.setVisible(true);

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}