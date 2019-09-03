import java.util.ArrayList;
import java.util.List;
import java.util.*;
class productLadies {
	private String productName;
	private int price;
	public productLadies(String productName,int price) {
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
		ArrayList<productLadies> A=new ArrayList<productLadies>();
		List<productLadies> B=new ArrayList<productLadies>();
		A.add(new productLadies("Jeans",500 ));
		A.add(new productLadies("croptop",300));
		A.add(new productLadies("leggins",200));
		A.add(new productLadies("t-shirts",400));
		A.add(new productLadies("Shoes",700));
		A.add(new productLadies("kurti",200));
		A.add(new productLadies("boxer",150));
		A.add(new productLadies("socks",90));
		A.add(new productLadies("hand carchief",50));
		A.add(new productLadies("inner ware",200));
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
		for(productLadies x:B) {
			System.out.println(x);
		}
	}
}

