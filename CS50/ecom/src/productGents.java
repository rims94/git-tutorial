import java.util.ArrayList;
import java.util.List;
import java.util.*;
class productGents {
	private String productName;
	private int price;
	public productGents(String productName,int price) {
		this.productName=productName;
		this.price=price;
	}
	public String get_productName() {
		return productName;
	}
	public void set_productName(String productName) {
		this.productName=productName;
	}
	public int get_price() {
		return price;
	}
	public void set_price(int price) {
		this.price=price;
	}
	public String toString() {
		return productName+"\t price :"+price;
	}
	public productlist() {
		ArrayList<productGents> A=new ArrayList<productGents>();
		List<productGents> B=new ArrayList<productGents>();
		A.add(new productGents("Jeans",500 ));
		A.add(new productGents("Shirts",300));
		A.add(new productGents("joggers",200));
		A.add(new productGents("t-shirts",400));
		A.add(new productGents("Shoes",700));
		A.add(new productGents("kurta",200));
		A.add(new productGents("boxer",150));
		A.add(new productGents("socks",90));
		A.add(new productGents("hand carchief",50));
		A.add(new productGents("inner ware",200));
		int len=A.size();
		System.out.println(len);
		for(int i=0;i<len;i++){
			System.out.println(i+". "+A.get(i));
		}
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter a choice:");
		int sc=inp.nextInt();
		System.out.println("the price is :"+A.get(sc).price);
		System.out.println("Do you want to add it to the cart? Press 1");
		int ex=inp.nextInt();
		if(ex==1) {
			B=A.subList(sc,sc+1);
		}
		else {
			System.exit(0);
		}
		int lent=B.size();
		for(productGents x:B) {
			System.out.println(x);
		}
	}
}

