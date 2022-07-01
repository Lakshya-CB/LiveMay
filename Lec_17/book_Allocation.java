package Lec_17;

public class book_Allocation {
	public static void main(String[] args) {
		int[] books = {12,34,67,90};
		int e = 203; // sum o pages
		int s= books[books.length-1]; //sabse motu book
		int ans = e;
		while(s<=e) {
			int pages = (s+e)/2;
			if(isPoss(books, 2, pages)) {
				e = pages-1;
				ans = pages;
			}else {
				s= pages+1;
			}
		}
		System.out.println(ans);
		
//		for(int max_pages = 1;max_pages <=203;max_pages++) {
//			System.out.println(max_pages+" "+isPoss(books, 2, max_pages));
//		}
	}
	public static boolean isPoss(int[] books, int total_S, int max_pages) {
//	Tell me !!
//	Is it possible to finish all the books between S students
//	in such a way that maximum pages a student can read 
//	DOES NOT EXCEEEEEED max pages
//		{12,34,67,90}
		int load = 0;
		int i = 0;
		int curr_student = 1;
		while (i < books.length) {
			load = load + books[i];
			if (load > max_pages) {
				load = 0;
				curr_student++;
			} else {
				i++;
			}
			if(curr_student> total_S) {
				return false;
			}
		}
		return true;

	}
}
