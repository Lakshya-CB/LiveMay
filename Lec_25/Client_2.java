package Lec_25;

public class Client_2 {
	public static void main(String[] args) {
		Student s = new Student();
		s.Intro();
	
		s.Age = 2;
		s.Name = "Slim shady";
		System.out.println(s);
		s.Intro();
		
		System.out.println("============");
		Student s1 = new Student();
		s1.Age = 25;
		s1.Name = "Sallu";
		System.out.println(s1);
		s1.Intro();

		System.out.println("==========");
		s1.Party("pappu");
	}
}
