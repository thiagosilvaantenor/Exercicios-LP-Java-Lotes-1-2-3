import javax.swing.JOptionPane;

public class Lt_3_Ex_3 {
  public static void main(String[] args) {
    // criar e coletar inteiros em 2 vetores, VT1[3], VT2[3] e concatenar com o 3º
    // VT3[6] e mostrar seus dados

    int VT1[] = new int[3];
    int VT2[] = new int[3];
    int VT3[] = new int[6];
    int j = 0;
    for (int i = 0; i <= 5; i++) {
      if (i <= 2)
        VT1[i] = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe o " + i + "° número"));
      else {
        VT2[j] = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe o " + i + "° número"));
        j++;
      }
    }

    for (int i = 0; i <= 5; i++) {
      if (i <= 2) {
        VT3[i] = VT1[i];
        JOptionPane.showMessageDialog(null, "VT3[" + i + "]: " + VT3[i]);
      } else {
        VT3[i] = VT2[i - 3];
        JOptionPane.showMessageDialog(null, "VT3[" + i + "]: " + VT3[i]);
      }
    }

  }
}
