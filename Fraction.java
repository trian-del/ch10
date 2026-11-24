public class Fraction {
    private int numerator, denominator;

    private void checkzero() {
        if (denominator == 0) {
            System.out.println("Error: Denominator cannot be zero");
            System.exit(0);
        }
    }

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
        checkzero();
    }

    public Fraction(String f) {
        int index = f.indexOf('/');
        numerator = Integer.parseInt(f.substring(0, index));
        denominator = Integer.parseInt(f.substring(index + 1, f.length()));
        checkzero();
    }

    public Fraction(Fraction f) {
        numerator = f.getNum();
        denominator = f.getDenom();
    }

    public static Fraction mult(Fraction a, Fraction b) {
        int nr = a.getNum() * b.getNum();
        int dr = a.getDenom() * b.getDenom();

        return new Fraction(nr, dr);
    }

    public int GCF() {
		int inum = numerator;
		int idenom = denominator;
        while (inum != idenom) {
            while (inum > idenom) {
                inum -= idenom;
            }
            while (idenom > inum) {
				idenom -= inum;
			}
        }
        return inum;
    }
    
    public void reduce() {
		int gcf = GCF();
		numerator/=gcf;
		denominator/=gcf;
	}

    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) (numerator) / denominator;
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int n) {
        denominator = n;
        checkzero();
    }
}
