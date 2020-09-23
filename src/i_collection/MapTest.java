package i_collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		
		Map<String, Integer> map = new HashMap<>();
		
		//C put사용
		map.put("강태경", 80);
		map.put("이하연", -100);
		map.put("김윤환", 70);
		map.put("박주영", -10);
		
		//Read
		int haha = map.get("이하연"); //언박싱
		
		//Update
		map.put("박주영", 50);  // 기존에 같은 키값이 있으면 새로운값으로 바뀐다. 키가 오타가 생기면 문제가 생긴다
		//JDK 1.8에서는 
		//replace()
		// map.replace("박주영",50);
		// map.replace("박주영",-10,50);
		
		//Delete
		int a = map.remove("이하연"); // 반환타입에 문제가 생긴다.
		Integer a1 = map.remove("이하연"); // 참조형이라 null이어도 문제가 생기지 않는다 .
		
		
		
		
		//HashMap()
		//HashMap객체를 생성
		Map<String, Integer> mapp = new HashMap<>();
		mapp.put("강태경", 80);
		mapp.put("홍정기", 80);
		mapp.put("이하연", -100);
		mapp.put("김윤환", 70);
		mapp.put("박주영", -10);
		
		//HashMap (int)
		//지정된 값을 초기 용향으로 하는 HashMap객체를 생성
		Map<String, Integer> mapp2 = new HashMap<>(3);
		mapp2.put("강태경", 80);
		mapp2.put("홍정기", 80);
		mapp2.put("이하연", -100);
		mapp2.put("김윤환", 70);
		mapp2.put("박주영", -10);
		
		//HashMap(Map m)
		//지정된 m의 모든 요소를 포함하는 HashMap을 생성
		Map<String, Integer> mapp3 = new HashMap<>(mapp);
		
		//void clear()
		//Map의 모든 객체를 삭제한다.
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
		//boolean containsKey(Object key)
		//지정된 key객체와 일치하는 Map의 key객체가 있는지 확인한다.
		boolean result = mapp.containsKey("강태경");
		System.out.println(result);
		
		//boolean containsValue(Object value)
		boolean result2 = mapp.containsValue(80);
		System.out.println(result2);
		
		//Set entrySet()
		//Map에 저장되어 있는 key-value쌍을
		//Map.Entry타입의 객체로 저장한 Set으로 반환한다.
		Set<Entry<String, Integer>> set = mapp.entrySet(); 
		
		
		//boolean equals(Object o)
		//동일한 Map인지 비교한다.
		boolean result3 = mapp.equals(mapp2);
		System.out.println(result3);
		
		//Object get(Object key)
		//지정한 key객체에 대응하는 value객체를 찾아서 반환한다.
		int unboxing = mapp.get("강태경");
		System.out.println(unboxing);
		
		//int hashCode()
		//해시코드를 반환한다. 비트
		int hashCode = mapp.hashCode();
		System.out.println(hashCode);
		
		//boolean isEmpty()
		//Map이 비어있는지 확인한다.
		boolean result4 = map.isEmpty();
		System.out.println(result4);
		
		//Set keySet()
		//Map에 저장된 모든 key객체를 반환한다.
		Set<String> setMapKey = mapp.keySet();
		System.out.println(setMapKey);
		
		//Object put(Object key, Object value)
		Map<String, Integer> mapp4 = new HashMap<>(mapp);
		mapp4.put("강태경", 80);
		mapp4.put("홍정기", 80);
		mapp4.put("이하연", -100);
		mapp4.put("김윤환", 70);
		mapp4.put("박주영", -10);
		
		//void putAll
		Map<String, Integer> mapp5 = new HashMap<>(mapp);
		mapp5.putAll(mapp4);
		System.out.println(mapp5);
		
		//Object remove(Object key)
		//지정한 key객체와 일치하는 key-value객체를 삭제한다.
		mapp4.remove("강태경");
		System.out.println(mapp4);
		
		//int Size()
		//Map에 저장된 key-value쌍의 개수를 반환한다.
		int result5 = mapp4.size();
		System.out.println(result5);
		
		//Collection values()
		//Map에 저장된 모든 value객체를 반환한다.
		Collection<Integer> c = new HashSet<>();
		c = mapp4.values();
		System.out.println(c);
		
		
		
		
		
		
	}
}
