public class ArithmaticOp {
    public static void main(String[] args){

        int num1 = 5;
        float num2 = 7.50f;
        double num3 = 10.75;

        float result1 = num1 + num2;  //widen to float
        double result2 = num3 - num2;  //widen to double
        double result3 = num3 * num1;  //widen to double
        double result4 = num3 / num1;  //widen to double


        System.out.println("result1 is : " + result1);   
        System.out.println("result2 is : " + result2);   
        System.out.println("result3 is : " + result3);   
        System.out.println("result4 is : " + result4);   

    
    
    
    
    }
}

/* result1 is : 12.5
result2 is : 3.25
result3 is : 53.75
result4 is : 2.15 */