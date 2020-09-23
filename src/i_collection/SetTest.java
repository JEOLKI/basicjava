package i_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {

		List<List<Integer>> allList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {


			//1. Set객체를 만들어 주세요  변수명 set
			Set<Integer> set = new HashSet<>();

			//2.set에 1~45사이의 임의의 정수 값으로 채워주세요
			// 단. set이 6개의 정수값을 저장할때까지 반복해 주세요

			while(set.size() < 6){
				boolean result = set.add((int)(Math.random()*45+1));
				//			System.out.println(result);
			}

			System.out.println(set);



			//3. set을 정렬해주세요

			List<Integer> list = new ArrayList<>(set);

			Collections.sort(list);
			//		System.out.println(list);

			allList.add(list);



			//4. 5게임이 되게 만드세요


		}


		System.out.println(allList);




	}
}
