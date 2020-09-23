package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


/**
 * 정보를 저장하기위한 클래스
 * @author HONG JEONGGI
 * @since 2020.06.29
 */
public class DBClass {
	
	//회원들을 저장하는 배열
	private  Vector<MemberVO> memList = new Vector<>();  
	{ //사람 3명을 초기화 하기위한 초기화 블럭
		MemberVO mv1 = new MemberVO();
		mv1.setMem_id("a001");
		mv1.setMem_pass("123");
		mv1.setMem_name("김은대");
		mv1.setMem_age(34);
		mv1.setMem_job("주부");
		
		MemberVO mv2 = new MemberVO();
		mv2.setMem_id("a002");
		mv2.setMem_pass("456");
		mv2.setMem_name("이쁜이");
		mv2.setMem_age(36);
		mv2.setMem_job("회사원");
		
		MemberVO mv3 = new MemberVO();
		mv3.setMem_id("a003");
		mv3.setMem_pass("789");
		mv3.setMem_name("신용환");
		mv3.setMem_age(23);
		mv3.setMem_job("교사");
		
		memList.add(mv1);
		memList.add(mv2);
		memList.add(mv3);
	}
	
	//게시글들을 저장하기 위한 배열
	private  Vector<NoteVO> noteList = new Vector<>(); 
	 { //게시글 3개를 등록 하기 위한 초기화 블럭
		NoteVO n1 = new NoteVO();
		n1.setNote_id(++NoteVO.note_count);
		n1.setNote_title("1번글제목");
		n1.setNote_content("금요일까지");
		n1.setNote_date("2020.06.29");
		n1.setMem_id(memList.get(0).getMem_id());

		NoteVO n2 = new NoteVO();
		n2.setNote_id(++NoteVO.note_count);
		n2.setNote_title("2번글제목");
		n2.setNote_content("빨리해서");
		n2.setNote_date("2020.06.30");
		n2.setMem_id(memList.get(1).getMem_id());

		NoteVO n3 = new NoteVO();
		n3.setNote_id(++NoteVO.note_count);
		n3.setNote_title("3번글제목");
		n3.setNote_content("제출하자");
		n3.setNote_date("2020.06.31");
		n3.setMem_id(memList.get(2).getMem_id());

		noteList.add(n1);
		noteList.add(n2);
		noteList.add(n3);
	}
	 
	//삭제된 게시글을 저장하기위한 배열
	private  Vector<NoteVO> byeNoteList = new Vector<>(); 
	 
	//제품분류를 저장하기위한 배열
	private Vector<LprodVO> lprodList = new Vector<>();
	{ //분류 3개를 등록 하기 위한 초기화 블럭
		LprodVO l1 = new LprodVO();
		l1.setLprod_id(++LprodVO.note_count);
		l1.setLprod_gu("P101");
		l1.setLprod_nm("컴퓨터제품");
		
		LprodVO l2 = new LprodVO();
		l2.setLprod_id(++LprodVO.note_count);
		l2.setLprod_gu("P201");
		l2.setLprod_nm("여성캐주얼");
		
		LprodVO l3 = new LprodVO();
		l3.setLprod_id(++LprodVO.note_count);
		l3.setLprod_gu("P301");
		l3.setLprod_nm("잡화");
		
		lprodList.add(l1);
		lprodList.add(l2);
		lprodList.add(l3);
	}
	 
	//거래처를 저장하기위한 배열
	private Vector<BuyerVO> buyerList = new Vector<>();
	{//거래처 3개를 등록하기 위한 초기화 블럭

		BuyerVO b1 = new BuyerVO();
		b1.setBuyer_id("P10101");
		b1.setBuyer_name("삼성컴퓨터");
		b1.setBuyer_lgu(lprodList.get(0).getLprod_gu());
		b1.setBuyer_bank("주택은행");
		b1.setBuyer_bankNo("123-456-7890");
		b1.setBuyer_bankName("이건상");
		b1.setBuyer_comTel("02-522-7890");
		b1.setBuyer_mail("samcom@samsung.co.kr");
		
		BuyerVO b2 = new BuyerVO();
		b2.setBuyer_id("P10102");
		b2.setBuyer_name("삼보컴퓨터");
		b2.setBuyer_lgu(lprodList.get(0).getLprod_gu());
		b2.setBuyer_bank("제일은행");
		b2.setBuyer_bankNo("732-702-195670");
		b2.setBuyer_bankName("김현우");
		b2.setBuyer_comTel("02-632-5690");
		b2.setBuyer_mail("sambo@sambo.co.kr");
		
		BuyerVO b3 = new BuyerVO();
		b3.setBuyer_id("P10103");
		b3.setBuyer_name("현주컴퓨터");
		b3.setBuyer_lgu(lprodList.get(0).getLprod_gu());
		b3.setBuyer_bank("국민은행");
		b3.setBuyer_bankNo("032-233-7832");
		b3.setBuyer_bankName("심현주");
		b3.setBuyer_comTel("02-522-7890");
		b3.setBuyer_mail("hyunju@hyunju.com");
		
		buyerList.add(b1);
		buyerList.add(b2);
		buyerList.add(b3);
	}
	 
	
	//////////////////////////////////////////////////////////////////////////////////////////////MemberVO 
	
	//회원가입을 위한 메서드
	public boolean createMember(MemberVO mv){
		boolean result = memList.add(mv); 
		return result;
	}

	//회원아이디 중복여부를 확인하기 위한 메서드
	public boolean createIdCheck(String mem_id) {
		boolean result = false;
		for(int count = 0 ; count < memList.size() ; count++ ){
			result = memList.get(count).getMem_id().equals(mem_id);
			if(result){
				return result;
			}
		}
		return result;
	}
	
	
	
	//접속메서드
	public List<String> localConnect(){
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userId = "HJG";
		String password = "java";
		
		List<String> connect = new ArrayList<>();
		connect.add(url);
		connect.add(userId);
		connect.add(password);
		
		return connect;
	}
	
	//로그인에 관한 메서드
	public MemberVO logIn(String mem_id, String mem_pass) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		MemberVO mv = null; 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			List<String> connect = this.localConnect();
			
			conn = DriverManager.getConnection(connect.get(0),connect.get(1), connect.get(2));
			
			stmt = conn.createStatement();
			
			String sql = "SELECT MAM_ID, MEM_PASS, MEM_NAME, MEM_AGE, MEM_JOB "
					   + "FROM   MEMBER "
					   + "WHERE  MEM_ID = '"+ mem_id +"' "
					   + "       MEM_PASS = '"+ mem_pass +"'";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				mv.setMem_id(rs.getString("mem_id"));
				mv.setMem_pass(rs.getString("mem_pass"));
				mv.setMem_name(rs.getString("mem_name"));
				mv.setMem_age(rs.getInt("mem_age"));
				mv.setMem_job(rs.getString("mem_job"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		} finally {
			
			try {
				
				if(rs != null){
					rs.close();
				}

				if(stmt != null){
					stmt.close();
				}
				
				if(conn != null){
					conn.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mv;
	}

	//회원 목록을 출력하는 메서드
	public Vector memListView() {
		return memList;
	}
	
	//회원 탈퇴를 위한 메서드
	public MemberVO deleteMember(String mem_id, String mem_pass){
		MemberVO byeMem = null;
		
		int index = 0;
		for(int count = 0 ; count < memList.size() ; count++){
			if(memList.get(count).getMem_id().equals(mem_id)){
				break;
			} else{
			index++;
			}
		}
		
		if( memList.get(index).getMem_pass().equals(mem_pass)){
			byeMem = memList.remove(index);
		}
		return byeMem;
	}
	
	//게시판에 해당 작성자가 작성한 게시글이 남아있는지 확인하는 메서드
	public boolean noteMemUseCheck(String mem_id) {
		boolean result = false;
		for (int index = 0; index < noteList.size(); index++) {
			if(noteList.get(index).getMem_id().equals(mem_id)){
				result = true;
			} 
		}
		return result;
	}
	
	//회원아이디의 키워드로 회원을 검색하는 메서드
	public Vector<MemberVO> searchMemId(String keyword) {
		Vector<MemberVO> searchMemList = new Vector<>();
		for(int count = 0 ; count < memList.size() ; count++ ){
			if(memList.get(count).getMem_id().contains(keyword)){
				searchMemList.add(memList.get(count));
			}
		}
		return searchMemList;
	}
	
	//회원이름의 키워드로 회원을 검색하는 메서드
	public Vector<MemberVO> searchMemName(String keyword) {
		Vector<MemberVO> searchMemList = new Vector<>();
		for(int count = 0 ; count < memList.size() ; count++ ){
			if(memList.get(count).getMem_name().contains(keyword)){
				searchMemList.add(memList.get(count));
			}
		}
		return searchMemList;
	}
	
	//회원나이로 회원을 검색하는 메서드
	public Vector<MemberVO> searchMemAge(int keyword) {
		Vector<MemberVO> searchMemList = new Vector<>();
		for(int count = 0 ; count < memList.size() ; count++ ){
			if(memList.get(count).getMem_age() == keyword){
				searchMemList.add(memList.get(count));
			}
		}
		return searchMemList;
	}
	
	//회원직업의 키워드로 회원을 검색하는 메서드
	public Vector<MemberVO> searchMemJob(String keyword) {
		Vector<MemberVO> searchMemList = new Vector<>();
		for(int count = 0 ; count < memList.size() ; count++ ){
			if(memList.get(count).getMem_job().contains(keyword)){
				searchMemList.add(memList.get(count));
			}
		}
		return searchMemList;
	}
	
	//회원의 비밀번호를 수정하기 위한 메서드
	public boolean changeMemberPass(String mem_id, String mem_pass) {
		boolean result = false;
		for (int index = 0; index < memList.size(); index++) {
			if(memList.get(index).getMem_id().equals(mem_id)){
				memList.get(index).setMem_pass(mem_pass);
				result = true;
			} 
		}
		return result;
	}
	
	//회원의 이름을 수정하기 위한 메서드
	public boolean changeMemberName(String mem_id, String newMemName) {
		boolean result = false;
		for (int index = 0; index < memList.size(); index++) {
			if(memList.get(index).getMem_id().equals(mem_id)){
				memList.get(index).setMem_name(newMemName);
				result = true;
			} 
		}
		return result;
	}
	
	//회원의 나이를 수정하기 위한 메서드
	public boolean changeMemberAge(String mem_id, int newAge) {
		boolean result = false;
		for (int index = 0; index < memList.size(); index++) {
			if(memList.get(index).getMem_id().equals(mem_id)){
				memList.get(index).setMem_age(newAge);
				result = true;
			} 
		}
		return result;
	}
	
	//회원의 직업를 수정하기 위한 메서드
	public boolean changeMemberJob(String mem_id, String newMemJob) {
		boolean result = false;
		for (int index = 0; index < memList.size(); index++) {
			if(memList.get(index).getMem_id().equals(mem_id)){
				memList.get(index).setMem_job(newMemJob);
				result = true;
			} 
		}
		return result;
	}
	
	
		
	/////////////////////////////////////////////////////////////////////////////////////////////NoteVO
	
	
	//게시글을 작성하기위한 메서드
	public boolean createNote(NoteVO newNote) {
		return noteList.add(newNote);
	}
	
	//게시글의 목록을 보여주기위한 메서드
	public Vector<NoteVO> notesView() {
		return noteList;
	}

	//게시글 삭제를 위한 메서드
	public NoteVO deleteNote(String mem_id, int deleteNote)  {
		int index = 0;
		NoteVO byeNote = null;
		for(int count = 0; count<noteList.size(); count++){
			if(noteList.get(count).getMem_id().equals(mem_id) && noteList.get(count).getNote_id() == deleteNote){
				byeNote = noteList.remove(count);
				byeNoteList.add(byeNote);
				index = count;
			}
		}
		return byeNote;
	}
	
	//자신이 작성한 게시글을 보기위한 메서드
	public Vector<NoteVO> myNoteView(String mem_id) {
		
		Vector<NoteVO> myNoteList = new Vector<>();
		
		for (int index = 0 ; index < noteList.size() ; index++){
			if(noteList.get(index).getMem_id().equals(mem_id)){
				myNoteList.add(noteList.get(index));
			} 
		}
		return myNoteList;
	}
	
	//나의 최근삭제된 게시글을 보여주는 메서드
	public Vector<NoteVO> byeNoteList(String mem_id) {
		Vector<NoteVO> byeNtList = new Vector<>();

		for (int index = 0 ; index < byeNoteList.size() ; index++){
			if(byeNoteList.get(index).getMem_id().equals(mem_id)){
				byeNtList.add(byeNoteList.get(index));
			} 
		}
		return byeNtList;
	}

	//나의 게시물인지 확인해주는 메서드
	public boolean checkMyNote(String mem_id, int checkNote) {
		boolean result = false;
		for(int count = 0; count<noteList.size(); count++){
			if(noteList.get(count).getMem_id().equals(mem_id) && noteList.get(count).getNote_id() == checkNote){
				result = true;
			}
		}
		return result;
	}
	
	//게시글의 제목을 수정하는 메서드
	public boolean changeNoteTitle(int note_id, String note_title) {
		boolean result = false;
		for (int index = 0; index < noteList.size(); index++) {
			if(noteList.get(index).getNote_id() == note_id){
				noteList.get(index).setNote_title(note_title);
				result = true;
			}
		}
		return result;
	}

	//게시글의 내용을 수정하는 메서드
	public boolean changeNoteContent(int note_id, String note_content) {
		boolean result = false;
		for (int index = 0; index < noteList.size(); index++) {
			if(noteList.get(index).getNote_id() == note_id){
				noteList.get(index).setNote_content(note_content);
				result = true;
			}
		}
		return result;
	}
	
	//제목으로 게시글을 검색하는 메서드
	public Vector<NoteVO> searchNoteTitle(String keyword) {
		Vector<NoteVO> searchNoteList = new Vector<>();
		for(int count = 0 ; count < noteList.size() ; count++ ){
			if(noteList.get(count).getNote_title().contains(keyword)){
				searchNoteList.add(noteList.get(count));
			}
		}
		return searchNoteList;
	}

	//내용으로 게시글을 검색하는 메서드
	public Vector<NoteVO> searchNoteContent(String keyword) {
		Vector<NoteVO> searchNoteList = new Vector<>();
		for(int count = 0 ; count < noteList.size() ; count++ ){
			if(noteList.get(count).getNote_content().contains(keyword)){
				searchNoteList.add(noteList.get(count));
			}
		}
		return searchNoteList;
	}
	
	//작성일자로 게시글을 검색하는 메서드
	public Vector<NoteVO> searchNoteDate(String keyword) {
		Vector<NoteVO> searchNoteList = new Vector<>();
		for(int count = 0 ; count < noteList.size() ; count++ ){
			if(noteList.get(count).getNote_date().contains(keyword)){
				searchNoteList.add(noteList.get(count));
			}
		}
		return searchNoteList;
	}
	
	//작성자로 게시글을 검색하는 메서드
	public Vector<NoteVO> searchNoteMem(String keyword) {
		Vector<NoteVO> searchNoteList = new Vector<>();
		for(int count = 0 ; count < noteList.size() ; count++ ){
			if(noteList.get(count).getMem_id().contains(keyword)){
				searchNoteList.add(noteList.get(count));
			}
		}
		return searchNoteList;
	}
	

	
	//////////////////////////////////////////////////////////////////////////////////////////////BuyerVO
	
	//거래처 등록을 위한 메서드
	public boolean createBuyer(BuyerVO buyer) {
		return buyerList.add(buyer);
	}
	
	// 거래처 아이디 중복을 확인하는 메서드
	public boolean buyerIdCheck(String buyer_id) {
		boolean result = false;
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			result = buyerList.get(count).getBuyer_id().equals(buyer_id);
			if(result){
				return result;
			}
		}
		return result;
	}
	
	//거래처 목록을 출력하기 위한 메서드
	public Vector<BuyerVO> buyerListView() {
		return buyerList;
	}

	// 거래처 삭제를 위한 메서드
	public BuyerVO deleteBuyer(String buyer_id) {
		BuyerVO byeBuyer = null;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				byeBuyer = (BuyerVO) buyerList.remove(index);
			}
		}
		return byeBuyer;
	}

	// 해당하는 분류코드를 반환하기위한 메서드
	public String comeOnlgu(int buyer_lguNO) {
		return lprodList.get(buyer_lguNO-1).getLprod_gu();
	}
	
	// 거래처 명을 변경하기 위한 메서드
	public boolean changeBuyerName(String buyer_id, String buyer_name) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				buyerList.get(index).setBuyer_name(buyer_name);
				result = true;
			}
		}
		return result;
	}
	
	//거래처의 분류코드를 변경하기위한 메서드 FK라서 선택하여 변경
	public boolean changeBuyerLgu(String buyer_id, String buyer_lgu) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				buyerList.get(index).setBuyer_lgu(buyer_lgu);
				result = true;
			}
		}
		return result;
	}

	//거래처 은행을 변경하기 위한 메서드
	public boolean changeBuyerBank(String buyer_id, String buyer_bank) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				buyerList.get(index).setBuyer_bank(buyer_bank);
				result = true;
			}
		}
		return result;
	}
	
	//거래처 계좌번호를 변경하기 위한 메서드
	public boolean changeBuyerBankNo(String buyer_id, String buyer_bankNo) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				buyerList.get(index).setBuyer_bankNo(buyer_bankNo);
				result = true;
			}
		}
		return result;
	}
	
	//거래처 전화번호를 변경하기 위한 메서드
	public boolean changeBuyerComTel(String buyer_id, String buyer_comTel) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				buyerList.get(index).setBuyer_comTel(buyer_comTel);
				result = true;
			}
		}
		return result;
	}
	
	//거래처 이메일을 변경하기 위한 메서드
	public boolean changeBuyerMail(String buyer_id, String buyer_mail) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_id().equals(buyer_id)){
				buyerList.get(index).setBuyer_mail(buyer_mail);
				result = true;
			}
		}
		return result;
	}
	
	//거래처 아이디로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerId(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_id().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 명칭으로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerNm(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_name().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 분류코드로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerLgu(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_lgu().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 은행으로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerBank(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_bank().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 계좌번호로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerBankNo(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_bankNo().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 예금주로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerBankName(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_bankName().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 전화번호로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerTel(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_comTel().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	//거래처 이메일로 검색하는 메서드
	public Vector<BuyerVO> searchBuyerEmail(String keyword) {
		Vector<BuyerVO> searchBuyer = new Vector<>();
		for(int count = 0 ; count < buyerList.size() ; count++ ){
			if(buyerList.get(count).getBuyer_mail().contains(keyword)){
				searchBuyer.add(buyerList.get(count));
			} 
		}
		return searchBuyer;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////LprodVO
	
	
	//분류코드의 목록을 보여주는 메서드
	public Vector<LprodVO> lprodListView() {
		return lprodList;
	}

	//분류코드리스트의 크기를 알려주는 메서드
	public int lprodListSize() {
		return lprodList.size();
	}

	//분류코드의 등록을 위한 메서드
	public boolean createLprod(LprodVO lprod) {
		return lprodList.add(lprod);
	}

	//분류코드의 중복을 확인하기 위한 메서드
	public boolean lprodGuCheck(String lprod_gu) {
		boolean result = false;
		for(int count = 0 ; count < lprodList.size() ; count++ ){
			result = lprodList.get(count).getLprod_gu().equals(lprod_gu);
			if(result){
				return result;
			}
		}
		return result;
	}

	//분류코드를 삭제하기위한 메서드
	public LprodVO deleteLprod(String lprod_gu) {
		LprodVO byeLprod = null;
		for (int index = 0; index < lprodList.size(); index++) {
			if(lprodList.get(index).getLprod_gu().equals(lprod_gu)){
				byeLprod = (LprodVO) lprodList.remove(index);
			}
		}
		return byeLprod;
	}

	//분류번호가 있는지 확인해주는 메서드
	public boolean lprodIdCheck(int lprod_id) {
		boolean result = false;
		for (int index = 0; index < lprodList.size(); index++) {
			if(lprodList.get(index).getLprod_id() == lprod_id){
				result = true;
			} 
		}
		return result;
	}

	//분류코드를 수정하고 FK로 받는 거래처의 분류코드를 바꿔주기위한 메서드
	public boolean changeLprodGu(int lprod_id, String lprod_gu) {
		boolean result = false;
		String orgLgu = "";
		for (int index = 0; index < lprodList.size(); index++) {
			if(lprodList.get(index).getLprod_id() == lprod_id){
				orgLgu = lprodList.get(index).getLprod_gu();
				lprodList.get(index).setLprod_gu(lprod_gu);
				for (int i = 0; i < buyerList.size(); i++) {
					if(buyerList.get(i).getBuyer_lgu().equals(orgLgu)){
						buyerList.get(i).setBuyer_lgu(lprod_gu);
						result = true;
					}
				}
			}
		}
		return result;
	}

	//분류코드 분류명을 수정하기위한 메서드
	public boolean changeLprodName(int lprod_id, String lprod_nm) {
		boolean result = false;
		for (int index = 0; index < lprodList.size(); index++) {
			if(lprodList.get(index).getLprod_id() == lprod_id){
				lprodList.get(index).setLprod_nm(lprod_nm);;
				result = true;
			}
		}
		return result;
	}

	//분류구분 속 해당 키워드로 분류코드를 검색하는 메서드
	public Vector<LprodVO> searchLprodGu(String keyword) {
		Vector<LprodVO> searchLprod = new Vector<>();
		for(int count = 0 ; count < lprodList.size() ; count++ ){
			if(lprodList.get(count).getLprod_gu().contains(keyword)){
				searchLprod.add(lprodList.get(count));
			}
		}
		return searchLprod;
	}
	
	//분류명 속 해당 키워드로 분류코드 검색하는 메서드
	public Vector<LprodVO> searchLprodNm(String keyword) {
		Vector<LprodVO> searchLprod = new Vector<>();
		for(int count = 0 ; count < lprodList.size() ; count++ ){
			if(lprodList.get(count).getLprod_nm().contains(keyword)){
				searchLprod.add(lprodList.get(count));
			}
		}
		return searchLprod;
	}

	//거래처가 해당분류코드를 사용하고 있는지 확인하는 메서드
	public boolean buyerLguCheck(String lprod_gu) {
		boolean result = false;
		for (int index = 0; index < buyerList.size(); index++) {
			if(buyerList.get(index).getBuyer_lgu().equals(lprod_gu)){
				result = true;
			} 
		}
		return result;
	}













	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
