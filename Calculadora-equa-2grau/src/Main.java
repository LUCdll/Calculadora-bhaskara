import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double  B ;

        B = Math.sqrt(b);

        double delta = Math.pow(b, 2.0) - 4*a*c;

        double x1 = (-b + Math.sqrt(delta))/ (2.0 * a);
        double x2 = (-b - Math.sqrt(delta))/ (2.0 * a);

        System.out.printf("o valor de X' e igual a: " + x1);
        System.out.println();
        System.out.printf("o valor de X'' e igual a: " + x2);

    }

}


