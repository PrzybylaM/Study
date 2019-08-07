package metodyIKonstruktory.task1;

public class Calculate {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        double a = 4;
        double b = 13.5;

        System.out.println(calc.add(a,b));

        double resultDivide = calc.divide(b,a);
        System.out.println(resultDivide);

        double reeultFourNumbers = calc.add(2,5,8,10);
        System.out.println(reeultFourNumbers);

        double subtractThreeNumbers = calc.subtract(500, 100, 20);
        System.out.println(subtractThreeNumbers);
    }
}
