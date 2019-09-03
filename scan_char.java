import java.util.Scanner;
class scan_char{
	public static void main(String args[]){
		System.out.println("Enter a word :");
		Scanner inp=new Scanner(System.in);
		char c=inp.next().charAt(6);
		System.out.println("Choosen character is :"+c);
	}
}
