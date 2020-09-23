package f_OOP2;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;


public class ProductTest {
	public static void main(String[] args) {
		
		Tv2 t1 = new Tv2("삼성tv",500);
		Tv2 t2 = new Tv2("LGtv",500);
		Laptop nb = new Laptop("LG그램",250);
		Camera c1 = new Camera("캐논EOS ",100);
		
		Buyer b = new Buyer("강태경", 1000);		
		
		b.buy(t1);
		b.buy(nb);
		b.buy(c1);
		b.buy(nb);
		b.refund(t1);
		
		BuyerManager bm = new BuyerManager();
		bm.buyerJoin(b);
		bm.getBuyer(b);
		
		Buyer c = new Buyer("홍정기", 3000);
		c.buy(t1);
		
		bm.buyerJoin(c);
		bm.getBuyer(c);
		
		

	}
}

/**
 * 고객을 관리하는 클래스
 * 
 * @author PC-01
 *
 */


class BuyerManager {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList buyerArr = new ArrayList<>();		
	
		
	void buyerJoin(Buyer b){
		
			
		buyerArr.add(b);
		System.out.println("새로운 고객이 등록되었습니다.");
				
	}
	
	
	void getBuyer(Buyer b){
		
		Buyer buy = (Buyer) buyerArr.get(buyerArr.indexOf(b));
		
		buy.summary();
	}
	

	
}



/**
 * 고객의 정보에 관한 클래스
 * 
 * @author PC-01
 *
 */

class Buyer {
	private String name;
	private int money;
	private int mileage;
	
	private Vector item = new Vector<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Vector getItem() {
		return item;
	}

	public void setItem(Vector item) {
		this.item = item;
	}

	
	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	void buy(Product t){ 
		if(money < t.price){
			System.out.println("잔액이 부족합니다.");
			return; 
		} 
		this.money -= t.price;
		this.mileage += t.mileage;
		item.add(t); 
		System.out.println(t.toString()+"결제완료 및 적립완료"); 
	}	
	
	//1.환불
	void refund(Product t){
		if(item.remove(t)){ 
			this.money += t.price;
			this.mileage -= t.mileage;
			System.out.println(t+"는 환불이 완료 되었습니다.");
			return;
		}
		System.out.println(t+"는 구매상품이 아닙니다.");
	}	
	
	
	//2.영수증
	void summary(){
		if(item.size() == 0){
			System.out.println("구매내역이 없습니다.");
			return;
		}
		System.out.println("\t영\t수\t증");
		System.out.println();
		System.out.print("구매물품");
		
		int totalPrice = 0;
		
		for(int count = 0 ; count < item.size() ; count++){
			Product p = (Product) item.get(count);
			System.out.println("\t" + p.name + "\t" + p.price +"만원");
			totalPrice += p.price;
		}
		System.out.println();
		System.out.println("총합\t\t" + totalPrice + "만원");
		System.out.println("고객님의 남은돈은 " + money +"만원이고 마일리지는 " + mileage + "만 포인트 입니다.");
		System.out.println("오늘도 이용해주셔서 감사합니다.");
	}
	
	@Override
	public String toString() {
		
		return name + money + mileage + item;
	}
	
	
}



class Product{
	String name;
	int price;
	int mileage;
	
	public Product(String name,int price){
		this.name = name;
		this.price = price;
		mileage = price/10;
	}
}


class Tv2 extends Product{  
	public Tv2(String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "Tv2";
	}
}


class Laptop extends Product{
	public Laptop(String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "Laptop";
	}
}


class Camera extends Product{
	public Camera(String name, int price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return "Camera";
	}
}



//고객여러명의 정보를 가지고 필요할때 꺼내온다. 
//상속에따른 클래스구성 받아다가 메서드를 어떻게 관리할지  여러명은 어떤식으로 관리할지

//마지막문제는 그냥 에드만하는게 아니라 수량을 관리할것이다 
//수량(재고)  + 물품관리 (클래스로 되있어서관리하기 어렵다) 두가지를관리하는것


