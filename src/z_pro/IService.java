package z_pro;

import java.util.Vector;

public interface IService {
	// db에 가야될 목록의 모음집
	
	///////////////////////////////////////// 회원 기능 단 /////////////////////////////////////////////////////
	
	
	/**
	 * 로그인을 위한 메서드
	 * @param mem_id 사람의 아이디
	 * @param mem_pass 사람의 비밀번호
	 * @return id와 pw가 일치하는 한명의 정보
	 */
	MemberVO logIn(String mem_id, String mem_pass);
	
	
	
	
	/**
	 * 회원가입을 위한 메서드
	 * @param mv
	 * @return 회원가입여부
	 */
	boolean signUp(MemberVO mv);
	
	
	/**
	 * 회원가입시 아이디 체크를 위한 메서드
	 * @param mem_id
	 * @return 아이디 중복여부
	 */
	boolean signUpIdCheck(String mem_id);
	
	
	/**
	 * 회원 비밀번호 수정을 위한 메서드
	 * @param logIn 로그인 한 사람의 정보
	 * @param memVec 수정할 비밀번호
	 * @return 비밀번호 변경 여부
	 */
	boolean mChpass(MemberVO logIn, Vector memVec);
	
	/**
	 * 회원 이름 수정을 위한 메서드
	 * @param logIn 로그인 한 사람의 정보
	 * @param memVec 수정할 이름
	 * @return 이름의 수정 여부
	 */
	boolean mChname(MemberVO logIn, Vector memVec);
	
	
	/**
	 * 회원 나이 수정을 위한 메서드
	 * @param logIn 로그인 한 사람의 정보
	 * @param memVec 수정할 나이
	 * @return 나이 수정 여부
	 */
	boolean mChage(MemberVO logIn, Vector memVec);

	
	/**
	 * 회원 직업 수정을 위한 메서드
	 * @param logIn
	 * @param memVec
	 * @return 직업수정여부
	 */
	boolean mChjob(MemberVO logIn, Vector memVec);
	
	
	
	
	/**
	 * 회원들을 리스트화 하기위한 메서드
	 * @return void
	 */
	void memListView();

	
	
	/**
	 * 회원 검색을 위한 메서드
	 * @param mem_id 사람의 아이디
	 * @return id와 일치하는 한명의 모든 정보
	 */
	MemberVO searchMember(String mem_id);


	
	
	
	/**
	 * 회원탈퇴를 위한 메서드
	 * @param logIn 로그인한 회원의 정보
	 * @param mem_pass 입력한 비밀번호
	 * @return Boolean
	 */
	MemberVO removeMem(String mem_id, String mem_pass);

	
	///////////////////////////////////////// 게시판 기능 단 /////////////////////////////////////////////////////
	
	/**
	 * 게시판 뷰를 위한 메서드
	 */
	void notesView();

	
	
	
	/**
	 * 게시글을 작성하기 위한 메서드
	 * @param mem_id 로그인한 회원의 아이디
	 * @param note_title 입력한 게시글의 제목
	 * @param note_intext 입력한 게시글의 내용
	 */
	void noteWrite(String mem_id, String note_title, String note_intext);


	
	/**
	 * 게시글을 수정하기 위한 메서드
	 * @param note_num 로그인한 회원의 아이디
	 * @param mem_id 수정할 게시글의 제목
	 * @param note_intext 수정할 게시글의 게시글 번호
	 * @return
	 */
	boolean noteReWrite(int note_num, String mem_id, String note_intext);


	
	/**
	 * 게시글을 삭제하기 위한 메서드
	 * @param mem_id 
	 * @param logIn 로그인한 회원의 정보
	 * @param note_remove 삭제할 게시글의 번호
	 */
	NoteVO noteRemove(String mem_id, int note_remove);


	
	/**
	 * 게시글 삭제 전 비밀번호 확인 메서드
	 * @param mem_pass 로그인한 비밀번호 정보
	 * @return 패스워드의 확인여부
	 */
	boolean checkPass(String mem_pass);

	
	/**
	 * 작성한 게시글 확인을 위한 메서드
	 * @param mem_pass 로그인한 비밀번호 정보
	 */
	void myNoteView (String mem_id);


	




	




	




	

	





	


	




	




	
}
