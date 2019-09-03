import java.util.Scanner;
class scan_char{
	public static void main(String args[]){
		System.out.println("Enter user name :");
		Scanner inp=new Scanner(System.in);
		char c=inp.next()charAt(0);
		System.out.println("Entered character is :"+c);
	}
}
