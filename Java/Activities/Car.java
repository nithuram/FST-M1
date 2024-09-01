package Activities;

public class Car {

        String colour;
        String transmission;
        int make;
        int tyres = 4;
        int doors = 4;

        public Car() {
        }

        public void displayCharacteristics() {
            System.out.println("Colour of the car " + this.colour);
            System.out.println("Transmission of the car " + this.transmission);
            System.out.println("Make of the car " + this.make);
            System.out.println("Number of tyres " + this.tyres);
            System.out.println("Number of doors " + this.doors);
        }

        public void accelarate() {
            System.out.println("Car is moving forward");
        }

        public void brake() {
            System.out.println("Car has stopped.");
        }
    }
