import java.util.Scanner; 
public class StudentData extends StudentDataApplication {
	private String fName;
	private String lName;
	private int Year;
	private String studentID; 
	private static int ID = 10000;
	private String classes = "";
	private int tuition;
	private String gradeName;
	private String email;
	private String schoolName;
	private static int credits = 3;
	private static int cost = 300;


	public StudentData() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your school's email domain");
		schoolName = input.nextLine();
		schoolName = schoolName.toUpperCase();
		System.out.println("What is the student's first name?");
		fName = input.next();
		fName = fName.toUpperCase();
		System.out.println("What is the student's last name?");
		lName = input.next();
		lName = lName.toUpperCase();
		System.out.println("What year is the student?");
		Year = input.nextInt();
		if (Year == 1){
			gradeName = "Freshman";
		}else if (Year == 2){
			gradeName = "Sophmore";
		}else if (Year == 3){
			gradeName = "Junior";
		}else if (Year == 4){
			gradeName = "Senior";
		}else {
			gradeName = "Invalid Grade Year"; 
		}
		while (gradeName == "Invalid Grade Year"){
		System.out.println("The grade you have entered is invalid. Please re-enter the student's grade?");
		Year = input.nextInt();
		if (Year == 1){
			gradeName = "Freshman";
			gradeName = gradeName.toUpperCase();
		}else if (Year == 2){
			gradeName = "Sophmore";
			gradeName = gradeName.toUpperCase();
		}else if (Year == 3){
			gradeName = "Junior";
			gradeName = gradeName.toUpperCase();
		}else if (Year == 4){
			gradeName = "Senior";
			gradeName = gradeName.toUpperCase();
		}else {
			gradeName = "Invalid Grade Year"; 
			gradeName = gradeName.toUpperCase();
		}//end of if else statment
		}//end of while loop
		String a = setStudentid();
		String b = setEmail();
		System.out.println("Name: " + fName + " " + lName + "; Year: "  + gradeName + "; Student ID: " +  a + "; Email: " + email);
	}
	
	private String setStudentid() {
		ID++;
		studentID = Year + "" + ID;
		return studentID;
	}//end of id method
	
	private String setEmail() {
		String domain = schoolName.trim();
		char firstInitial = fName.charAt(0);
		email = firstInitial + lName + studentID + "@" + domain + ".edu";
		return email;
	}//end of email method
	
	public void enroll(){
		String courses;
		do {
			System.out.println("Please enroll in classes to finish enrolling in classes hit 0");
			Scanner input = new Scanner (System.in);
			courses = input.nextLine();
			courses = courses.toUpperCase();
			if (!courses.equals("0")){
				classes = classes + "\n" + courses;
				tuition = tuition + cost; 
			}else {
				break;
			}
		}while (1 !=0);
	
		System.out.println("You have successfullt enrolled in: " + classes + "\n" + "Your current tuition balance is " +tuition);
	}//end of enroll method
	
	
	public void pay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("how much of your tution would you like to pay?");
		int pay = scan.nextInt();
		tuition = tuition - pay;
		if (tuition == 0){
			System.out.println("Thank you for your payment. You have paid all of your tuition.");
		}else{
			System.out.println("Thank you for your payment. You have paid " + pay + "." + "You currently owe " + tuition);
		}//end of if else statment
	}// end of pay method
	
	public void studentInformation(){
		System.out.println("Name: " + lName + "," + fName);
		System.out.println("Year: " +gradeName);
		System.out.println("Email: " + email);
		System.out.println("Enrolled Courses: " + classes);
		System.out.println("Tution Balance: " + tuition);
	}//end of student information method
}//end of class