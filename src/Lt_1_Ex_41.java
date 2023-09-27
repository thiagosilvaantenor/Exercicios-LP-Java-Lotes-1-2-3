public class Lt_1_Ex_41 {
  // 41. Mostre todas as possibilidades de 2 dados de forma que a soma tenha como
  // resultado 7
  public static void main(String args[]) {
    // 6,1 | 1,6| 4,3|3,4|5,2|2,5|
    int d1 = 0, d2 = 0;
    System.out.println(FunctionDados(d1, d2));
  }

  static String FunctionDados(int l1, int l2) {
    String result;
    for (int i = 1; i <= 6; i++) {
      l1 = i;
      for (int j = 1; j <= 6; j++) {
        l2 = j;
        if (l1 + l2 == 7) {
          result = l1 + "," + l2;
          System.out.println(result);
        }
      }

    }
    return (result = "Essas são todas as possibilidades");
  }
}
