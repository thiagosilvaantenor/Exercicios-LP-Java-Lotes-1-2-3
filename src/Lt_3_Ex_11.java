public class Lt_3_Ex_11 {
  /*
   * 11. Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
   * 
   *   |0|1|2|3|4|5|6|7|
   * 0 |1|1|1|1|1|1|1|1|
   * 1 |1|2|2|2|2|2|2|1|
   * 2 |1|2|3|3|3|3|2|1|
   * 3 |1|2|3|4|4|3|2|1|
   * 4 |1|2|3|4|4|3|2|1|
   * 5 |1|2|3|3|3|3|2|1|
   * 6 |1|2|3|3|3|3|2|1|
   * 7 |1|1|1|1|1|1|1|1|
   */

  public static void main(String args[]) {
    int x, i;
    int matriz[][] = new int[8][8];

    for (x = 1; x <= (matriz.length / 2); x++) {
      for (i = (x - 1); i <= (matriz.length - x); i++) {
        for (int j = (x - 1); j <= (matriz.length - x); j++) {
          matriz[i][j] = x;
          System.out.println("Linha: " + i + ", coluna: " + j + ", valor: " + matriz[i][j]);
        }
      }
    }
  }
}
