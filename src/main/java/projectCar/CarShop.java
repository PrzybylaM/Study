package projectCar;

public class CarShop {
    public static void main(String[] args) {

        Car audi = new Car();
        audi.model = "A4";
        audi.typeOdBody = "Combi";
        audi.door = 5;
        audi.colorCar = "White";
        audi.colorWheels = "Black";
        audi.sizeWheels = 19;

        String audiInfo = "Model: " + audi.model + " "
                + "Type of body: " + audi.typeOdBody + " "
                + "doors: " + audi.door + " "
                + "color car and color wheels: " + audi.colorCar + " " + audi.colorWheels + " "
                + "Size Wheels: " + audi.sizeWheels;
        System.out.println(audiInfo);
    }
}
