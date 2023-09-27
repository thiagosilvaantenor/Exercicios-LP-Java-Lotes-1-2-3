import javax.swing.JOptionPane;

public class Lt_1_Ex_27 {
    static double velMed;
//27.	Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
  public static void main(String args []){
    double distancia;
    int voltas, tempo;

    voltas = Integer.parseInt(JOptionPane.showInputDialog("Olá, informe a quantidade de voltas"));
    distancia = Double.parseDouble(JOptionPane.showInputDialog("Agora, informe a extensão do circuito, em metros"));
    tempo = Integer.parseInt(JOptionPane.showInputDialog("Por fim, informe a duração em minutos"));
    
      ProcedureVelMed(distancia, voltas, tempo);
    
    JOptionPane.showMessageDialog(null,"A velocidade média é: " + velMed);

  } 
  
  static void ProcedureVelMed(double distancia,int voltas,int tempo){
      //distancia = circuito * voltas
    distancia = distancia * voltas;
    
    //minutos para segundos = min / 60
    //velMed = distancia / tempo

    velMed = distancia /(tempo * 60);
    System.out.println(velMed);

    //metros/seg para km/h
    velMed = velMed * 3.6;
    System.out.println(velMed);
  }
}
