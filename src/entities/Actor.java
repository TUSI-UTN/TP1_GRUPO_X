package entities;

public class Actor {
	private String name;
	private int age;
	private String gender;
	
	public Actor(String name, int age, String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
 	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	  
	public String toString() {
	    return "Nombre: " + name + "\nEdad: " + age + "\nGenero: " + gender + "\n";
	}
	
}
