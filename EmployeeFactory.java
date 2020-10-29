import java.util.HashMap;

class EmployeeFactory {

	private static HashMap<String, Employee> m = new HashMap<>();

	public static Employee getEmployee(String type) {
		Employee e = null;
		if(m.get(type) != null) {
			e = m.get(type);
		} else {
			switch(type) {
				case "Developer": 
						System.out.println("Developer Created");
						e = new Developer();
						break;

				case "Tester": 
						System.out.println("Tester Created");
						e = new Tester();
						break;

				default: System.out.println("No such Employee");
			}

			m.put(type, e);
		}

		return e;
	} 
}