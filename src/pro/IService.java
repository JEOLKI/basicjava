package pro;

import java.util.Vector;

public interface IService { //데이터베이스에서 가져와야할 일을 하는 녀석들의 모음집


	
	///////////////////////////////////////////////////////////////////////////////////////////MemberVO
	
	/**
	 * 회원가입을 위한 메서드
	 * @param mem_id
	 * @param mem_pass
	 * @param mem_name
	 * @param mem_age
	 * @param mem_job
	 * @return 회원 가입된 사람의 정보
	 */
	boolean createMember(MemberVO mv);


	/**
	 * 회원가입시 아이디를 체크하는 메서드
	 * @param mem_id
	 * @return 아이디 중복여부
	 */
	boolean createIdCheck(String mem_id);


	/**
	 * 로그인을 위한 메서드
	 * @param mem_id 사람의 아이디
	 * @param mem_pass 사람의 비밀번호
	 * @return id와 pw가 일치하는 한명의 정보
	 */
	MemberVO logIn(String mem_id, String mem_pass);
	
	/**
	 * 회원 목록을 가져오기 위한 메서드
	 * @return 회원 목록
	 */
	Vector<MemberVO> memListView(); 

	/**
	 * 회원탈퇴를 위한 메서드 
	 * @param mem_id
	 * @param mem_pass
	 */
	MemberVO deleteMember(String mem_id, String mem_pass);

	/**
	 * 회원아이디를 검색하는 메서드
	 * @param keyword
	 * @return 검색된 회원의 리스트
	 */
	Vector<MemberVO> searchMemId(String keyword);

	/**
	 * 회원이름을 검색하는 메서드
	 * @param keyword
	 * @return 검색된 회원의 리스트
	 */
	Vector<MemberVO> searchMemName(String keyword);

	/**
	 * 회원의 나이를 검색하는 메서드
	 * @param keyword
	 * @return 검색된 회원의 리스트
	 */
	Vector<MemberVO> searchMemAge(int keyword);

	/**
	 * 회원의 직업을 검색하는 메서드
	 * @param keyword
	 * @return 키워드로 검색된 회원의 리스트
	 */
	Vector<MemberVO> searchMemJob(String keyword);

	/**
	 * 회원의 비밀번호를 변경하는 메서드
	 * @param mem_id
	 * @param mem_pass
	 * @return 변경여부
	 */
	boolean changeMemberPass(String mem_id, String mem_pass);

	/**
	 * 회원의 이름을 변경하는 메서드
	 * @param mem_id
	 * @param newMemName
	 * @return 변경여부
	 */
	boolean changeMemberName(String mem_id, String newMemName);

	/**
	 * 회원의 나이를 변경하는 메서드
	 * @param mem_id
	 * @param newAge
	 * @return 변경여부
	 */
	boolean changeMemberAge(String mem_id, int newAge);

	/**
	 * 회원의 직업을 변경하는 메서드
	 * @param mem_id
	 * @param newMemJob
	 * @return 변경여부
	 */
	boolean changeMemberJob(String mem_id, String newMemJob);

	/**
	 * 해당회원이 작성한 게시글이 남아있는지 확인하는 메서드
	 * @param mem_id
	 * @return 작성한글이 있는지 여부
	 */
	boolean noteMemUseCheck(String mem_id);



	///////////////////////////////////////////////////////////////////////////////////////////NoteVO
	

	
	/**
	 * 게시글작성하기 위한 메서드
	 * @param newNote
	 * @return 작성성공여부
	 */
	boolean createNote(NoteVO newNote);

	/**
	 * 게시글의 목록을 가져오는 메서드
	 * @return 게시글의 목록
	 */
	Vector<NoteVO> notesView();

	/**
	 * 게시글을 삭제하기 위한 메서드
	 * @param mem_id
	 * @param deleteNote
	 * @return 삭제된 게시글
	 */
	NoteVO deleteNote(String mem_id, int deleteNote);

	/**
	 * 내가 작성한 게시글들을 가져오는 메서드
	 * @param mem_id
	 * @return 내가작성한 게시글들
	 */
	Vector<NoteVO> myNoteView(String mem_id);

	/**
	 * 최근 삭제된 게시글들을 가져오는 메서드
	 * @param mem_id
	 * @return 최근삭제된 게시글들
	 */
	Vector<NoteVO> byeNoteList(String mem_id);

	/**
	 * 해당 게시물이 해당회원이 작성한 게시글인지 확인하는 메서드
	 * @param mem_id
	 * @param checkNote
	 * @return 작성한게시글인지의 확인결과
	 */
	boolean checkMyNote(String mem_id, int checkNote);

	/**
	 * 게시글의 제목을 수정하기위한 메서드
	 * @param note_id
	 * @param note_title
	 * @return 수정여부
	 */
	boolean changeNoteTitle(int note_id, String note_title);

	/**
	 * 게시글의 내용을 수정하기 위한 메서드
	 * @param note_id
	 * @param note_content
	 * @return 수정여부
	 */
	boolean changeNoteContent(int note_id, String note_content);

	/**
	 * 게시글의 제목에 키워드가 포함되어있는 게시글을 가져오는 메서드
	 * @param keyword
	 * @return 키워드가 포함된 게시글들
	 */
	Vector<NoteVO> searchNoteTitle(String keyword);

	/**
	 * 게시글의 내용에 키워드가 포함되어있는 게시글을 가져오는 메서드
	 * @param keyword
	 * @return 키워드가 포함된 게시글들
	 */
	Vector<NoteVO> searchNoteContent(String keyword);

	/**
	 * 게시글의 작성일자에 키워드가 포함되어있는 게시글을 가져오는 메서드
	 * @param keyword
	 * @return 키워드가 포함된 게시글들
	 */
	Vector<NoteVO> searchNoteDate(String keyword);

	/**
	 * 게시글의 작성자에 키워드가 포함되어있는 게시글을 가져오는 메서드
	 * @param keyword
	 * @return 키워드가 포함된 게시글들
	 */
	Vector<NoteVO> searchNoteMem(String keyword);
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////BuyerVO
	
	
	/**
	 * 거래처 등록을 하기 위한 메서드
	 * @param buyer
	 * @return 거래처 등록의 성공여부
	 */
	boolean createBuyer(BuyerVO buyer);
	
	
	/**
	 * 거래처 아이디 중복을 확인하기위한 메서드
	 * @param buyer_id
	 * @return 거래처 중복여부
	 */
	boolean buyerIdCheck(String buyer_id);
	
	/**
	 * 거래처 목록을 보기위한 메서드
	 * @return 
	 */
	Vector<BuyerVO> buyerListView();
	
	/**
	 * 거래처를 삭제하기 위한 메서드
	 * @param buyer_id
	 * @return 삭제된 거래처
	 */
	BuyerVO deleteBuyer(String buyer_id);
	
	/**
	 * 거래처의 분류코드를 가져오기위한 메서드
	 * @param buyer_lguNO
	 * @return 해당하는 번호의 분류코드
	 */
	String comeOnlgu(int buyer_lguNO);
	
	/**
	 * 거래처 아이디를 변경하기 위한 메서드
	 * @param buyer_name
	 * @return 거래처 아이디 변경 여부 
	 */
	boolean changeBuyerName(String buyer_id, String buyer_name);
	
	/**
	 * 거래처의 분류코드를 변경하기 위한 메서드
	 * @param buyer_id
	 * @param buyer_lgu
	 * @return 분류코드 변경여부
	 */
	boolean changeBuyerLgu(String buyer_id, String buyer_lgu);
	
	/**
	 * 거래처 은행을 변경하기 위한 메서드
	 * @param buyer_id
	 * @param buyer_bank
	 * @return 거래처 은행 변경 여부
	 */
	boolean changeBuyerBank(String buyer_id, String buyer_bank);
	
	/**
	 * 거래처 계좌번호를 변경하기 위한 메서드
	 * @param buyer_id
	 * @param buyer_bankNo
	 * @return 거래처 계좌번호 변경 여부
	 */
	boolean changeBuyerBankNo(String buyer_id, String buyer_bankNo);
	
	/**
	 * 거래처 전화번호를 변경하기 위한 메서드
	 * @param buyer_id
	 * @param buyer_comTel
	 * @return 거래처 전화번호 변경 여부
	 */
	boolean changeBuyerComTel(String buyer_id, String buyer_comTel);
	
	/**
	 * 거래처 이메일을 변경하기 위한 메서드
	 * @param buyer_id
	 * @param buyer_mail
	 * @return 이베일 변경 여부
	 */
	boolean changeBuyerMail(String buyer_id, String buyer_mail);
	

	/**
	 * 아이디로 거래처를 검색하기위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerId(String keyword);

	/**
	 * 거래처명으로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerNm(String keyword);

	/**
	 * 분류코드로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerLgu(String keyword);

	/**
	 * 은행으로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerBank(String keyword);
	
	/**
	 * 계좌번호로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerBankNo(String keyword);

	/**
	 * 예금주로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerBankName(String keyword);

	/**
	 * 전화번호로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerTel(String keyword);

	/**
	 * 이메일로 거래처를 검색하기 위한 메서드
	 * @param keyword
	 * @return 
	 */
	Vector<BuyerVO> searchBuyerEmail(String keyword);

	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////LprodVO
	
	/**
	 * 분류코드 목록를 출력하는 메서드
	 * @return 
	 */
	Vector<LprodVO> lprodListView();

	/**
	 * 분류코드의 개수를 얻기위한 메서드
	 * @return 분류코드 개수
	 */
	int lprodListSize();

	/**
	 * 분류코드를 등록하기 위한 메서드
	 * @param lprod
	 * @return
	 */
	boolean createLprod(LprodVO lprod);

	/**
	 * 분류코드의 중복을 확인하기 위한 메서드
	 * @param lprod_gu
	 * @return 중복여부
	 */
	boolean lprodGuCheck(String lprod_gu);

	/**
	 * 분류코드 삭제를 위한 메서드
	 * @param lprod_gu
	 * @return 삭제된 분류코드
	 */
	LprodVO deleteLprod(String lprod_gu);

	/**
	 * 분류번호가 있는지 확인해주는 메서드
	 * @param lprod_id
	 * @return 분류번호가 있는지 여부
	 */
	boolean lprodIdCheck(int lprod_id);

	/**
	 * 분류코드의 분류구분을 변경해주는 메서드
	 * @param lprod_id
	 * @param lprod_gu
	 * @return 분류구분 변경여부
	 */
	boolean changeLprodGu(int lprod_id, String lprod_gu);

	/**
	 * 분류테이블의 분류명을 변경해주는 메서드
	 * @param lprod_id
	 * @param lprod_nm
	 * @return 분류명 변경여부
	 */
	boolean changeLprodName(int lprod_id, String lprod_nm);

	/**
	 * 분류테이블에서 키워드로 분류코드 검색하기
	 * @param keyword
	 * @return 
	 */
	Vector<LprodVO> searchLprodGu(String keyword);

	/**
	 * 분류 테이블에서 키워드로 분류명 검색하기
	 * @param keyword
	 * @return 
	 */
	Vector<LprodVO> searchLprodNm(String keyword);

	/**
	 * 거래처가 해당분류코드를 사용하고 있는지 확인하는 메서드
	 * @param lprod_gu
	 * @return 사용하고 있는지의 여부
	 */
	boolean buyerLguCheck(String lprod_gu);

	
	
	
	
	
	
	
	
	


	





}
