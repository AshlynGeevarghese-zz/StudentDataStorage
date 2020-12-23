import java.util.Scanner;
public class StudentDataApplication {
	public static void main (String[] args) {
		int count = 0;
		int i = 0;
		
		Scanner scan= new Scanner (System.in);
		
		//int studentNum = 0;
		//System.out.println("How many students would you like to add to the System?");
		//studentNum = scan.nextInt();
		
		System.out.println("How many students would you like to enter into the system");
		int studentnum = scan.nextInt();
		StudentData [] students = new StudentData[studentnum];
		
		while (count<studentnum){
			students[count] = new StudentData();
			students[count].enroll();
			System.out.println("");
			students[count].pay();
			count++;
		}
		while (i<studentnum){
			students[i].studentInformation();
			System.out.println(" ");
			i++;
		}
	}
}