package Lote1.Estrutura_Sequencial;
import javax.swing.JOptionPane;

//4.	Receba a temperatura em graus Celsius. 
// Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

public class Lt_1_Ex_4 {
    public static void main(String[] args) {
        int tempC, tempF;
        double conversao;

        tempC = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        conversao = (9 * tempC + 160) / 5;
        tempF = (int) conversao;
        JOptionPane.showMessageDialog(null, tempC + "°C em Fahrenheit é: " + tempF + "°F");
    }
}
