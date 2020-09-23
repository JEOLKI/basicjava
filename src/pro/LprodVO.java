package pro;

/**
 * 상품의 분류코드를 저장하기 위한 클래스
 * @author HONG JEONGGI
 * @since 2020.06.30
 *
 */
public class LprodVO {
	
	static int note_count = 0; //분류아이디 부여를 위한 번호 (순차적증가)
	private int lprod_id;  //분류번호 
	private String lprod_gu; //분류코드 PK
	private String lprod_nm; //분류명
	
	public static int getNote_count() {
		return note_count;
	}
	public static void setNote_count(int note_count) {
		LprodVO.note_count = note_count;
	}
	public int getLprod_id() {
		return lprod_id;
	}
	public void setLprod_id(int lprod_id) {
		this.lprod_id = lprod_id;
	}
	public String getLprod_gu() {
		return lprod_gu;
	}
	public void setLprod_gu(String lprod_gu) {
		this.lprod_gu = lprod_gu;
	}
	public String getLprod_nm() {
		return lprod_nm;
	}
	public void setLprod_nm(String lprod_nm) {
		this.lprod_nm = lprod_nm;
	}
	

	
	
}
