import javax.swing.JOptionPane;
public class Lt_1_Ex_1 {
    public static void main(String args[]){
        int lado,area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
        area = lado * lado;
        JOptionPane.showMessageDialog(null,"A área do quadrado é: " + area);
    }
}
