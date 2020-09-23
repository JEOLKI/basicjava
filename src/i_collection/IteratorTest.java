package i_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorTest {
	public static void main(String[] args) {
		// Iterator : 단방향
		
		List<String> list = new ArrayList<>();
		
		list.add("123");
		list.add("456");
		list.add("789");
		
		
		Iterator<String> it = list.iterator(); //자동으로 바꿔줌
		while(it.hasNext()){ //다음것이 있는지 확인하는 녀석 다음것이 있으면 true
			System.out.println(it.next());
		}
		
		//앞으로만 가고 뒤로 못온다
		
		
		// ListIterator : 양방향 
		// List에서만 사용가능
		ListIterator<String> it2 = list.listIterator();
		System.out.println(it2.hasNext()); // 다음게 있느냐
		System.out.println(it2.next());
		System.out.println(it2.hasPrevious()); // 이전게 있느냐
		System.out.println(it2.previous());
		
		
		
	}
}
