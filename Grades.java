import java.util.Scanner;


class Grades {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numGrades = scanner.nextInt();
	int sum = 0;
	int gradeA = 0;
	int gradeB = 0;
	int gradeC = 0;
	int gradeD = 0;

	for (int i = 0; i < numGrades; i++) { 
	   int grade = scanner.nextInt();
	   if (grade % 5 == 0) {
	       // Grade A
	       gradeA++;
	   } else if (grade % 4 == 0) {
	       // Grade B
	       gradeB++;
	   } else if (grade % 3 == 0) {
	       // Grade C
	       gradeC++;
	   } else if (grade % 2 == 0) {
	       // Grade D
	       gradeD++;
	   } else {
	       // Grade F
	       ;;
	   }
	}
	System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}
		
