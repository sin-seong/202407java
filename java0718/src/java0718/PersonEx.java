package java0718;

public class PersonEx {

		public static void main(String[] ar) {
			Driver driver = new Driver();
			Role role = driver;
			
			role = new Worker();
			if(role instanceof Worker) {
			Worker worker = (Worker)role;		
			}
			Person person = new Person();
			person.setRole(new Driver());
			person.doIt();
			person.setRole(new Worker());
			person.doIt();
		}
}
