package metodyIKonstruktory.task2;

public class changeHour {

    void hoursPerMinutes(int a){
        int result = a * 60;
        System.out.println("Po przeliczeniu " + a + " godzin/y na minuty wynosi: "+result+ " minut");
    }

    void minutesPerSeconds(int a){
        int result = a * 60;
        System.out.println("Po przeliczeniu " + a +" minut na sekondy wynosi: "+result+ " sekund");
    }

    void secondsPerMiliseconds(int a){
        int result = a * 1000;
        System.out.println("Po przeliczeniu " + a + " sekund na milisekundy wynosi: "+result+ " milisekund");
    }

}

