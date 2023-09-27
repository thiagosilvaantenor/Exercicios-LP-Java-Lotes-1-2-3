import java.util.Scanner;

public class Lt_1_Ex_28 {
  /*
   * 28. Receba o preço atual e a média mensal de um produto. Calcule e mostre o
   * novo preço sabendo que:
   * Venda Mensal | Preço Atual | Preço Novo
   * < 500 | < 30 | + 10%
   * >= 500 e < 1000| >= 30 e < 80| +15%
   * >= 1000 |>= 80 | - 5%
   * Obs.: para outras condições, preço novo será igual ao preço atual
   */
    static double precoNov;
  public static void main(String args[]) {
    double precoAt, vendaMed;
    Scanner sc = new Scanner(System.in);

    System.out.println("Olá, informe o preço atual");
    precoAt = sc.nextDouble();
    System.out.println("Agora, informe a media de venda do produto");
    vendaMed = sc.nextDouble();
    sc.close();
    
      ProcedurePrecoNov(precoAt, vendaMed);
    
    System.out.println("O novo preço do produto é: " + precoNov);
  }
  
  static void ProcedurePrecoNov(double precoAt,double vendaMed){
    if (vendaMed < 500 && precoAt < 30) {
      precoNov = precoAt + (0.10 * precoAt);
    } else if (vendaMed >= 500 && vendaMed < 1000 && precoAt >= 30 && precoAt < 80) {
      precoNov = precoAt + (0.15 * precoAt);
    } else if (vendaMed >= 1000 && precoAt >= 80) {
      precoNov = precoAt - (0.05 * precoAt);
    } else {
      precoNov = precoAt;
    }
  }

}
