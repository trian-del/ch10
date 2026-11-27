import java.util.Random;
import java.util.Scanner;

public class FractionQuiz {
    static String ans;
    static Fraction e = new Fraction(), a = new Fraction(), b = new Fraction();
    static int score, count;
    static Random r = new Random();

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String[] operators = new String[] {"+", "-", "*", "/"};
        for (;;) {
            roll();
            while (a.toString().equals(b.toString())) roll();
            int n = r.nextInt(0, 4);

            System.out.println(a + " " + operators[n] + " " + b + " = ?");
            ans = s.nextLine();
            Fraction result = new Fraction(score, count);
            if (ans.equals("quit")) {
                System.out.println("You answered " + score + "/" + count
                    + " correctly, for a score of " + (int) (result.toDouble() * 100)
                    + " percent");
                break;
            }
            switch (operators[n]) {
                case "+":
                    e = Fraction.add(a, b);
                    check();
                    break;
                case "-":
                    e = Fraction.sub(a, b);
                    check();
                    break;
                case "*":
                    e = Fraction.mult(a, b);
                    check();
                    break;
                case "/":
                    e = Fraction.div(a, b);
                    check();
                    break;
            }
        }
    }
    public static void check() {
        if (ans.equals(e.toString())) {
            System.out.println("correct");
            score++;
            count++;
        } else {
            System.out.println("incorrect, the answer is " + e);
            count++;
        }
    }
    public static void roll() {
        a.setNumerator(r.nextInt(1, 10));
        a.setDenominator(r.nextInt(1, 10));
        b.setNumerator(r.nextInt(1, 10));
        b.setDenominator(r.nextInt(1, 10));
    }
}
