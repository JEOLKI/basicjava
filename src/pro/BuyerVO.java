package pro;

/**
 * 거래처의 정보를 저장하기 위한 클래스
 * @author HONG JEONGGI
 * @since 2020.06.30
 */
public class BuyerVO {

	private String buyer_id;  //거래처의 아이디 PK
	private String buyer_name; //거래처 명칭
	private String buyer_lgu; //거래처 납품분류코드 FK
	private String buyer_bank; //거래처 은행
	private String buyer_bankNo; //거래처 계좌번호
	private String buyer_bankName; //거래처 예금주
	private String buyer_comTel; //거래처 전화번호
	private String buyer_mail; //거래처 이메일
	
	
	public String getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}
	public String getBuyer_name() {
		return buyer_name;
	}
	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}
	public String getBuyer_lgu() {
		return buyer_lgu;
	}
	public void setBuyer_lgu(String buyer_lgu) {
		this.buyer_lgu = buyer_lgu;
	}
	public String getBuyer_bank() {
		return buyer_bank;
	}
	public void setBuyer_bank(String buyer_bank) {
		this.buyer_bank = buyer_bank;
	}
	public String getBuyer_bankNo() {
		return buyer_bankNo;
	}
	public void setBuyer_bankNo(String buyer_bankNo) {
		this.buyer_bankNo = buyer_bankNo;
	}
	public String getBuyer_bankName() {
		return buyer_bankName;
	}
	public void setBuyer_bankName(String buyer_bankName) {
		this.buyer_bankName = buyer_bankName;
	}
	public String getBuyer_comTel() {
		return buyer_comTel;
	}
	public void setBuyer_comTel(String buyer_comTel) {
		this.buyer_comTel = buyer_comTel;
	}
	public String getBuyer_mail() {
		return buyer_mail;
	}
	public void setBuyer_mail(String buyer_mail) {
		this.buyer_mail = buyer_mail;
	}
	
	

	
	
}
