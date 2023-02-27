import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        int numero1 = 0;
        int numero2 = 0;


        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 1: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número 2: "));

        int soma = numero1 + numero2;
        int multi = numero1 * numero2;
        int div = numero1 / numero2;

        JOptionPane.showMessageDialog(null,"A soma dos números é: " +soma);
        JOptionPane.showMessageDialog(null, "A multiplicação dos números é: " +multi);
        JOptionPane.showMessageDialog(null, "A divisão dos números é: " +div);
    }
}