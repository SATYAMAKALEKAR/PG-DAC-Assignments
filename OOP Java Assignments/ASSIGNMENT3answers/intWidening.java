public class intWidening{
	public static void main(String[] args) {

	int n = 89;
	
	double intToDouble = n;
	float intToFloat = n;
	boolean intToBool = n != 0; //not equalcomparison
	String intToString = "" +n;  //placeholder(+) and doublequotes ("") to define String

	System.out.println("int is :  " +n);
	System.out.println("double is :  " +intToDouble);
	System.out.println("float is :  " +intToFloat);
	System.out.println("bool is :  " +intToBool);	
	System.out.println("string is :  " +intToString);
    
}
}