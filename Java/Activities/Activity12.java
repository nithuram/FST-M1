package Activities;

public class Activity12 {
    public static void main(String[] args) {
        //lambda expression(no body)
        Addable ad1= (num1, num2) -> (num1+num2);
        System.out.println(ad1.add(1,2));

        //lambda function(has a body)
        Addable ad2 = (int num1,int num2) -> {
            return (num1+num2);
        };
        System.out.println(ad2.add(10,20));
    }
}
