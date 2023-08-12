import java.util.Scanner;

public class Lt_1_Ex_3 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base do triangulo: ");
        base = sc.nextDouble();

        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();
        sc.close();

        area = (base * altura) / 2;
        System.out.println("A área do triangulo é: " + area);

    }
}
