package pro;

/**
 * 게시글의 정보를 저장하기 위한 클래스
 * @author HONG JEONGGI
 * @since 2020.06.29
 */

public class NoteVO {
	
	static int note_count = 0; //게시글 번호부여를 위한 번호 (순차적으로 증가)
	private int note_id; //게시글 번호 PK 
	private String note_title; //게시글의 제목
	private String note_content; //게시글의 내용
	private String note_date; // 게시글의 작성일자
	private String mem_id; //게시글 작성자 FK 
	
	
	public int getNote_id() {
		return note_id;
	}
	public void setNote_id(int note_id) {
		this.note_id = note_id;
	}
	public String getNote_title() {
		return note_title;
	}
	public void setNote_title(String note_title) {
		this.note_title = note_title;
	}
	public String getNote_content() {
		return note_content;
	}
	public void setNote_content(String note_content) {
		this.note_content = note_content;
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
