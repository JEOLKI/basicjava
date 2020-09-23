package z_pro;

/**
 * 사람의 정보를 저장하기 위한 클래스
 * @author PC-10
 * @since 2020.06.26
 */

public class MemberVO {
	private String mem_id; // 사람의 아이디 PK
	private String mem_pass; // 사람의 비밀번호
	private String mem_name; // 사람의 나이
	private int mem_age; // 사람의 나이
	private String mem_job; // 사람의 직업
	
	
	
	
	
	
	// 회원 아이디
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
	
	
	// 회원 비밀번호
	public String getMem_pass() {
		return mem_pass;
	}
	public void setMem_pass(String mem_pass) {
		this.mem_pass = mem_pass;
	}
	
	
	
	// 회원 이름
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	
	
	
	// 회원 직업
	public String getMem_job() {
		return mem_job;
	}
	public void setMem_job(String mem_job) {
		this.mem_job = mem_job;
	}
	
	
	
	// 회원 나이
	public int getMem_age() {
		return mem_age;
	}
	public void setMem_age(int mem_age) {
		this.mem_age = mem_age;
	}
}
