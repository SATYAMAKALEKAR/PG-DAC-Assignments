public class MarksToGrades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter  the marks : ");
        int marks = scanner.nextInt();

        char grade;

        if  (marks >=90) {
            grade = 'A';
        } else if  (marks>=80) {
            grade = 'B';
        } else if (marks >=70) {
            grade ='C';
        } else if (marks >=60){
            grade = 'D';
        } else{
            grade = 'F';
        }
        System.out.println ("the grade is :" +grade);
    }
}