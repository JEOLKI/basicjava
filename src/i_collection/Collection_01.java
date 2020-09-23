package i_collection;

public class Collection_01 {
	public static void main(String[] args) {
		/*
		
		1. collection framework
		  - 의미
		    : collection은 다수의 데이터
		    : framework은 표준화된 프로그래밍방식
		    
		2. 핵심인터페이스
		  - List
		    : 순서가 있다
		    : 데이터의 중복을 허용한다.
		    : 대기자 명단
		      ArrayList, LinkedList, Stack, Vector ....
		    
		  - Set
		    : 순서가 없다
		    : 데이터의 중복을 허용하지않는다.
		    : ~의 집합
		      HashSet, TreeSet
		    
		  - Map
			: 순서가 없다
			: key, value로 이루어져 있다.
			: key 중복을 허용하지 않는다.
			: value는 중복을 허용한다.
			: 우편번호, 지역번호
			  HashTable, HashMap, TreeMap, Properties
			  
		3. List
		  - Vector와 ArrayList
		    : Vector는 동기화를 보장한다.
		    : Object배열을 이용해서 데이터를 순차적으로 저장한다.
		    : 배열이 커져서 기존 배열크기로 안될때 새로운 배열을 만들어 배열을 복사한다.
		
		  - LinkedList
		    : 배열의 단점을 보완하기 위해 만들어짐
		    : 자신과 연결된 다음 요소에 대한 주소값과 데이터로 이루어져 있다.
		    
		  - DoubleLinkedList
		    : 자신과 연결된 다음요소, 이전요소, 데이터로 이루어져 있다.
		
		  - Stack과 Queue
		  	: Stack
		  	  - LIFO, FILO
		  	  - 저장 : push()
		  	         추출 : pop()
		  	         맨위 객체를 반환 : peak()
		  	         주어진 객체 찾기 : search()
		  	         
		  	: Queue
		  	  - FIFO
		  	  - 저장 : offer()
		  	         추출 : poll()
		  
		4. Iterator, ListIterator
		  - 컬렉션에서 저장된 요소들을 읽어오는 방법
		  
		5. Set
		  - HashSet, TreeSet
		  - add메서드나 addAll메서드를 사용할 때 기존에 있던 데이터를 추가하려고 하면 등록에 실패하게 된다. //반환타입을 잘 활용
		  
		  
		6. Map
		  - HashMap, TreeMap, ...
		  - Map은 키와 값의 묶음으로 데이터를 저장한다.
		  - Map<Object,Object>이지만 일반적으로 key는 구분하기 위한 문자열로 많이 다룬다.
		  - key의 경우에는 유일해야 한다. 
		  
		  
		  
		
		
		*/
		
		
		
	}
}
