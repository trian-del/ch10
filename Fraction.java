public class Fraction {
    private int numerator, denominator;
    
    private void checkzero() {
		if(denominator == 0) {
			System.out.println("Error: Denominator cannot be zero");
            System.exit(0);
		}
	}

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        checkzero();
        numerator = n;
        denominator = d;
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
