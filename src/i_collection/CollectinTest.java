package i_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import oracle.net.aso.b;

public class CollectinTest {
	public static void main(String[] args) {
		
		
		//boolean add(Object o)
		//boolean addAll(Collection c)hong
		//지정된 객체(o) 또는 Collection(c)의 객체들을 Collection에 추가한다.
		Collection<Integer> c = new HashSet();
		
		boolean result1 = c.add(1);
		System.out.println(result1);
		System.out.println(c);
		
		//void clear()
		//Collection의 모든 객체를 삭제한다.
		c.clear();
		System.out.println(c);
		
		c.add(1);
		
		
		//boolean contains(Object o)
		//boolean containsAll(Collection c)
		//지정된 객체(o) 또는 Collection(c)의 객체들을 Collection에 포함되어 있는지 확인한다.
		Collection<Integer> c1 = new HashSet();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		System.out.println(c1); // [1,2,3,4]
		
		boolean result2 = c1.contains(1);
		System.out.println(result2);	//true
		
		boolean result3 = c1.containsAll(c);
		System.out.println(result3);	//true
		
		
		//boolean equals(Object o)
		//동알한 Collection인지 비교한다.
		boolean result4 = c1.equals(c);
		System.out.println(result4);
		
		
		//int hashcode()
		//Collection의 hashcode를 반환한다.
		int result5 = c1.hashCode();
		System.out.println(result5);
		
		
		//boolean isEmpty()
		//Collection이 비어있는지 확인한다.
		boolean result6 = c.isEmpty();
		System.out.println(result6);
		
		
		//Iterator iterator()
		//Collection의 iterator를 얻어서 반환한다.
		Iterator result7 = c1.iterator();
		System.out.println(result7);
		
		
		//boolean remove(Object o)
		//지정된 객체들을 삭제한다.
		boolean result8 = c1.remove(2);
		System.out.println(c1);
		
		
		//boolean removeAll(Collection c)
		//지정된 Collection에 포함된 객체들을 삭제한다.
		boolean result9 = c1.removeAll(c1);
		System.out.println(result9);
		System.out.println(c1);
		
		
		//boolean retainAll(Collection c)
		//지정된 Collection에 포함된 객체만을 남기고 다른 객체들은 Collection에서 삭제한다. 
		//Collection에 변화가 있으면 true를 그렇지 않으면 false를 반환한다.
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		boolean result10 = c1.retainAll(c);
		System.out.println(c1);
		
		
		//int size()
		//Collection에 저장된 객체의 개수를 반환한다.
		int result11 = c1.size();
		System.out.println(result11);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		
		//Object[] toArray()
		//Collection에 저장된 개체를 객체배열(Object[])로 반환한다.
		Object[] iarr = c1.toArray();
		System.out.println(iarr[0]);
		
		//Object[] toArray(Object[] a)
		//저장된 배열에 Collection의 객체를 저장해서 반환한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
