public class FractionDriver {
      
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.setNumerator(3);
        f1.setDenominator(5);
        
        Fraction f2 = new Fraction();
        f2.setNumerator(6);
        f2.setDenominator(10);
        
        System.out.println(f1);
        System.out.println(f2);
        
        System.out.println("f1 == f2 :"+f1.equals(f2));
}
}
