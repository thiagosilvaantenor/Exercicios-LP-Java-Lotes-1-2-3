package Lote1.Estrutura_Repeticao;
public class Lt_1_Ex_42 {
  // 42. Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
  public static void main(String args[]) {
    double serie = 1.0;

    System.out.println("O valor da série é: " + FunctionSerie(serie));
  }

  static double FunctionSerie(double serie) {
    for (double i = 2.0; i <= 50.0; i++) {
      serie += i / (i + (i - 1));
    }
    return serie;
  }
}
