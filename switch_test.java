import java.util.*;
class switch_test{
	public static void main(String args[]){
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a month number :");
		int month=inp.nextInt();
		switch(month){
			case 2:
				System.out.println("28 days,29 in leap year");
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31 days");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30 days");
				break;
			default:
				System.out.println("Wrong entry");
				break;
		}
	}
}
