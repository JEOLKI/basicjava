package pro;

import java.util.Vector;

public class IServiceimpl implements IService {
	
	private DBClass db = new DBClass();
	
	
	@Override
	public boolean createMember(MemberVO mv) {
		return db.createMember(mv);
	}
	
	@Override
	public boolean createIdCheck(String mem_id) {
		return db.createIdCheck(mem_id);
	}
	
	@Override
	public MemberVO logIn(String mem_id, String mem_pass) {
		MemberVO mv = db.logIn(mem_id, mem_pass);
		return mv;
	}

	@Override
	public boolean createBuyer(BuyerVO buyer) {
		return db.createBuyer(buyer);
	}

	@Override
	public boolean buyerIdCheck(String buyer_id) {
		return db.buyerIdCheck(buyer_id);
	}

	


	@Override
	public Vector<BuyerVO> buyerListView() {
		return db.buyerListView();
	}

	
	@Override
	public BuyerVO deleteBuyer(String buyer_id) {
		return db.deleteBuyer(buyer_id);
		
	}

	@Override
	public String comeOnlgu(int buyer_lguNO) {
		return db.comeOnlgu(buyer_lguNO);
	}


	@Override
	public boolean changeBuyerName(String buyer_id, String buyer_name) {
		return db.changeBuyerName(buyer_id, buyer_name);
	}
	
	@Override
	public boolean changeBuyerLgu(String buyer_id, String buyer_lgu) {
		return db.changeBuyerLgu(buyer_id, buyer_lgu);
	}

	@Override
	public boolean changeBuyerBank(String buyer_id, String buyer_bank) {
		return db.changeBuyerBank(buyer_id, buyer_bank);
	}

	@Override
	public boolean changeBuyerBankNo(String buyer_id, String buyer_bankNo) {
		return db.changeBuyerBankNo(buyer_id, buyer_bankNo);
	}

	@Override
	public boolean changeBuyerComTel(String buyer_id, String buyer_comTel) {
		return db.changeBuyerComTel(buyer_id, buyer_comTel);
	}

	@Override
	public boolean changeBuyerMail(String buyer_id, String buyer_mail) {
		return db.changeBuyerMail(buyer_id, buyer_mail);
	}


	@Override
	public Vector<LprodVO> lprodListView() {
		return db.lprodListView();
		
	}

	@Override
	public int lprodListSize() {
		return db.lprodListSize();
	}

	@Override
	public boolean createLprod(LprodVO lprod) {
		return db.createLprod(lprod);
		
	}

	@Override
	public boolean lprodGuCheck(String lprod_gu) {
		return db.lprodGuCheck(lprod_gu);
	}

	@Override
	public LprodVO deleteLprod(String lprod_gu) {
		return db.deleteLprod(lprod_gu);
	}

	@Override
	public boolean lprodIdCheck(int lprod_id) {
		return db.lprodIdCheck(lprod_id);
	}

	@Override
	public boolean changeLprodGu(int lprod_id, String lprod_gu) {
		return db.changeLprodGu(lprod_id, lprod_gu);
	}

	@Override
	public boolean changeLprodName(int lprod_id, String lprod_nm) {
		return db.changeLprodName(lprod_id, lprod_nm);
	}

	@Override
	public Vector<LprodVO> searchLprodGu(String keyword) {
		return db.searchLprodGu(keyword);
	}

	@Override
	public Vector<LprodVO> searchLprodNm(String keyword) {
		return db.searchLprodNm(keyword);
	}

	@Override
	public boolean buyerLguCheck(String lprod_gu) {
		return db.buyerLguCheck(lprod_gu);
	}

	@Override
	public Vector<BuyerVO> searchBuyerId(String keyword) {
		return db.searchBuyerId(keyword);
		
	}

	@Override
	public Vector<BuyerVO> searchBuyerNm(String keyword) {
		return db.searchBuyerNm(keyword);
		
	}

	@Override
	public Vector<BuyerVO> searchBuyerLgu(String keyword) {
		return db.searchBuyerLgu(keyword);
	}

	@Override
	public Vector<BuyerVO> searchBuyerBank(String keyword) {
		return db.searchBuyerBank(keyword);
	}

	@Override
	public Vector<BuyerVO> searchBuyerBankNo(String keyword) {
		return db.searchBuyerBankNo(keyword);
	}

	@Override
	public Vector<BuyerVO> searchBuyerBankName(String keyword) {
		return db.searchBuyerBankName(keyword);
	}

	@Override
	public Vector<BuyerVO> searchBuyerTel(String keyword) {
		return db.searchBuyerTel(keyword);
	}

	@Override
	public Vector<BuyerVO> searchBuyerEmail(String keyword) {
		return db.searchBuyerEmail(keyword);
	}

	@Override
	public Vector<MemberVO> memListView() {
		return db.memListView();
	}

	@Override
	public MemberVO deleteMember(String mem_id, String mem_pass) {
		return db.deleteMember(mem_id, mem_pass);
	}

	@Override
	public Vector<MemberVO> searchMemId(String keyword) {
		return db.searchMemId(keyword);
	}

	@Override
	public Vector<MemberVO> searchMemName(String keyword) {
		return db.searchMemName(keyword);
		
	}

	@Override
	public Vector<MemberVO> searchMemAge(int keyword) {
		return db.searchMemAge(keyword);
		
	}

	@Override
	public Vector<MemberVO> searchMemJob(String keyword) {
		return db.searchMemJob(keyword);
		
	}

	@Override
	public boolean changeMemberPass(String mem_id, String mem_pass) {
		return db.changeMemberPass(mem_id, mem_pass);
	}

	@Override
	public boolean changeMemberName(String mem_id, String newMemName) {
		return db.changeMemberName(mem_id, newMemName);
	}

	@Override
	public boolean changeMemberAge(String mem_id, int newAge) {
		return db.changeMemberAge(mem_id, newAge);
	}

	@Override
	public boolean changeMemberJob(String mem_id, String newMemJob) {
		return db.changeMemberJob(mem_id, newMemJob);
	}

	@Override
	public boolean createNote(NoteVO newNote) {
		return db.createNote(newNote);
	}

	@Override
	public Vector<NoteVO> notesView() {
		return db.notesView();
	}

	@Override
	public NoteVO deleteNote(String mem_id, int deleteNote) {
		return db.deleteNote(mem_id, deleteNote);
	}

	@Override
	public Vector<NoteVO> myNoteView(String mem_id) {
		return db.myNoteView(mem_id);
	}

	@Override
	public Vector<NoteVO> byeNoteList(String mem_id) {
		return db.byeNoteList(mem_id);
	}

	@Override
	public boolean checkMyNote(String mem_id, int checkNote) {
		return db.checkMyNote(mem_id, checkNote);
	}

	@Override
	public boolean changeNoteTitle(int note_id, String note_title) {
		return db.changeNoteTitle(note_id, note_title);
	}

	@Override
	public boolean changeNoteContent(int note_id, String note_content) {
		return db.changeNoteContent(note_id, note_content);
	}

	@Override
	public Vector<NoteVO> searchNoteTitle(String keyword) {
		return db.searchNoteTitle(keyword);
	}

	@Override
	public Vector<NoteVO> searchNoteContent(String keyword) {
		return db.searchNoteContent(keyword);
	}

	@Override
	public Vector<NoteVO> searchNoteDate(String keyword) {
		return db.searchNoteDate(keyword);
	}

	@Override
	public Vector<NoteVO> searchNoteMem(String keyword) {
		return db.searchNoteMem(keyword);
	}

	@Override
	public boolean noteMemUseCheck(String mem_id) {
		return db.noteMemUseCheck(mem_id);
	}


	
	
	
	








}
