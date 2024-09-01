package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car Duster = new Car();
        Duster.make = 2014;
        Duster.colour = "Black";
        Duster.transmission = "Manual";
        Duster.displayCharacteristics();
        Duster.accelarate();
        Duster.brake();
    }
}
