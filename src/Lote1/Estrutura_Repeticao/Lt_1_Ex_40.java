package Lote1.Estrutura_Repeticao;
import javax.swing.JOptionPane;

public class Lt_1_Ex_40 {
  public static void main(String args[]) {
    // 40. Receba 2 números inteiros. Verifique e mostre todos os números primos
    // existentes entre eles.
    int n1, n2, maior, primo;
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe outro número inteiro"));

    if (n1 > n2) {
      maior = n1;
      primo = n2;
    } else {
      maior = n2;
      primo = n1;
    }

    for (int i = primo; i < maior; i++) {
      if (FunctionPrimos(i))
        System.out.println("O número " + i + " é primo");
    }
  }

  static boolean FunctionPrimos(int num) {
    if (num < 2)
      return false;
    else
      for (int i = 2; i < num; i++) {
        if (num % i == 0)
          return false;
      }
    return true;
  }

}
