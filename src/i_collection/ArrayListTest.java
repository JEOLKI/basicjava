package i_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		
		//인터페이스 타입으로 넣어놔야 다른타입으로 형변환이 가능하다
		List<Integer> list1 = new ArrayList<>();
		
		//CRUD
		
		//Create
		list1.add(new Integer(5));
		list1.add(2); //오토박싱
		list1.add(3);
		list1.add(1);
		list1.add(4);
		
		List<Integer> list2 = new ArrayList<>(list1.subList(2, 4));  //list1에있는것이 list2에 다 복사가된다.
		System.out.println(list2);   //toString이 오버라이드 되어있다 .
		
		//자동으로 정렬해주는 것
		Collections.sort(list1);
		System.out.println(list1);
		
		
		//R
		int result = list1.get(2);  //언박싱
		System.out.println(list1);
		
		
		//U
		list1.set(1, 10); // 오토박싱
		System.out.println(list1);
		
		
		//D
		list1.remove(2);  // 객체타입으로 주고싶으면 new Integer()해서 넣어야한다.
		System.out.println(list1);
		
		
		
		
		
		
		
		
		
	}
}
