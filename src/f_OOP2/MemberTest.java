package f_OOP2;

import java.util.Scanner;

public class MemberTest {
	public static void main(String[] args) {
		//2. 사람 여러명을 저장할 수 있는 변수 memList를 선언 및 생성해주세요
		MemberVO[] memList = new MemberVO[24];
		
		//3. 회원가입을 진행해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		for(int memCount = 0 ; memCount < memList.length ; memCount++){
			
			System.out.println("회원가입 하시겠습니까? \n (yes/no)");
			String enter = sc.next();
			
			if("yes".equals(enter)){
				
				System.out.println("ID를 입력해주세요");
				String mem_id = sc.next();
				System.out.println("PASSWORD를 입력해주세요");
				String mem_pass = sc.next();
				System.out.println("이름을 입력해주세요");
				String mem_name = sc.next();
				System.out.println("직업을 입력해주세요");
				String mem_job = sc.next();
				//mem 이라는것을 통해 예측이 가능하다.
				
				MemberVO mv1 = new MemberVO();
				
				mv1.setMem_id(mem_id);
				mv1.setMem_pass(mem_pass);
				mv1.setMem_name(mem_name);
				mv1.setMem_job(mem_job);
				
				memList[memCount] = mv1;
				
				System.out.println("회원가입 완료\n" + mv1.toString());
				
			} else {
				break;
			}
		}
	}
}

/**
 * 맴버 한명의 정보를 저장하기 위한 클래스
 * @author PC-01
 *
 */
class MemberVO{
	//1. DB를 보고 변수를 만든다.
	private	String mem_id;  // 사람의 아이디
	private	String mem_pass; // 사람의 비밀번호 
	private	String mem_name; // 사람의 이름
	private	String mem_job; // 사람의 직업
	
	public String getMem_id() {
		return mem_id;
	}
	
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
	public String getMem_pass() {
		return mem_pass;
	}
	
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	
	public String getMem_name() {
		return mem_name;
	}
	
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	
	public String getMem_job() {
		return mem_job;
	}
	
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}

	@Override
	public String toString() {
		return "MemberVO [mem_id=" + mem_id + ", mem_pass=" + mem_pass
				+ ", mem_name=" + mem_name + ", mem_job=" + mem_job + "]";
	}
	
	
	
}