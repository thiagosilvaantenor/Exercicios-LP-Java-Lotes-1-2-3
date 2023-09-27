import javax.swing.JOptionPane;

public class Lt_2_Ex_3 {
    // 3) Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N)
    public static void main(String args[]) {
        double serie;
        serie = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe um valor"));
        System.out.println(FunctionRecursividadeTres(serie));

    }

    static double FunctionRecursividadeTres(double n) {
        
        if (n == 1) {
            return 1.0;
        } else {
            return 1/n + (FunctionRecursividadeTres(n - 1));
        }
    }
}
