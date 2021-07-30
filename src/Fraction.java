
public class Fraction {

    private int numerator = 0, denominator = 1;

    public void setNumerator(int numerator0) {
        this.numerator = numerator0;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    public double getValue(){
        return (double)getNumerator()/(double)getDenominator();
    }
    public String toString(){
        return getNumerator()+"/"+getDenominator();
    }
    
    public boolean equals(Fraction f){
        double v1 = getValue();
        double v2 = f.getValue();
        return v1==v2;
        
    }

}
