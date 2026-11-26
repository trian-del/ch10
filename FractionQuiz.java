import java.util.Random;
import java.util.Scanner;

public class FractionQuiz {
    public static void main(String args[]) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        Fraction a = new Fraction(), b = new Fraction();
        String[] operators = new String[] {"+", "-", "*", "/"};
        for (;;) {
            a.setNumerator(r.nextInt(1, 100));
            a.setDenominator(r.nextInt(1, 100));
            b.setNumerator(r.nextInt(1, 100));
            b.setDenominator(r.nextInt(1, 100));
            String ans = s.nextLine();
            Fraction e = new Fraction();
            switch (operators[r.nextInt(0, 4)]) {
				case "+":
					System.out.println(a + "+" + b + " = ?");
                case "*":
                    System.out.println(a + "*" + b + " = ?");
                    e = Fraction.mult(a, b);
                    e.reduce();
                    System.out.println(e);
                default:
            }
        }
    }
}
