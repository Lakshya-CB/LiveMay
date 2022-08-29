package Lec_33;

public class Static_1 {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Student.total_s);
		Student s1 =new Student("", 0);
		Student s2 =new Student("", 0);
		Student s3 =new Student("", 0);
		Student s4 =new Student("", 0);
		System.out.println(Student.total_s);
		System.out.println(s3.total_s);
	}
}
