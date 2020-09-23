package h_javalang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList 메서드 활용예제
 * @author PC-01
 *
 */

public class ArrayTest {
	public static void main(String[] args) {
		
	
		
		// ArrayList()
		ArrayList al = new ArrayList<>();  // 크기가 0인 ArrayList를 생성
				
		
		// ArrayList(Collection c)
		String[] arr1 = new String[3];
		ArrayList collection = new ArrayList<>();
		collection.add(arr1);
		ArrayList collc = new ArrayList<>(collection);	// 주어진 컬렉션이 저장된 ArrayList를 생성
		
		
		// ArrayList(int initialCapacity)
		ArrayList initialCapacity = new ArrayList<>(3); // 지정된 초기용량을 갖는 ArrayList를 생성
		
		
		// boolean add(Object o)
		boolean add = al.add("123");  // ArrayList의 마지막에 객체를 추가.성공하면 true 반환
		System.out.println(add);  // true
		
		
		// void add(int index, Object element)
		al.add(0, "456"); //지정된 index에 객체를 저장한다. 한칸씩 뒤로 밀려나게 된다/
		System.out.println(al.toString()); // 456 123 

		 
		// boolean addAll(Collection c) 
		ArrayList arrAddAll = new ArrayList<>(); 
		boolean addcollection = arrAddAll.addAll(collection); // 주어진 컬렉션의 모든 객체를 저장한다.
				
		
		// void clear() 
		al.clear();  //ArrayList를 완전히 비운다
		System.out.println(al.toString()); // []
		 
		
		// Object clone()
		ArrayList al2 = new ArrayList<>();
		
		al2.add("123");
		al2.add("456");
		
		Object b = al2.clone(); // ArrayList를 복제한다.
		System.out.println(b.toString()); // [123, 456]
		 
		
		// boolean contains(Object o)
		boolean containsType = al2.contains("123"); // 지정된 객체가 ArrayList에 포함되어 있는지 확인 
		System.out.println(containsType); // boolean 타입 // true
		
		
		// Object get(int index)
		al2.get(0); // 지정된 index에 저장된 객체를 반환한다.
		System.out.println(al2.get(0));  // 123
		
		
		// int indexOf(Object o)
		int index = al2.indexOf("123"); // "123"객체가 저장된 위치(index)를 찾아 반환한다.
		System.out.println(index);  // 0
		
		
		// boolean isEmpty()
		boolean empty = al2.isEmpty(); // ArrayList가 비어있는지 확인한다. boolean 타입 
		System.out.println(empty); // false // 사이즈가 0이면 true
		
		
		// Iterator iterator()
		Iterator i = al2.iterator(); // ArrayList의 iterator객체를 반환 ???
		
		
		// Object remove (int index)
		Object r = al2.remove(0); //지정된 위치(index)에 있는 객체를 제거한다.
		System.out.println(r);  // 123
		System.out.println(al2.toString()); //456
		
		
		// boolean remove(Object o)
		boolean rm = al2.remove("456"); // 지정된 객체를 삭제한다. 반환타입 boolean
		System.out.println(rm); // true
		
		
		// boolean removeAll(Collection c)
		// 지정된 Collection에 저장된 것과 동일한 객체들을 ArrayList에서 제거한다.
		boolean remove = al2.removeAll(collection);
		
		
		// boolean retainAll(Collection c)
		// ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통괸 것들만을 남기고 나머지는 삭제한다.
		boolean retainall = al2.retainAll(collection);
		
		
		// Object set(int index, Object element)
		al2.add("123");
		System.out.println(al2.toString());
		
		Object d = al2.set(0, "789");  // 주어진 객체(element)를 지정된 위치에 저장한다. 
		System.out.println(d); // 해당 index의 객체를 반환
		System.out.println(al2.toString()); // 789
		
		
		// int size()
		int size = al2.size(); // ArrayList에 저장된 객체의 개수를 반환한다.
		System.out.println(size); // 1
		
		
		// void sort(Comparator c)
		// 지정된 정렬기준(c)으로 ArrayList를 정렬

		
		// List subList(int fromIndex, int toIndex)
		// fromIndex부터 toIndex사이에 저장된 객체를 반환한다.
		al2.add("1");
		al2.add("2");
		al2.add("3");
		al2.add("4");
		al2.add("5");
		System.out.println(al2.toString());
		
		List list = al2.subList(1, 4); // index 1번부터 3번까지 4번 미포함
		System.out.println(list);
		
		
		// Object[] toArray()
		// Collection에 저장된 객체를 객체배열(Object[])로 반환한다.
		Object[] bb = al2.toArray();
		
		
		// Object[] toArray(Object[] a)
		// 지정된 배열에 Collection의 객체를 저장해서 반환한다.
		Object[] cc = al2.toArray(bb);
		
		
		
		
		
		
		
		
	}
}
