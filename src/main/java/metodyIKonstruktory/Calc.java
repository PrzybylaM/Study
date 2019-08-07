package metodyIKonstruktory;

public class Calc {
    public static void main(String[] args) {

        Calc calc = new Calc();
        double res = calc.add(2,5);
        System.out.println(res);

        calc.addAndPrint(5,5);
    }


    double add(double a, double b){
        double result = a + b;
        return result;

    }

    void addAndPrint(int a, int b){
        int result = a + b;
        System.out.println(result);
    }
}
