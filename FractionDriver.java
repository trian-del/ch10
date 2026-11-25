public class FractionDriver {
    public static void main(String[] args) {
        Fraction s = new Fraction(1,2);
        Fraction rs = new Fraction(43578,349875);
        rs.reduce();
        System.out.println(rs);
    }
}
