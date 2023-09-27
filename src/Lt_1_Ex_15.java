import javax.swing.JOptionPane;

public class Lt_1_Ex_15 {
  //15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
  public static void main(String args[]){
      double catetoAd,catetoOp,hipo;
      //hipo = catetoAd^2+catetoOp^2

      catetoAd = Double.parseDouble(JOptionPane.showInputDialog("Olá, informe o valor do cateto adjacente"));
      catetoOp = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe o valor do cateto oposto"));

      hipo = (Math.pow(catetoAd,2)) + (Math.pow(catetoOp,2));
      hipo = Math.sqrt(hipo);

      JOptionPane.showMessageDialog(null,"O valor da hipotenusa é: " + hipo);
  }
}
