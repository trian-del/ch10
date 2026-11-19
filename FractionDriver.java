public class FractionDriver {
    public static void main(String[] args) {
        Fraction s = new Fraction(1,2);
        Fraction rs = new Fraction(1,4);
        Fraction a = Fraction.mult(s, rs);
        System.out.println(a);
    }
}
