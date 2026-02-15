import java.util.Scanner;

public class AulaPoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Introduza os valores do X: ");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();

        System.out.println("Introduza os valores de Y: ");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        double p = (xA + xB + xC)/2.0;
        double aeraX = Math.sqrt((p * (p - xA) * (p - xB) * (p - xC)));

        p = (yA + yB + yC)/2.0;
        double aeraY = Math.sqrt((p * (p - yA) * (p - yB) * (p - yC)));

        System.out.println("X: " + aeraX);
        System.out.println("Y: " + aeraY);

        if (aeraX > aeraY){
            System.out.println("Maior X: ");
        }
        else{
            System.out.println("Maior Y");
        }

    }
}
