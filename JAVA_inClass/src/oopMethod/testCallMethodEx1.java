package oopMethod;

/*
 * Method
 * [modifier] return_type identifier([parameter_lists]){
 * statement;
 * [return value;]
 * }
 */

class person {
	String gender;
	String name;
	int age;

	void sayHello() {
		System.out.println("Hello!!");
		sayGoodbye();
	}
	void sayGoodbye() {
		System.out.println("GoodBye");
		//sayGoodbye();  // runtime error(recursive error)
	}
	void testAge() {
		if(age>=18) {
			System.out.printf("%s已成年\n",name);
		}else {
			System.out.printf("%s未成年\n",name);
		}
	}

	person(String gender, String name, int age) {
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
}

public class testCallMethodEx1 {

	public static void main(String[] args) {
		person mike = new person("男性", "mike", 24);
		System.out.printf("%s是%d歲%s\n", mike.name, mike.age, mike.gender);
		mike.testAge();
		mike.sayHello();
		mike.sayGoodbye();

	}

}
