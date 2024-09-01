public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Data");
        plane.onboard("Joe");
        plane.onboard("Abc");
        System.out.println("Plane took off at: " + plane.takeOff());
        System.out.println("People on the plane: " + plane.getPassengers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
