import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("tp");
        myList.add("cable");
        myList.add("charger");
        myList.add("book");
        myList.add(1, "Pen");

        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chair is in list: " + myList.contains("Chair"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("book");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
