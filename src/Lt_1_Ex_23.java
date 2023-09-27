
import java.util.Scanner;

public class Lt_1_Ex_23 {
    static int n1,n2,n3,n4;
   public static void main (String args[]){
       //receba 3 valores em ordem crescente e um 4 não necessariamente, mostre-os em ordem crescente
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Olá. informe 3 números em ordem crescente e um 4º número não necessariamente");
       n1 = sc.nextInt();
       n2 = sc.nextInt();
       n3 = sc.nextInt();
       n4 = sc.nextInt();
       sc.close();
       
       ProcedureOrdenarUltimo();

   }
   
   static void ProcedureOrdenarUltimo(){
       
       if(n4 < n1)
           System.out.println(n4+","+n1+","+n2+","+n3);
       else if(n4 < n2)
           System.out.println(n1+","+n4+","+n2+","+n3);
       else if(n4 < n3)
           System.out.println(n1+","+n2+","+n4+","+n3);
       else
           System.out.println(n1+","+n2+","+n3+","+n4);
       
   }
}
