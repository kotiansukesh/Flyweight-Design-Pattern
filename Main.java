import java.util.Random;  

/*
Properties
	• Structural design pattern
	• Used when we need to create many Objects of a class. We use it to reduce creation of Object.
	• Intrinsic Properties: Which are same for a Object.
	• Extrinsic Properties: Which are different for a Object.
	
Implementation
	• Interface: Which contain common method - Employee
	• Object: Individual Class - Developer, Tester
	• Intrinsic Property
		○ Developer - Fixes the issue
		○ Tester - Test the issue
	• Extrinsic Property - Skills
	• We use Factory to return Object - EmployeeFactory
	• Client - Client Class
	• We will assign issues as per skills.
*/

class Main {
	private static String employeeType[] = {"Developer", "Tester"};
	private static String skills[] = {"Java", "C++", ".Net", "Python"};

  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
			Employee e = EmployeeFactory.getEmployee(getRandEmployee());
			e.assignSkill(getRandSkill());
			e.task();
		}
  }

	public static String getRandEmployee() {
		Random r = new Random();
		int randInt = r.nextInt(employeeType.length);
		return employeeType[randInt];
	}

	public static String getRandSkill() {
		Random r = new Random();
		int randInt = r.nextInt(skills.length);
		return skills[randInt];
	}
}