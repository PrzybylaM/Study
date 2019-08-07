package metodyIKonstruktory.task2;

public class Main {
    public static void main(String[] args) {

        double b = 1.2;
        double c = 15000;

        changeMeters changeMeters = new changeMeters();
        double result = changeMeters.metersPerCentimeters(b);
        System.out.println(b +" metr " + " = " + result + " centrymetrów");

        double result2 = changeMeters.MillimetersPerMeters(c);
        System.out.println(c +" milimetrów " + " = " + result2 + " metrów");



        changeHour changeHour = new changeHour();

        changeHour.hoursPerMinutes(5);
        changeHour.minutesPerSeconds(5);
        changeHour.secondsPerMiliseconds(5);

    }
}
