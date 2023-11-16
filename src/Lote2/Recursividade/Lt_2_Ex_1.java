package Lote2.Recursividade;

public class Lt_2_Ex_1 {
    //recursividade
    //1)   Serie1 = (1+2+3+...+100)
   public static void main(String args[]){
       int serie = 1;
       System.out.println(FunctionRecursiva1(serie));
   }
   
   static int FunctionRecursiva1(int n){
       int i;
       
       if(n == 100){
           return n;
       }
       else{
           i = n+FunctionRecursiva1(n+1);
           return i;
       }
   }
}
