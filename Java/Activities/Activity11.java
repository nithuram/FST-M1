import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> Colours = new HashMap<Integer, String>();
        Colours.put(1, "yellow");
        Colours.put(2, "Green");
        Colours.put(3, "red");
        Colours.put(4, "White");
        Colours.put(5, "Black");


        System.out.println("The Original map: " + Colours);


        Colours.remove(4);

        System.out.println("After removing White: " + Colours);

        // Check if green exists
        if(Colours.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }


        System.out.println("Number of colours in the Map is: " + Colours.size());
    }
}