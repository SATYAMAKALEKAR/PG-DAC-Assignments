public class Narrowing {
    public static void main(String[] args) {

        double num1 = 10.5556;

        int num2 = (int) num1;  //int for narrowing double to int

        System.out.println("double value: " + num1);
        System.out.println("int after narrowing double " +num2);

    }
}
                // output=> 10.5556 to 10