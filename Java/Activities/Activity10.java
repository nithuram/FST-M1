import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");


        System.out.println("Original HashSet: " + hs);

        System.out.println("Size of HashSet: " + hs.size());


        System.out.println("Removing E from HashSet: " + hs.remove("E"));

        if(hs.remove("Z")) {
            System.out.println("Z removed from the Set");
        } else {
            System.out.println("Z is not present in the Set");
        }

        System.out.println("Checking if C is present: " + hs.contains("C"));

        System.out.println("Updated HashSet: " + hs);
    }
}
