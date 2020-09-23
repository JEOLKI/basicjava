package z_pro;

import java.util.Vector;

public class IServiceimpl implements IService{
	
	private DBClass db = new DBClass();
	
	
	////////////////////////////////////////  회원관리 기능단 ////////////////////////////////////////////////////////////////
	
	// 로그인 단
	@Override
	public MemberVO logIn(String mem_id, String mem_pass) {
		
		MemberVO mv = db.logIn(mem_id, mem_pass);
		
		return mv;
	}

	
	
	// 회원가입
	@Override
	public boolean signUp(MemberVO mv) {
		
		return db.signUp(mv);
	}
	// 회원가입시 아이디 중복 체크
	@Override
	public boolean signUpIdCheck(String mem_id) {
		return db.signUpIdCheck(mem_id);
	}
	
	
	// 회원 비밀번호 수정 단
	@Override
	public boolean mChpass(MemberVO logIn, Vector memVec) {
		boolean memchpass = false;
		memchpass = db.memChpass(logIn, memVec);
		return memchpass;
	}
	// 회원 이름 수정단
	@Override
	public boolean mChname(MemberVO logIn, Vector memVec) {
		boolean memchname = false;
		memchname = db.memChname(logIn, memVec);
		return memchname;
	}
	// 회원 나이 수정단
	@Override
	public boolean mChage(MemberVO logIn, Vector memVec) {
		boolean memchage = false;
		memchage = db.memChage(logIn, memVec);
		return memchage;
	}
	// 회원 직업 수정단
	@Override
	public boolean mChjob(MemberVO logIn, Vector memVec) {
		boolean memchjob = false;
		memchjob = db.memChjob(logIn, memVec);
		return memchjob;
	}


	
	
	
	
	
	
	

	// 회원들 뷰 단
	@Override
	public void memListView() {
		db.memListV();
	}


	

	// 회원검색
	@Override
	public MemberVO searchMember(String mem_id) {
		MemberVO mv = db.searchMember(mem_id);
		return mv;
	}

	
	
	
	
	// 회원 탈퇴
	@Override
	public MemberVO removeMem(String mem_id, String mem_pass) {
		MemberVO mv9 = db.removeMem(mem_id, mem_pass);
		return mv9;
	}

	//////////////////////////////////////// 게시판 관리 기능단 ////////////////////////////////////////////////////////////////
	
	
	// 게시판 뷰 단
	@Override
	public void notesView() {
		db.notesView();
	}


	// 게시글 작성 단
	@Override
	public void noteWrite(String mem_id, String note_title, String note_intext) {
		db.noteWrite(mem_id, note_title, note_intext);
	}


	//게시글 수정 단
	@Override
	public boolean noteReWrite(int note_num, String mem_id, String note_intext) {
		boolean reWriteResult = db.editboard(note_num, mem_id, note_intext);
		return reWriteResult;
	}

	
	// 게시물삭제
	@Override
	public NoteVO noteRemove(String mem_id, int note_remove) {
			return db.noteRemove(mem_id ,note_remove);
			
		
	}
	
	// 비밀번호확인
	@Override
	public boolean checkPass(String mem_pass) {
		boolean mv = db.checkPass(mem_pass);
		return mv;
	}
	
	// 작성한 게시물 확인
	@Override
	public void myNoteView(String mem_id) {
		db.myNoteView(mem_id);
		
	}



	



	






	






	










	




}
