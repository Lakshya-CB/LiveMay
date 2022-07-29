package Lec_25;

public class Client {
	public static void main(String[] args) {
//		Student S = new Student();
//		System.out.println(S);
//		System.out.println(S.Age);
//		System.out.println(S.Name);

		Student S1 = new Student();
		S1.Age = 3;
		S1.Name = "pyaarelal";
		Student S2 = new Student();
		S2.Age = 100;
		S2.Name = "mohanpyaare";

		System.out.println(S1.Name + " " + S2.Name);
		System.out.println(S1.Age + " " + S2.Age);
//		Test1(S1, S);
//		Test2(S1, S);
		String myName = "bhasm";
		int myAge = 10;
		Test3(S1, S2.Name, S2.Age, myAge, myName);

		System.out.println(S1.Name + " " + S2.Name);
		System.out.println(S1.Age + " " + S2.Age);

	}

	public static void Test3(Student s1, String Name, int Age, int myAge, String myName) {
		s1.Name = "";
		s1.Age = 0;

		Name = "";
		Age = 0;

		myName = "";
		myAge = 0;
	}

	public static void Test2(Student s1, Student s2) {
//		10k?! 
//		20k !! change?! s1
		s2 = new Student();
		String temp_s = s1.Name;
		s1.Name = s2.Name;
		s2.Name = temp_s;

		int temp_i = s1.Age;
		s1.Age = s2.Age;
		s2.Age = temp_i;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

}
