package e_OOP;

public class ArrayTest {
	public static void main(String[] args) {
		//1. 사람 4명을 저장할수 있는 변수 memArr을 선언및 생성해주세요
		
		MemberVO[] memArr = new MemberVO[4];
		
		
		
		//2. 첫번째 사람은 김은대...  "a001", "asdfasdf", "주부", 76 
		// 	  두번째 사람은 이쁜이...  "b001", "1004", "회사원", 74
		//   세번째 사람은 신용환...	 "c001", "7777" "교사", 74
		//   네번째 사람은 성윤미...	 "doo1", "123joy", "공무원", 46
		//   4명의 정보를 memArr에 저장해주세요
		
		
		
		
		
		MemberVO mem_name1 = new MemberVO();
		mem_name1.mem_id = "a001";
		mem_name1.mem_job = "주부";
		mem_name1.mem_pw = "asdfasdf";
		mem_name1.mem_age = 76;	
		memArr[0] = mem_name1;
		
		
		MemberVO mem_name2 = new MemberVO();
		mem_name2.mem_id = "b001";
		mem_name2.mem_job = "회사원";
		mem_name2.mem_pw = "1004";
		mem_name2.mem_age = 74;
		memArr[1] = mem_name2;
		
		MemberVO mem_name3 = new MemberVO();
		mem_name3.mem_id = "c001";
		mem_name3.mem_job = "교사";
		mem_name3.mem_pw = "7777";
		mem_name3.mem_age = 74;
		memArr[2] = mem_name3;
		
		MemberVO mem_name4 = new MemberVO();
		mem_name4.mem_id = "doo1";
		mem_name4.mem_job = "공무원";
		mem_name4.mem_pw = "123joy";
		mem_name4.mem_age = 46;
		memArr[3] = mem_name4;


		for(int i = 0 ; i < memArr.length ; i++){
			memArr[i].ageUp();
		}
		
		
		
		
		
		
		
		
		
		
	}
}


/**
 * 사람한명의 정보를 저장하는 클래스
 * @author PC-01
 * @since 2020.06.18
 */

class MemberVO{
	String mem_id;
	String mem_pw;
	String mem_job;
	int mem_age;
	
	void ageUp(){
		mem_age++;
	}
	
	
	
}







