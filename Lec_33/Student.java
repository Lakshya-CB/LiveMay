package Lec_33;

public class Student implements Comparable<Student> {
	static int total_s = 1000;

	public static void bacchaBhagGaya() {
		total_s--;
		System.out.println(Name);
	}

	public Student(String string, int i) {
		// TODO Auto-generated constructor stub
		Name = string;
		Age = i;
		total_s++;
	}

	String Name;
	int Age;

//	@Override
	public int compareTo(Student o) {
//		this-o
//		obj1.compareTo(obj2) = > obj1-obj2 
//		this = obj1 ,    o= obj2
		return this.Age - o.Age;
	}

	@Override
	public String toString() {
		return "{" + Name + " " + Age + "}";
	}

	public String toString(String haath) {
		return "{" + Name + " " + Age + "}" + haath;
	}
}
