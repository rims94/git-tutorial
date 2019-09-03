import java.util.*;
class ternary{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a value :");
		int x=inp.nextInt();
		System.out.println("Enter another value :");
		int y=inp.nextInt();
		int max=(x>y)?x:y;
		System.out.println("LARGEST NO IS :"+max);
	}
}
