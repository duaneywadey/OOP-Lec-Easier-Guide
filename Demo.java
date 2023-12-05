// ENCAPSULATION DEMONSTRATION

class Human {
	private int age;
	private String name;

	// public int age;
	// public String name;

	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

}

class Demo {
	public static void main(String[] args) {
	Human obj = new Human();

	// obj.name = "Ivan";
	// obj.age = 20;
	
	obj.setAge(20);
	obj.setName("Ivan");

	System.out.println("Name: " + obj.getName());
	System.out.println("Age: " + obj.getAge());
	}
}