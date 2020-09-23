package z_pro;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class ViewClass {

	// 인터페이스는 객체생성이 불가능 하기때문에 인터페이스를 implement를 받는 클래스를 생성자로 생성한 뒤 이 인스턴스를 참조변수에 대입한다.
	// 해당 클래스단에서만 사용해야 함으로 private으로 설정한다.
	private IService service = new IServiceimpl();

	// 로그인을 하면 해당 인원으로 지속적으로 업무를 진행해야 함으로 로그인한 인원의 객체를 저장할수 있는 MemberVO를 초기값 null로 저장한다.
	private MemberVO logIn = null; 


	public static void main(String[] args) {

		// 클래스 내부에 있는 메서드를 사용하기 위한 인스턴스화
		ViewClass vc = new ViewClass();


		while(true){

			System.out.println("\n");
			System.out.println("환영합니다.");

			System.out.println("원하는 메뉴를 선택해주세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 게시판");
			System.out.println("4. 회원정보 리스트");
			System.out.println("5. 회원검색");
			System.out.println("6. 회원정보 수정");
			System.out.println("7. 회원탈퇴");
			System.out.println("8. 로그아웃");
			System.out.println("9. 종료");




			try{
				Scanner sc = new Scanner(System.in);
				int input = sc.nextInt();

				switch(input){
				case 1:
					// 회원 가입
					vc.signUp();
					break;
				case 2:
					// 로그인
					vc.logIn();
					break;
				case 3:
					// 게시판
					while(true){
						System.out.println();
						System.out.println("원하는 메뉴를 선택해주세요");
						System.out.println("1. 게시글 뷰");
						System.out.println("2. 게시글 작성");
						System.out.println("3. 게시글 수정");
						System.out.println("4. 게시글 삭제");
						System.out.println("5. 나가기");
						System.out.println();
						try{

							Scanner scbd = new Scanner(System.in);
							int Boardinput = scbd.nextInt();

							// 게시판의 기능들
							switch(Boardinput){
							case 1:
								// 게시글들 전체 뷰
								vc.notesView();
								continue;
							case 2:
								// 게시글 작성
								vc.NoteWrite();
								continue;
							case 3:
								// 게시글 수정
								vc.noteReWrite();
								continue;
							case 4:
								// 게시글 삭제
								vc.noteRemove();
								continue;
							case 5:
								// 나가기(이전화면)
								// 나가기 a
								break;
							}
							// 나가기 a를 받고 나가기 b
							break;

						}catch(InputMismatchException e){
							System.out.println("게시판 메뉴 선택을 문자열로 입력하셨습니다. 숫자로 다시 입력해주세요.");
						}

					}
					// 나가기 a를 받고 나가기 b를 받고 나가기
					break;


				case 4:
					// 회원정보 리스트
					vc.memberListView();
					break;
				case 5:
					// 회원정보 검색
					vc.searchMember();
					break;

				case 6:

					// 회원정보 수정(4가지 구성으로 나누기)
					while(true){
						System.out.println();
						System.out.println("원하는 메뉴를 선택해주세요");
						System.out.println("1. 비밀번호 수정");
						System.out.println("2. 이름 수정");
						System.out.println("3. 나이 수정");
						System.out.println("4. 직업 수정");
						System.out.println("5. 나가기");
						System.out.println();

						try{
							Scanner memre = new Scanner(System.in);
							int memberRe = memre.nextInt();

							// 회원번호 수정
							switch(memberRe){
							case 1:
								// 비밀번호 수정
								vc.memberChanPass();
								continue;
							case 2:
								// 이름 수정
								vc.memberChanName();
								continue;
							case 3:
								// 나이 수정
								vc.memberChanAge();
								continue;
							case 4:
								// 직업 수정
								vc.memberChanJob();
								continue;
							case 5:
								// 나가기(이전화면)
								// 나가기 a
								break;
							}
							// 나가기 a를 받고 나가기 
							break;

						}catch(InputMismatchException e){
							System.out.println("회원정보 수정 메뉴를 문자열로 입력하셨습니다. 숫자로 다시 입력해주세요.");
						}
					}
					break;


				case 7:
					// 회원탈퇴
					vc.removeMem();
					break;
				case 8:
					// 로그아웃
					vc.logOut();
					break;
				case 9:
					// 종료
					System.out.println("종료합니다.");
					return;
				}

			}catch(InputMismatchException e){
				System.out.println("메인 메뉴 번호 선택을 문자열로 입력하셨습니다. 숫자로 다시 입력해주세요.");
			}




		}

	}





	//////////////////////////////////////////////////////// 회원 관리 단  ////////////////////////////////////////////////////////////////////


	// 로그인
	private void logIn(){
		// id, pw 를 받는다.

		while(true){

			Scanner scid = new Scanner(System.in);
			Scanner scpw = new Scanner(System.in);

			System.out.println("id를 입력");
			String mem_id = scid.next();

			System.out.println("pw를 입력");
			String mem_pass = scpw.next();


			// dbclass 에서 가져옴
			// MemberVO logIn(String mem_id, String mem_pass);
			MemberVO logInfo = service.logIn(mem_id, mem_pass);

			if(logInfo == null){
				System.out.println("id와 pw가 일치하는 사람이 없습니다.");
			}else{
				System.out.println(logInfo.getMem_name()+"님 환영합니다.");
				logIn = logInfo;
				break;
			}
		}

	}




	//회원가입을 위한 메서드
	private void signUp(){

		Scanner sc = new Scanner(System.in);

		String mem_id;
		while(true){
			System.out.println();
			System.out.println("ID를 입력하세요");
			mem_id = sc.next();

			if(service.signUpIdCheck(mem_id)){
				System.out.println("중복된 ID입니다.");

			} else {
				break;
			}
		}

		System.out.println("비밀번호 입력하세요");
		String mem_pass = sc.next();
		System.out.println("이름을 입력하세요");
		String mem_name = sc.next();
		System.out.println("나이를 입력하세요");
		int mem_age = sc.nextInt();
		System.out.println("직업을 입력하세요");
		String mem_job= sc.next();

		MemberVO mv = new MemberVO();
		mv.setMem_id(mem_id);
		mv.setMem_pass(mem_pass);
		mv.setMem_name(mem_name);
		mv.setMem_age(mem_age);
		mv.setMem_job(mem_job);

		boolean result = service.signUp(mv);

		if(result){
			System.out.println("회원가입에 성공하셧습니다.");
		} else {
			System.out.println("회원가입에 실패하셧습니다.");
		}
	}


	// 로그아웃을 위한 메서드
	private void logOut(){	
		if(logIn == null){
			System.out.println("로그인 중이 아닙니다.");
		} else{
			logIn = null;
			System.out.println("로그아웃 되었습니다.");	 
		}
	}




	// 회원 정보 리스트 뷰
	private void memberListView() {
		service.memListView();
	}



	// 회원 정보 수정


	// 회원 정보 수정(비번)
	private void memberChanPass(){

		if(logIn != null){

			System.out.println("수정할 회원의 비밀번호를 작성해주세요\n");
			Scanner scpw = new Scanner(System.in);
			String mem_pass = scpw.next();

			Vector memVec = new Vector<>();
			memVec.add(mem_pass);


			boolean memchpass = service.mChpass(logIn, memVec);

			if(memchpass == true){

				System.out.println("회원의 비밀번호가 수정되었습니다.");
				System.out.println("수정된 회원정보입니다.");

				System.out.println("회원님의 ID :\t"+logIn.getMem_id());
				System.out.println("회원님의 PW :\t"+logIn.getMem_pass());
				System.out.println("회원님의 이름 :\t"+logIn.getMem_name());
				System.out.println("회원님의 나이 :\t"+logIn.getMem_age());
				System.out.println("회원님의 직업 :\t"+logIn.getMem_job());
			}else{
				System.out.println("비밀번호 수정에 실패했습니다.");
			}

		}else{
			System.out.println("로그인을 먼저 해주세요.");
			logIn();
		}
	}


	// 회원 정보 수정(이름)
	private void memberChanName(){
		if(logIn != null){

			System.out.println("수정할 회원의 이름을 작성해주세요\n");
			Scanner scnm = new Scanner(System.in);
			String mem_name = scnm.next();

			Vector memVec = new Vector<>();
			memVec.add(mem_name);


			boolean memchname = service.mChname(logIn, memVec);

			if(memchname == true){

				System.out.println("회원의 이름이 수정되었습니다.");
				System.out.println("수정된 회원정보입니다.");

				System.out.println("회원님의 ID :\t"+logIn.getMem_id());
				System.out.println("회원님의 PW :\t"+logIn.getMem_pass());
				System.out.println("회원님의 이름 :\t"+logIn.getMem_name());
				System.out.println("회원님의 나이 :\t"+logIn.getMem_age());
				System.out.println("회원님의 직업 :\t"+logIn.getMem_job());
			}else{
				System.out.println("회원님의 이름 수정에 실패했습니다.");
			}

		}else{
			System.out.println("로그인을 먼저 해주세요.");
			logIn();
		}
	}


	// 회원 정보 수정(나이)
	private void memberChanAge(){

		if(logIn != null){

			System.out.println("수정할 회원의 나이를 작성해주세요\n");
			Scanner scage = new Scanner(System.in);
			int mem_age = scage.nextInt();

			Vector memVec = new Vector<>();
			memVec.add(mem_age);


			boolean memchage = service.mChage(logIn, memVec);

			if(memchage == true){

				System.out.println("회원의 나이가 수정되었습니다.");
				System.out.println("수정된 회원정보입니다.");

				System.out.println("회원님의 ID :\t"+logIn.getMem_id());
				System.out.println("회원님의 PW :\t"+logIn.getMem_pass());
				System.out.println("회원님의 이름 :\t"+logIn.getMem_name());
				System.out.println("회원님의 나이 :\t"+logIn.getMem_age());
				System.out.println("회원님의 직업 :\t"+logIn.getMem_job());
			}else{
				System.out.println("비밀번호 수정에 실패했습니다.");
			}

		}else{
			System.out.println("로그인을 먼저 해주세요.");
			logIn();
		}
	}


	// 회원 정보 수정(직업)
	private void memberChanJob(){
		if(logIn != null){

			System.out.println("수정할 회원의 직업을 작성해주세요\n");
			Scanner scjob = new Scanner(System.in);
			String mem_job = scjob.next();

			Vector memVec = new Vector<>();
			memVec.add(mem_job);


			boolean memchjob = service.mChjob(logIn, memVec);

			if(memchjob == true){

				System.out.println("회원의 직업이 수정되었습니다.");
				System.out.println("수정된 회원정보입니다.");


				System.out.println("회원님의 ID :\t"+logIn.getMem_id());
				System.out.println("회원님의 PW :\t"+logIn.getMem_pass());
				System.out.println("회원님의 이름 :\t"+logIn.getMem_name());
				System.out.println("회원님의 나이 :\t"+logIn.getMem_age());
				System.out.println("회원님의 직업 :\t"+logIn.getMem_job());
			}else{
				System.out.println("직업 수정에 실패했습니다.");
			}


		}else{
			System.out.println("로그인을 먼저 해주세요.");
			logIn();
		}
	}










	// 회원검색
	private void searchMember() {

		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("id를 입력해주세요");
			String mem_id = sc.next();		

			MemberVO searchMember = service.searchMember(mem_id);

			if(searchMember == null){
				System.out.println("id와 일치하는 사람이 없습니다.");
			}else{
				System.out.println("회원 이름 : "+searchMember.getMem_name()+"\n"+"회원 나이: "+searchMember.getMem_age()+"\n"+"회원 직업 : "+searchMember.getMem_job()
						+"\n"+"회원님의 id는 "+searchMember.getMem_id()+"입니다.");
				break;
			}
		}
	}








	// 회원 탈퇴
	private void removeMem() {
		if (logIn == null) {
			System.out.println("로그인시 이용가능합니다. 로그인해주세요");
			logIn();
		} else {
			Scanner sc = new Scanner(System.in);

			System.out.println("id를 입력해주세요");
			String mem_id = sc.next();
			System.out.println("pw를 입력해주세요");
			String mem_pass = sc.next();

			MemberVO removeMemberfo = service.removeMem(mem_id, mem_pass);

			System.out.println(removeMemberfo.getMem_name() + "이용해주셔서 감사합니다.");
		}
	}



	//////////////////////////////////////////////////////// 게시판 관리 단  ////////////////////////////////////////////////////////////////////

	//게시글 목록을 보기위한 메서드
	private void notesView(){
		service.notesView();
	}






	//게시글 작성
	private void NoteWrite() {

		Scanner sc = new Scanner(System.in);

		if(logIn != null){

			System.out.println("게시글의 제목을 작성해주세요");
			String note_title = sc.next();

			System.out.println("게시할 글의 내용을 작성해주세요");
			String note_intext = sc.next();

			// 게시글을 작성
			service.noteWrite(logIn.getMem_id(), note_title, note_intext);
			System.out.println();
			System.out.println("게시글을 추가하였습니다.");


		}else{
			System.out.println("로그인을 한뒤에 게시글을 작성해주세요");
			logIn();
			NoteWrite();
		}
	}




	//게시글 수정
	private void noteReWrite() {
		if (logIn == null) {
			System.out.println("로그인시 가능합니다.");
			logIn();
			noteReWrite();
		} else if (logIn != null) {


			while (true){

				Scanner sc = new Scanner(System.in);
				System.out.println("게시글을 수정하기위해 비밀번호를 입력해주세요");
				String mem_pass = sc.next();
				if(logIn.getMem_pass().equals(mem_pass)){

					try{

						Scanner scan = new Scanner(System.in);
						System.out.println("수정하고자하는 게시글 번호를입력해주세요");
						int note_num = scan.nextInt();
						System.out.println("내용을 수정하세요");
						String note_intext = scan.next();

						boolean noteReWriteResult  = service.noteReWrite(note_num, logIn.getMem_id(), note_intext);

						if (noteReWriteResult  == false) {
							System.out.println("게시글 수정을 실패하였습니다.");

						} else {
							System.out.println("게시글이 성공적으로 변경되었습니다.");
							break;
						}

					}catch(InputMismatchException e){
						System.out.println("게시글 번호는 숫자로 입력해주세요.");
					}
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}

			}
			return;
		}
	}



	//////////////////////////////////////게시글 삭제
	private void noteRemove() {
		try{
			while(true){
				if(logIn==null){
					System.out.println("로그인을 해주세요.");
					this.logIn();		
				}else{
					if(this.checkPass() == true){
						this.myNoteView();
						Scanner sc = new Scanner(System.in);
						System.out.println("삭제할 글번호를 입력해주세요.");

						int note_remove = sc.nextInt();
						String mem_id=null;
						String mem_pass=null;
						NoteVO note = service.noteRemove(logIn.getMem_id(),note_remove);

						if(note!=null){
							System.out.println("삭제되었습니다.");
							return;
						}else{
							System.out.println("회원님이 작성한 게시글이 아닙니다.");
						}
					}else{
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				}
			}
		}catch(Exception e1){
			System.out.println("글번호는 문자열로입력하셨습니다. 숫자로입력해주세요");
			noteRemove();
		}
	}



	//비밀번호 확인 메서드
	private boolean checkPass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("본인 확인을 위한 password를 입력해주세요.");
		String mem_pass = sc.next();	
		boolean result = service.checkPass(mem_pass);
		return result;
	}

	//자기가 작성한 글 확인 메서드
	private void myNoteView() {
		String mem_id = logIn.getMem_id();
		service.myNoteView(mem_id);
	}









}
