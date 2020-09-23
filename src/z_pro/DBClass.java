package z_pro;

import java.util.Vector;

/**
 * 정보를 저장하기 위한 클래스
 * @author PC-10
 * @since 2020.06.26
 */
public class DBClass {
	// 사람들
	private Vector<MemberVO> memList = new Vector<>();
	{
		// 사람 3명을 초기화 하기 위한 초기화 블럭
		
		
		// 사람의 정보 저장
		MemberVO mem1 = new MemberVO();
		mem1.setMem_id("a001"); // pk
		mem1.setMem_pass("asdfasdf");
		mem1.setMem_name("김은대");
		mem1.setMem_age(63);
		mem1.setMem_job("주부");
		
		MemberVO mem2 = new MemberVO();
		mem2.setMem_id("b001"); // pk
		mem2.setMem_pass("1004");
		mem2.setMem_name("이쁜이");
		mem2.setMem_age(46);
		mem2.setMem_job("회사원");
		
		MemberVO mem3 = new MemberVO();
		mem3.setMem_id("c001"); // pk
		mem3.setMem_pass("7777");
		mem3.setMem_name("신용환");
		mem3.setMem_age(62);
		mem3.setMem_job("교사");
		
		
		
		
		// 사람의 정보들을 memList 벡터배열에 add
		memList.add(mem1);
		memList.add(mem2);
		memList.add(mem3);
		
		
	}
	
	
	
	// 게시글들
	private Vector<NoteVO> noteList = new Vector<>();
	{
		// 게시글 3개를 초기화 하기 위한 초기화 블럭
		
		
		// 게시글의 정보 저장
		NoteVO note1 = new NoteVO();
		note1.setNote_number(++note1.note_count); // pk
		note1.setNote_title("테스트1");;
		note1.setNote_inText("테스트테스트");
		note1.setNote_date("2020.06.26");
		note1.setMem_id(memList.get(0).getMem_id()); // fk
		
		NoteVO note2 = new NoteVO();
		note2.setNote_number(++note1.note_count); // pk
		note2.setNote_title("테스트2");;
		note2.setNote_inText("스트스트레스");
		note2.setNote_date("2020.06.26");
		note2.setMem_id(memList.get(1).getMem_id()); // fk
		
		NoteVO note3 = new NoteVO();
		note3.setNote_number(++note1.note_count); // pk
		note3.setNote_title("테스트3");;
		note3.setNote_inText("레드불,몬스터 좋아");
		note3.setNote_date("2020.06.26");
		note3.setMem_id(memList.get(2).getMem_id()); // fk
		
		
		
		// 게시글의 정보들을 noteList 벡터배열에 add
		noteList.add(note1);
		noteList.add(note2);
		noteList.add(note3);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////  회원 기능 단   /////////////////////////////////////////////////////////////
	
	// 로그인      login시 입력한 아이디와 비번을 비교
	public MemberVO logIn(String mem_id, String mem_pass) {
		
		MemberVO mv = null;
		
		for (int member = 0; member < memList.size(); member++) {
			if(memList.get(member).getMem_id().equals(mem_id) && memList.get(member).getMem_pass().equals(mem_pass)){
				mv = memList.get(member);
				break;
			}
		}
		
		return mv;
	}


	
	
	
	///////////////////////////////// 회원 정보 수정 단 ///////////////////////
	// 회원 비밀번호 수정  
	public boolean memChpass(MemberVO logIn, Vector memVec) {
		boolean memChpass = false;
		
		for(int member=0; member<memList.size(); member++){
			if(memList.get(member).getMem_id().equals(logIn.getMem_id()) && memVec.get(0)!=null){
				memList.get(member).setMem_pass((String)memVec.get(0));
				memChpass = true;
				break;
			}
		}
		return memChpass;
	}
	// 회원 이름 수정
	public boolean memChname(MemberVO logIn, Vector memVec) {
		
		boolean memChname = false;
		for(int member=0; member<memList.size(); member++){
			if(memList.get(member).getMem_id().equals(logIn.getMem_id()) && memVec.get(0)!=null){
				memList.get(member).setMem_name((String)memVec.get(0));
				memChname = true;
				break;
			}
		}
		return memChname;
	}
	// 회원 나이 수정
	public boolean memChage(MemberVO logIn, Vector memVec) {
		boolean memChage = false;
		for(int member=0; member<memList.size(); member++){
			if(memList.get(member).getMem_id().equals(logIn.getMem_id()) && memVec.get(0)!=null){
				memList.get(member).setMem_age((int)memVec.get(0));
				memChage = true;
				break;
			}
		}
		return memChage;
	}
	// 회원 직업 수정
	public boolean memChjob(MemberVO logIn, Vector memVec) {
		boolean memChjob = false;
		for(int member=0; member<memList.size(); member++){
			if(memList.get(member).getMem_id().equals(logIn.getMem_id()) && memVec.get(0)!=null){
				memList.get(member).setMem_job((String)memVec.get(0));
				memChjob = true;
				break;
			}
		}
		return memChjob;
	}



	
	//회원아이디의 중복에 관한 메서드
	public boolean signUpIdCheck(String mem_id) {
		boolean result = false;
		for(int count = 0 ; count < memList.size() ; count++ ){
			result = memList.get(count).getMem_id().equals(mem_id);
			if(result){
				return result;
			}
		}
		return result;
	}


	//회원가입에 관한 메서드
	public boolean signUp(MemberVO mv){
		boolean result = memList.add(mv); //맴버리스트에 회원의 정보를 저장
		return result;
	}

	
	
	// 회원 리스트 뷰 단
	public void memListV() {
		System.out.println("=====================================================================================================");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s", "mem_id", "mem_pass", "mem_name", "mem_age", "mem_job");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(int member=0; member<memList.size(); member++){
			
			System.out.printf("%-20s %-20s %-42s %-20d %-20s", 
					memList.get(member).getMem_id(), memList.get(member).getMem_pass(), 
					memList.get(member).getMem_name(), memList.get(member).getMem_age(), 
					memList.get(member).getMem_job());
			
			System.out.println();
		}
		System.out.println("=====================================================================================================");
		
	}
	
	
	
	
	
	
	


	
	// 회원검색 메서드
	public MemberVO searchMember(String mem_id) {
		MemberVO mv = null;
		for(int i =0; i<memList.size(); i++){
			if(memList.get(i).getMem_id().equals(mem_id)){
				mv = memList.get(i);
				break;
			}
		}
		return mv;
	}


	
	
	
	// 탈퇴
	public MemberVO removeMem(String mem_id, String mem_pass) {
		MemberVO mvl = null;
		for (int i = 0; i < memList.size(); i++) {
			if (memList.get(i).getMem_id().equals(mem_id)
					&& memList.get(i).getMem_pass().equals(mem_pass)) {
				MemberVO temp = memList.get(i);
				mvl = memList.get(i);
				memList.remove(temp);
				break;
			}
		}
		return mvl;
	}


	




	///////////////////////////////////////////////////////  게시판 기능 단   /////////////////////////////////////////////////////////////
	
	
	
	
	//게시글 목록을 보기위한 메서드
	public void notesView() {
		System.out.println("\t 게시글 목록 \n");
		System.out.println("글번호\t글제목\t작성자\t작성일자");
		
		for(int index = 0 ; index < noteList.size() ; index++){
			System.out.println(noteList.get(index).getNote_number() + "\t" + 
						       noteList.get(index).getNote_title() + "\t" + 
					           noteList.get(index).getMem_id()+ "\t" + 
		                       noteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ noteList.size()+"개");
		
	}

	
	
	
	
	// 게시글을 작성하는 메서드 단
	public void noteWrite(String mem_id, String note_title, String note_intext) {
		
		NoteVO nt = new NoteVO();
		nt.setNote_number(++nt.note_count);
		nt.setNote_title(note_title);
		nt.setNote_inText(note_intext);
		nt.setNote_date("2020.06.27");
		nt.setMem_id(mem_id);
		
		noteList.add(nt);
	}

	
	
	
	
	
	//게시글 수정
	public boolean editboard(int note_num, String mem_id, String note_intext) {
		boolean noteRewrite = false; 
		for (int note = 0; note < noteList.size(); note++) {
			if (memList.get(note).getMem_id().equals(mem_id) && noteList.get(note).getNote_number()==(note_num)){
				noteList.get(note).setNote_inText(note_intext);
				noteRewrite= true;
				break;
			}
		}
		return noteRewrite;
	}	
	
	

	// 게시판 삭제
	public NoteVO noteRemove(String mem_id, int note_remove) {
	
		NoteVO b=null;
		for(int i=0; i<noteList.size(); i++){
			if(noteList.get(i).getNote_number()==note_remove && noteList.get(i).getMem_id().equals(mem_id)){
				b= noteList.remove(i);
				break;
			} else{
				
			}
		}
		
		return b;
	}

		
		
		
	// 비밀번호 확인
	public boolean checkPass(String mem_pass) {
		boolean result = false;
		for(int i=0; i<memList.size(); i++){
			if(memList.get(i).getMem_pass().equals(mem_pass)){
				result = true;
				return result;
			}else{
				result = false;
			}
		}
		return result;
	}
		
	// 작성한 게시글 확인
	public void myNoteView(String mem_id) {
		
		Vector<NoteVO> myNote = new Vector<>();
		
		for (int index = 0 ; index < noteList.size() ; index++){
			if(noteList.get(index).getMem_id().equals(mem_id)){
				myNote.add(noteList.get(index));
			} 
		}
		
		System.out.println("작성한 글목록");
		System.out.println("글번호\t글제목\t작성자\t작성일자");
		for (int index = 0; index < myNote.size(); index++) {
			System.out.println(myNote.get(index).getNote_number() + "\t" +
		                       myNote.get(index).getNote_title() + "\t" +
					           myNote.get(index).getMem_id()+ "\t" +
		                       myNote.get(index).getNote_date() );
		}
	}

	
	
}
