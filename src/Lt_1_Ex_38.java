import java.util.Scanner;

public class Lt_1_Ex_38 {

  public static void main(String args[]) {
    // 38. Receba 100 números inteiros reais. Verifique e mostre o maior e o menor
    // valor. Obs.: somente valores positivos.

    System.out.println(FunctionMaior_Menor());

  }

  static String FunctionMaior_Menor() {
    int maior = -1, menor = 9999;
    int num;
    String result;
    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= 5; i++) {
      System.out.println("Olá, informe 100 números inteiros, número atual: " + i);
      num = sc.nextInt();
      if (num > maior)
        maior = num;
      if (num < menor)
        menor = num;
    }
    sc.close();
    result = "O maior número informado foi: " + maior + "\n já o menor foi: " + menor;
    return result;

  }
}
