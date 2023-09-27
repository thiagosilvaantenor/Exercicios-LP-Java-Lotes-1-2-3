
public class Lt_1_Ex_31 {
  // 31. Calcule e mostre o quadrado dos números entre 10 e 150.
  public static void main(String args[]) {

    for (int i = 10; i <= 150; i++) {
      System.out.println("O quadrado do número " + i + " é: " + FunctionQuadrado(i));
    }

  }

  static int FunctionQuadrado(int i) {
    int quad;

    quad = i * i;
    return quad;
  }

}
