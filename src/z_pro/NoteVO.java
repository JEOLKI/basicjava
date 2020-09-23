package z_pro;
/**
 * 게시글 정보를 저장하는 클래스
 * @author PC-10
 * @since 2020.06.26
 */

public class NoteVO {
	
	static int note_count=0; // 게시글의 번호를 부여
	private int note_number; // 게시글 번호 pk
	private String note_title; // 게시글 제목
	private String note_inText; // 게시글 내용
	private String note_date; // 게시글 날짜
	private String mem_id; // 게시글 작성자
	
	
	
	
	public int getNote_number() {
		return note_number;
	}
	public void setNote_number(int note_number) {
		this.note_number = note_number;
	}
	
	
	
	public String getNote_title() {
		return note_title;
	}
	public void setNote_title(String note_title) {
		this.note_title = note_title;
	}
	
	
	
	public String getNote_inText() {
		return note_inText;
	}
	public void setNote_inText(String note_inText) {
		this.note_inText = note_inText;
	}
	
	
	
	public String getNote_date() {
		return note_date;
	}
	public void setNote_date(String note_date) {
		this.note_date = note_date;
	}
	
	
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	
	
	
	
	
	
	
	
	

}
