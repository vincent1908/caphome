package oops.encapsulation;

public class College {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.id = 1;
		s1.name = "tom";
		
		s1.setId(1);
		s1.setName("jim");
		
		System.out.println(s1.getId() + ".." + s1.getName());
		
		System.out.println(s1.id + "..." +s1.name);
		
	}

}
