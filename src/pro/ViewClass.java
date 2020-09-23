package pro;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class ViewClass {

	private IService service = new IServiceimpl();
	private MemberVO logIn = null; // 로그인 정보를 저장
	private int note_id = 0; // 게시글 번호를 저장
	private String buyer_id = null; // 거래처 아이디 정보를 저장
	private int lprod_id = 0; // 분류코드번호 저장

	public static void main(String[] args) {
		ViewClass vc = new ViewClass();

		while (true) {

			System.out.println();
			System.out.println("환영합니다.");
			System.out.println("원하는 메뉴를 선택해주세요");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 로그아웃");
			System.out.println("4. 종료");

			try {
				Scanner scMain = new Scanner(System.in);
				int input = scMain.nextInt();

				switch (input) {
				case 1: // 회원가입
					vc.createMember();
					break;
				case 2: // 로그인
					vc.logIn();

					while (true) {
						
						if(!vc.logInSave()) break;

						System.out.println("\n[ 메뉴 목록 ]");
						System.out.println("1. 회원관리 메뉴");
						System.out.println("2. 게시판 메뉴");
						System.out.println("3. 거래처 메뉴");
						System.out.println("4. 분류코드 메뉴");
						System.out.println("5. 이전으로");

						try {
							Scanner scLogin = new Scanner(System.in);

							int inputLogin = scLogin.nextInt();

							switch (inputLogin) {
							case 1: // 회원관리메뉴
								while (true) {
									
									if(!vc.logInSave()) break;

									System.out.println("\n[회원관리 메뉴입니다]");
									System.out.println("1. 회원목록");
									System.out.println("2. 회원검색");
									System.out.println("3. 회원정보 수정");
									System.out.println("4. 회원탈퇴");
									System.out.println("5. 이전으로");

									try {
										Scanner scMem = new Scanner(System.in);

										int inputMem = scMem.nextInt();

										switch (inputMem) {
										case 1: // 회원목록
											vc.memListView();
											continue;
										case 2: // 회원검색
											while (true) {

												System.out.println("\n[회원검색메뉴입니다]");
												System.out.println("1. 회원 아이디로 검색");
												System.out.println("2. 회원 이름으로 검색");
												System.out.println("3. 회원 나이로 검색");
												System.out.println("4. 회원 직업으로 검색");
												System.out.println("5. 이전으로");

												try {
													Scanner scMemChange = new Scanner(
															System.in);

													int inputMemChange = scMemChange
															.nextInt();

													switch (inputMemChange) {
													case 1: // 회원 아이디로 검색
														vc.searchMemId();
														continue;
													case 2: // 회원이름 으로검색
														vc.searchMemName();
														continue;
													case 3: // 회원나이로 검색
														vc.searchMemAge();
														continue;
													case 4: // 회원직업으로 검색
														vc.searchMemJob();
														continue;
													case 5: // 이전으로
														break;
													default:
														System.out
														.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out
													.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;
										case 3: // 회원 정보 수정
											
											if(!vc.cheakPassForChange()) continue;
											
											while (true) {

												System.out.println("\n[회원정보수정 메뉴입니다]");
												System.out.println("1. 회원비밀번호 변경");
												System.out.println("2. 회원이름 변경");
												System.out.println("3. 회원나이 변경");
												System.out.println("4. 회원직업 변경");
												System.out.println("5. 이전으로");

												try {
													Scanner scMemChange = new Scanner(
															System.in);

													int inputMemChange = scMemChange
															.nextInt();

													switch (inputMemChange) {
													case 1: // 회원비밀번호 변경
														vc.changeMemberPass();
														continue;
													case 2: // 회원이름 변경
														vc.changeMemberName();
														continue;
													case 3: // 회원나이 변경
														vc.changeMemberAge();
														continue;
													case 4: // 회원직업 변경
														vc.changeMemberJob();
														continue;
													case 5: // 이전으로
														break;
													default:
														System.out
														.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out
													.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;
										case 4: // 회원탈퇴
											vc.deleteMember();
											vc.logOut();
											continue;
										case 5: // 이전으로
											break;
										default:
											System.out
											.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
											continue;
										}
									} catch (InputMismatchException e) {
										System.out
										.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
										continue;
									}
									break;
								}
								continue;

							case 2: // 게시판 메뉴

								while (true) {

									System.out.println("\n[게시판 메뉴입니다]");
									System.out.println("1. 게시글 목록");
									System.out.println("2. 게시글 작성");
									System.out.println("3. 게시글 검색");
									System.out.println("4. 나의 게시글 관리");
									System.out.println("5. 이전으로");

									try {
										Scanner scNote = new Scanner(System.in);

										int inputNote = scNote.nextInt();

										switch (inputNote) {
										case 1: // 게시글 목록
											vc.notesView();
											continue;
										case 2: // 게시글 작성
											vc.createNote();
											continue;
										case 3: // 게시글 검색
											while (true) {

												System.out.println("\n[게시글 검색 메뉴입니다]");
												System.out.println("1. 게시글 제목으로 검색");
												System.out.println("2. 게시글 내용으로 검색");
												System.out.println("3. 게시글 작성일자로 검색");
												System.out.println("4. 게시글 작성자로 검색");
												System.out.println("5. 이전으로");

												try {
													Scanner scSearchNote = new Scanner(System.in);

													int inputSN = scSearchNote.nextInt();

													switch (inputSN) {
													case 1: // 게시글 제목으로 검색
														vc.searchNoteTitle();
														continue;
													case 2: // 게시글 내용으로 검색
														vc.searchNoteContent();
														continue;
													case 3: // 게시글 작성일자로 검색
														vc.searchNoteDate();
														continue;
													case 4: // 게시글 작성자로 검색
														vc.searchNoteMem();
														continue;
													case 5: // 이전으로
														break;
													default:
														System.out.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;
										case 4: // 나의 게시글
											if(!vc.cheakPassForChange()) continue;

											while (true) {

												System.out.println("\n[나의 게시글 메뉴입니다]");
												System.out.println();
												vc.myNoteView();
												System.out.println();
												System.out.println("1. 게시글 수정");
												System.out.println("2. 게시글 삭제");
												System.out.println("3. 최근삭제된 게시글");
												System.out.println("4. 이전으로");

												try {
													Scanner scMynote = new Scanner(System.in);

													int inputMyNote = scMynote.nextInt();

													switch (inputMyNote) {
													case 1: // 게시글 수정
														
														if(!vc.checkMyNote()) continue;
														
														while (true) {

															System.out.println("\n[게시글 수정 메뉴입니다]");
															System.out.println("1. 게시글 제목 수정");
															System.out.println("2. 게시글 내용 수정");
															System.out.println("3. 이전으로");

															try {
																Scanner scMem = new Scanner(System.in);

																int inputMem = scMem.nextInt();

																switch (inputMem) {
																case 1: // 게시글 제목 수정
																	vc.changeNoteTitle();
																	continue;
																case 2: // 게시글 내용 수정
																	vc.changeNoteContent();
																	continue;
																case 3: // 이전으로
																	break;
																default:
																	System.out.println("1~3번에 해당하는 [번호]를 입력해주세요 (예: 1)");
																	continue;
																}
															} catch (InputMismatchException e) {
																System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
																continue;
															}
															break;
														}
														continue;
													case 2: // 게시글 삭제
														vc.deleteNote();
														continue;
													case 3: // 최근삭제된 게시글
														vc.byeNoteList();
														continue;
													case 4: // 이전으로
														break;
													default:
														System.out.println("1~4번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;
										case 5: // 이전으로
											break;
										default:
											System.out.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
											continue;
										}
									} catch (InputMismatchException e) {
										System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
										continue;
									}
									break;
								}
								continue;

							case 3: // 거래처 메뉴

								while (true) {

									System.out.println("\n[거래처 메뉴입니다]");
									System.out.println("1. 거래처 목록");
									System.out.println("2. 거래처 검색");
									System.out.println("3. 거래처 정보 수정");
									System.out.println("4. 거래처 삭제");
									System.out.println("5. 이전으로");

									try {
										Scanner scBuyer = new Scanner(System.in);

										int inputBuyer = scBuyer.nextInt();

										switch (inputBuyer) {
										case 1: // 거래처 목록
											vc.buyerListView();
											continue;
										case 2: // 거래처 검색

											while (true) {

												System.out.println("\n[거래처 검색 메뉴입니다]");
												System.out.println("1. 거래처 아이디로 검색");
												System.out.println("2. 거래처 이름으로 검색");
												System.out.println("3. 거래처 분류코드로 검색");
												System.out.println("4. 거래처 은행으로 검색");
												System.out.println("5. 거래처 계좌번호로 검색");
												System.out.println("6. 거래처 예금주로 검색");
												System.out.println("7. 거래처 전화번호로 검색");
												System.out.println("8. 거래처 이메일로 검색");
												System.out.println("9. 이전으로");

												try {
													Scanner scBuyerSearch = new Scanner(System.in);

													int inputBuyerSearch = scBuyerSearch.nextInt();

													switch (inputBuyerSearch) {
													case 1: // 거래처 아이디로 검색
														vc.searchBuyerId();
														continue;
													case 2: // 거래처 이름으로 검색
														vc.searchBuyerNm();
														continue;
													case 3: // 거래처 분류코드로 검색
														vc.searchBuyerLgu();
														continue;
													case 4: // 거래처 은행으로 검색
														vc.searchBuyerBank();
														continue;
													case 5: // 거래처 계좌번호로 검색
														vc.searchBuyerBankNo();
														continue;
													case 6: // 거래처 예금주로 검색
														vc.searchBuyerBankName();
														continue;
													case 7: // 거래처 전화번호로 검색
														vc.searchBuyerTel();
														continue;
													case 8: // 거래처 이메일로 검색
														vc.searchBuyerEmail();
														continue;
													case 9: // 이전으로
														break;
													default:
														System.out
														.println("1~9번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out
													.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;

										case 3: // 거래처 정보 수정

											if (!vc.buyerIdsave())continue;

											while (true) {

												System.out.println("\n[거래처 정보수정 메뉴입니다]");
												System.out.println("1. 거래처 이름 수정");
												System.out.println("2. 거래처 분류코드 수정");
												System.out.println("3. 거래처 은행 수정");
												System.out.println("4. 거래처 계좌번호 수정");
												System.out.println("5. 거래처 예금주 수정");
												System.out.println("6. 거래처 전화번호 수정");
												System.out.println("7. 거래처 이메일 수정");
												System.out.println("8. 이전으로");

												try {
													Scanner scBuyerChange = new Scanner(System.in);

													int inputBuyerChange = scBuyerChange.nextInt();

													switch (inputBuyerChange) {
													case 1: // 거래처 이름 수정
														vc.changeBuyerName();
														continue;
													case 2: // 거래처 분류코드 수정
														vc.changeBuyerLgu();
														continue;
													case 3: // 거래처 은행 수정
														vc.changeBuyerBank();
														continue;
													case 4: // 거래처 계좌번호 수정
														vc.changeBuyerBankNo();
														continue;
													case 5: // 거래처 예금주 수정
														vc.changeBuyerBankName();
														continue;
													case 6: // 거래처 전화번호 수정
														vc.changeBuyerComTel();
														continue;
													case 7: // 거래처 이메일 수정
														vc.changeBuyerMail();
														continue;
													case 8: // 이전으로
														break;
													default:
														System.out
														.println("1~8번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out
													.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;
										case 4: // 거래처 삭제
											vc.deleteBuyer();
											continue;
										case 5: // 이전으로
											break;
										default:
											System.out
											.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
											continue;
										}
									} catch (InputMismatchException e) {
										System.out
										.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
										continue;
									}
									break;
								}
								continue;

							case 4: // 분류코드 메뉴

								while (true) {

									System.out.println("\n[분류코드 메뉴입니다]");
									System.out.println("1. 분류코드 목록");
									System.out.println("2. 분류코드 검색");
									System.out.println("3. 분류코드 수정");
									System.out.println("4. 분류코드 삭제");
									System.out.println("5. 이전으로");

									try {
										Scanner scLprod = new Scanner(System.in);

										int inputLprod = scLprod.nextInt();

										switch (inputLprod) {
										case 1: // 분류코드 목록
											vc.lprodListView();
											continue;
										case 2: // 분류코드 검색
											while (true) {
												System.out.println("\n[분류코드 검색 메뉴입니다]");
												System.out.println("1. 분류코드로 검색");
												System.out.println("2. 분류명으로 검색");
												System.out.println("3. 이전으로");

												try {
													Scanner scLprodsearch = new Scanner(System.in);

													int inputLprodsearch = scLprodsearch
															.nextInt();

													switch (inputLprodsearch) {
													case 1: // 분류코드로 검색
														vc.searchLprodGu();
														continue;
													case 2: // 분류명으로 검색
														vc.searchLprodNm();
														continue;
													case 3: // 이전으로
														break;
													default:
														System.out
														.println("1~3번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out
													.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;

										case 3: // 분류코드 수정

											if (!vc.lprodIdSave())
												continue;

											while (true) {

												System.out.println("\n[분류코드 수정 메뉴입니다]");
												System.out.println("1. 분류코드 수정");
												System.out.println("2. 분류명 수정");
												System.out.println("3. 이전으로");

												try {
													Scanner scLprodChange = new Scanner(System.in);

													int inputLprodChange = scLprodChange
															.nextInt();

													switch (inputLprodChange) {
													case 1: // 분류코드 수정
														vc.changeLprodGu();
														continue;
													case 2: // 분류명 수정
														vc.changeLprodName();
														continue;
													case 3: // 이전으로
														break;
													default:
														System.out
														.println("1~3번에 해당하는 [번호]를 입력해주세요 (예: 1)");
														continue;
													}
												} catch (InputMismatchException e) {
													System.out
													.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
													continue;
												}
												break;
											}
											continue;
										case 4: // 분류코드 삭제
											vc.deleteLprod();
											continue;
										case 5: // 이전으로
											break;
										default:
											System.out
											.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
											continue;
										}
									} catch (InputMismatchException e) {
										System.out
										.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
										continue;
									}
									break;
								}
								continue;
							case 5: // 이전으로
								break;
							default:
								System.out
								.println("1~5번에 해당하는 [번호]를 입력해주세요 (예: 1)");
								continue;
							}
						} catch (InputMismatchException e) {
							System.out
							.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
							continue;
						}
						break;
					}
					continue;

				case 3: // 로그아웃
					vc.logOut();
					break;

				case 4:// 종료
					return; 

				default: // 잘못된 번호 입력
					System.out.println("1~4번에 해당하는 [번호]를 입력해주세요 (예: 1)");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}


	//////////////////////////////////////////////////////////////////////////////////////////////////////////////MEMBERVO


	//회원가입을 위한 메서드
	private void createMember() {

		Scanner sc = new Scanner(System.in);

		String mem_id;
		while (true) {
			System.out.println();
			System.out.println("등록할 ID를 입력하세요");
			mem_id = sc.next();

			if (service.createIdCheck(mem_id)) {
				System.out.println("중복된 ID입니다.");

			} else {
				break;
			}
		}

		System.out.println("등록할 비밀번호 입력하세요");
		String mem_pass = sc.next();
		System.out.println("등록할 이름을 입력하세요");
		String mem_name = sc.next();
		System.out.println("등록할 나이를 입력하세요");
		int mem_age = sc.nextInt();
		System.out.println("등록할 직업을 입력하세요");
		String mem_job = sc.next();

		MemberVO mv = new MemberVO();
		mv.setMem_id(mem_id);
		mv.setMem_pass(mem_pass);
		mv.setMem_name(mem_name);
		mv.setMem_age(mem_age);
		mv.setMem_job(mem_job);

		boolean result = service.createMember(mv);

		if (result) {
			System.out.println("회원가입에 성공하셧습니다.");
		} else {
			System.out.println("회원가입에 실패하셧습니다.");
		}
	}

	//로그인을 위한 메서드
	private void logIn() {

		if (logIn != null) {
			System.out.println("이미 로그인 되었습니다.");
		} else {

			while (true) {
				Scanner sc = new Scanner(System.in);
				System.out.println("아이디입력");
				String mem_id = sc.next();
				System.out.println("비밀번호입력");
				String mem_pass = sc.next();

				MemberVO logInfo = service.logIn(mem_id, mem_pass);

				if (logInfo == null) {
					System.out.println("ID와 PW가 잘못되었습니다.");
				} else {
					System.out.println("'"+logInfo.getMem_name()+ "' 님 로그인이 완료 되었습니다.");
					logIn = logInfo;
					break;
				}
			}
		}
	}
	
	//로그인 여부를 판단하여 반환해주는 메서드
	private boolean logInSave(){
		boolean result = false;
		if(logIn != null){
			result = true;
		}
		return result;
	}

	//로그아웃을 위한 메서드
	private void logOut() {
		if (logIn == null) {
			System.out.println("로그인중이 아닙니다.");
		} else {
			logIn = null;
			System.out.println("로그아웃 되었습니다.");
		}
	}

	//회원 목록을 보기위한 메서드
	private void memListView(){
		Vector<MemberVO> memList = service.memListView();
		System.out.println("\t 회 원 정 보\n");
		System.out.println("회원ID\t이름\t나이\t직업");
		for(int index = 0 ; index < memList.size() ; index++){
			System.out.println(memList.get(index).getMem_id() + "\t" + memList.get(index).getMem_name() + "\t" + 
					memList.get(index).getMem_age()+ "\t" + memList.get(index).getMem_job());
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ memList.size()+"명");
	}

	//회원 탈퇴를 위한 메서드
	private void deleteMember(){
		Scanner sc = new Scanner(System.in);

		System.out.println("회원 탈퇴를 위해 비밀번호를 입력해주세요");
		String mem_pass = sc.next();
		
		boolean noteMemUseCheck = service.noteMemUseCheck(logIn.getMem_id());
		
		if(noteMemUseCheck){
			System.out.println("작성된 게시글이 있어 회원탈퇴 할 수 없습니다.");
			return;
		}

		MemberVO byeMem = service.deleteMember(logIn.getMem_id(), mem_pass);

		if(byeMem != null){
			System.out.println("'" + byeMem.getMem_name() + "' 님 탈퇴가 완료 되었습니다.");
		} else {
			System.out.println("비밀번호가 틀렸습니다. 회원탈퇴에 실패 하셨습니다.");
		}
	}

	//아이디로 회원검색을 하기위한 메서드
	private void searchMemId() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<MemberVO> memList = service.searchMemId(keyword);

		System.out.println("\n'"+keyword +"' 로 검색된 회원목록");
		System.out.println("회원ID\t이름\t나이\t직업");
		int count = 0;
		for(int index = 0 ; index < memList.size() ; index++ ){
			System.out.println(memList.get(index).getMem_id() + "\t" + memList.get(index).getMem_name() + "\t" + 
					memList.get(index).getMem_age()+ "\t" + memList.get(index).getMem_job());
			count++;
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("검색된 회원\t\t"+ count+"명");
	}

	//이름으로 회원검색을 하기위한 메서드
	private void searchMemName() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<MemberVO> memList = service.searchMemName(keyword);

		System.out.println("\n'"+keyword +"' 로 검색된 회원목록");
		System.out.println("회원ID\t이름\t나이\t직업");
		int count = 0;
		for(int index = 0 ; index < memList.size() ; index++ ){
			System.out.println(memList.get(index).getMem_id() + "\t" + memList.get(index).getMem_name() + "\t" + 
					memList.get(index).getMem_age()+ "\t" + memList.get(index).getMem_job());
			count++;
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("검색된 회원\t\t"+ count+"명");
	}

	//나이로 회원검색을 하기위한 메서드
	private void searchMemAge() {
		while (true){

			try {

				Scanner sc = new Scanner(System.in);
				System.out.println("검색할 나이를 입력하세요");
				int keyword = sc.nextInt();

				Vector<MemberVO> memList = service.searchMemAge(keyword);

				System.out.println("\n'"+keyword +"' 로 검색된 회원목록");
				System.out.println("회원ID\t이름\t나이\t직업");
				int count = 0;
				for(int index = 0 ; index < memList.size() ; index++ ){
					System.out.println(memList.get(index).getMem_id() + "\t" + memList.get(index).getMem_name() + "\t" + 
							memList.get(index).getMem_age()+ "\t" + memList.get(index).getMem_job());
					count++;

				}
				System.out.println("--------------------------------------------------------------------------------------");
				System.out.println("검색된 회원\t\t"+ count+"명");
				return;
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}

	//직업으로 회원검색을 하기위한 메서드
	private void searchMemJob() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<MemberVO> memList = service.searchMemJob(keyword);

		System.out.println("\n'"+keyword +"' 로 검색된 회원목록");
		System.out.println("회원ID\t이름\t나이\t직업");
		int count = 0;
		for(int index = 0 ; index < memList.size() ; index++ ){
			System.out.println(memList.get(index).getMem_id() + "\t" + memList.get(index).getMem_name() + "\t" + 
					memList.get(index).getMem_age()+ "\t" + memList.get(index).getMem_job());
			count++;
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("검색된 회원\t\t"+ count+"명");
	}

	//회원의 비밀번호를 변경하기 위한 메서드
	private void changeMemberPass(){
		Scanner sc = new Scanner(System.in);

		System.out.println("새로운 [비밀번호]를 입력해주세요");
		String newMemPass = sc.next();
		boolean result = service.changeMemberPass(logIn.getMem_id(),newMemPass);
		if(result) System.out.println("[비밀번호]가 성공적으로 변경되었습니다.");
	}

	//회원의 이름를 변경하기 위한 메서드
	private void changeMemberName(){
		Scanner sc = new Scanner(System.in);

		System.out.println("새로운 [이름]을 입력해주세요");
		String newMemName = sc.next();
		boolean result = service.changeMemberName(logIn.getMem_id(),newMemName);
		if(result) System.out.println("[이름]이 성공적으로 변경되었습니다.");
	}

	//회원의 나이를 변경하기 위한 메서드
	private void changeMemberAge(){

		while (true){
			try {
				Scanner scAge = new Scanner(System.in);

				System.out.println("새로운 [나이]를 입력해주세요");
				int newAge = scAge.nextInt();
				boolean result = service.changeMemberAge(logIn.getMem_id(),newAge);
				if(result) System.out.println("[나이]가 성공적으로 변경되었습니다.");
				break;
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}

	//회원의 직업을 변경하기 위한 메서드
	private void changeMemberJob(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("새로운 직업을 입력해주세요");
		String newMemJob = sc.next();
		boolean result = service.changeMemberJob(logIn.getMem_id(),newMemJob);
		if(result) System.out.println("직업이 성공적으로 변경되었습니다.");

	}

	//회원의 비밀번호 확인 메서드
	private boolean cheakPassForChange(){
		boolean result = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("본인확인을 위해[비밀번호]를 입력해주세요");
		String mem_pass = sc.next();

		if(logIn.getMem_pass().equals(mem_pass)){
			result = true;
		} else {
			System.out.println("[비밀번호]가 일치하지 않습니다.");
		}

		return result;
	}



	//////////////////////////////////////////////////////////////////////////////////////////////////NoteVO
	
	
	 // 게시글 작성을 위한 메서드
	private void createNote(){

		Scanner sc = new Scanner(System.in);

		System.out.println("글제목을 입력하세요");
		String note_title = sc.next();
		System.out.println("내용을 입력하세요");
		String note_content = sc.next();
		System.out.println("작성일자를 입력하세요");
		String note_date = sc.next();
		String mem_id = logIn.getMem_id();

		NoteVO newNote = new NoteVO();

		newNote.setNote_id(++NoteVO.note_count);
		newNote.setMem_id(logIn.getMem_id());
		newNote.setNote_title(note_title);
		newNote.setNote_content(note_content);
		newNote.setNote_date(note_date);

		boolean result = service.createNote(newNote);

		if(result){
			System.out.println("게시글 작성이 완료 되었습니다.");
		} else {
			System.out.println("게시글 작성에 실패 하였습니다.");
		}

	}
	
	// 게시글 목록을 보기위한 메서드
	private void notesView() {

		Vector<NoteVO> noteList = service.notesView();
		
		System.out.println("\t 게시글 목록 \n");
		System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
		
		for(int index = 0 ; index < noteList.size() ; index++){
			System.out.println(noteList.get(index).getNote_id() + "\t" + 
						       noteList.get(index).getNote_title() + "\t" + 
						       noteList.get(index).getNote_content() + "\t" + 
					           noteList.get(index).getMem_id()+ "\t" + 
		                       noteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ noteList.size()+"개");
				
	}
	
	//게시글을 제거하기위한 메서드
	private void deleteNote() {
		while (true){

			try {
				
				Scanner scDelete = new Scanner(System.in);
				System.out.println("삭제할 [글번호]를 입력해주세요.");

				int deleteNote = scDelete.nextInt();

				NoteVO note = service.deleteNote(logIn.getMem_id(),deleteNote);

				if(note!=null){
					System.out.println("게시글이 삭제되었습니다.");
					
				}else{
					System.out.println("회원님이 작성한 게시글이 아닙니다.");
					
				}
				return;
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}
	
	//나의 게시글의 목록을 보여주는 메서드
	private void myNoteView() {
		Vector<NoteVO> myNoteList = service.myNoteView(logIn.getMem_id());
		
		System.out.println("[작성한 글목록]");
		System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
		for(int index = 0 ; index < myNoteList.size() ; index++){
			System.out.println(myNoteList.get(index).getNote_id() + "\t" + 
							   myNoteList.get(index).getNote_title() + "\t" + 
							   myNoteList.get(index).getNote_content() + "\t" + 
							   myNoteList.get(index).getMem_id()+ "\t" + 
							   myNoteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ myNoteList.size()+"개");
		
	}
	
	//나의 최근삭제된 게시글을 보여주는 메서드
	private void byeNoteList(){
		Vector<NoteVO> byeNoteList = service.byeNoteList(logIn.getMem_id());
		
		if(byeNoteList.size() == 0){
			System.out.println("최근 삭제된 게시글이 없습니다.");
		} else {
			System.out.println("[최근삭제된 글목록]");
			System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
			for(int index = 0 ; index < byeNoteList.size() ; index++){
				System.out.println(byeNoteList.get(index).getNote_id() + "\t" + 
								   byeNoteList.get(index).getNote_title() + "\t" + 
								   byeNoteList.get(index).getNote_content() + "\t" + 
								   byeNoteList.get(index).getMem_id()+ "\t" + 
								   byeNoteList.get(index).getNote_date() );
			}
			System.out.println("---------------------------------");
			System.out.println("총합\t\t\t"+ byeNoteList.size()+"개");
		}
	}
	
	//수정전 나의 게시글인지 확인하는 메서드
	private boolean checkMyNote(){
		while (true){
			try {
				Scanner scCheckMyNote = new Scanner(System.in);
				
				System.out.println("수정할 [글번호]를 입력해주세요.");
				int checkNote = scCheckMyNote.nextInt();
				boolean result = service.checkMyNote(logIn.getMem_id(),checkNote);
				
				if(!result){
					System.out.println("회원님이 작성한 게시글이 아닙니다.");
				}
				
				note_id = checkNote;
				
				return result;
				
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}
	
	//게시글 제목을 수정하는 메서드
	private void changeNoteTitle() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 게시글 제목을 입력하세요");
		String note_title = sc.next();

		boolean result = service.changeNoteTitle(note_id, note_title);

		if (result) {
			System.out.println(" 게시글 제목이 성공적으로 수정되었습니다.");
		} else {
			System.out.println(" 게시글 제목 수정에 실패하셧습니다.");
		}
	}
	
	//게시글 내용을 수정하는 메서드
	private void changeNoteContent() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정할 게시글 내용을 입력하세요");
		String note_content = sc.next();
		
		boolean result = service.changeNoteContent(note_id, note_content);
		
		if (result) {
			System.out.println(" 게시글 내용이 성공적으로 수정되었습니다.");
		} else {
			System.out.println(" 게시글 내용 수정에 실패하셧습니다.");
		}
	}
	
	//제목으로 게시글을 검색 하기위한 메서드
	private void searchNoteTitle() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<NoteVO> noteList = service.searchNoteTitle(keyword);

		System.out.println("\n'"+keyword +"' 로 검색된 게시글목록");
		System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
		
		for(int index = 0 ; index < noteList.size() ; index++){
			System.out.println(noteList.get(index).getNote_id() + "\t" + 
						       noteList.get(index).getNote_title() + "\t" + 
						       noteList.get(index).getNote_content() + "\t" + 
					           noteList.get(index).getMem_id()+ "\t" + 
		                       noteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ noteList.size()+"개");
	}

	//내용으로 게시글을 검색 하기위한 메서드
	private void searchNoteContent() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();
		
		Vector<NoteVO> noteList = service.searchNoteContent(keyword);
		
		System.out.println("\n'"+keyword +"' 로 검색된 게시글목록");
		System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
		
		for(int index = 0 ; index < noteList.size() ; index++){
			System.out.println(noteList.get(index).getNote_id() + "\t" + 
					noteList.get(index).getNote_title() + "\t" + 
					noteList.get(index).getNote_content() + "\t" + 
					noteList.get(index).getMem_id()+ "\t" + 
					noteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ noteList.size()+"개");
	}

	//작성일자로 게시글을 검색 하기위한 메서드
	private void searchNoteDate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();
		
		Vector<NoteVO> noteList = service.searchNoteDate(keyword);
		
		System.out.println("\n'"+keyword +"' 로 검색된 게시글목록");
		System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
		
		for(int index = 0 ; index < noteList.size() ; index++){
			System.out.println(noteList.get(index).getNote_id() + "\t" + 
					noteList.get(index).getNote_title() + "\t" + 
					noteList.get(index).getNote_content() + "\t" + 
					noteList.get(index).getMem_id()+ "\t" + 
					noteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ noteList.size()+"개");
	}

	//작성자로 게시글을 검색 하기위한 메서드
	private void searchNoteMem() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();
		
		Vector<NoteVO> noteList = service.searchNoteMem(keyword);
		
		System.out.println("\n'"+keyword +"' 로 검색된 게시글목록");
		System.out.println("글번호\t글제목\t글내용\t작성자\t작성일자");
		
		for(int index = 0 ; index < noteList.size() ; index++){
			System.out.println(noteList.get(index).getNote_id() + "\t" + 
					noteList.get(index).getNote_title() + "\t" + 
					noteList.get(index).getNote_content() + "\t" + 
					noteList.get(index).getMem_id()+ "\t" + 
					noteList.get(index).getNote_date() );
		}
		System.out.println("---------------------------------");
		System.out.println("총합\t\t\t"+ noteList.size()+"개");
	}



	///////////////////////////////////////////////////////////////////////////////////////////////////////BuyerVO

	// 거래처 등록을 위한 메서드
	private void createBuyer() {

		Scanner sc = new Scanner(System.in);

		String buyer_id;

		while (true) {
			System.out.println();
			System.out.println("등록할 거래처 ID를 기입하세요");
			buyer_id = sc.next();

			if (service.buyerIdCheck(buyer_id)) {
				System.out.println("중복된 거래처 ID입니다.");
			} else {
				break;
			}
		}

		System.out.println("등록할 거래처 이름을 입력하세요");
		String buyer_name = sc.next();

		String buyer_lgu = "";

		while (true) {

			System.out.println("등록할 거래처 분류코드의 분류번호를 선택하세요");
			service.lprodListView();

			try {
				Scanner sc1 = new Scanner(System.in);
				int lprod_id = sc1.nextInt();

				if (service.lprodIdCheck(lprod_id)) {
					buyer_lgu = service.comeOnlgu(lprod_id);
				} else {
					System.out.println("해당하는 번호만 입력해주세요");
					continue;
				}

				System.out.println("등록할 거래처 은행명을 입력하세요");
				String buyer_bank = sc1.next();
				System.out.println("등록할 거래처 계좌번호를 입력하세요");
				String buyer_bankNo = sc1.next();
				System.out.println("등록할 거래처 예금주를 입력하세요");
				String buyer_bankName = sc1.next();
				System.out.println("등록할 거래처 전화번호를 입력하세요");
				String buyer_comTel = sc1.next();
				System.out.println("등록할 거래처 메일를 입력하세요");
				String buyer_mail = sc1.next();

				BuyerVO buyer = new BuyerVO();
				buyer.setBuyer_id(buyer_id);
				buyer.setBuyer_name(buyer_name);
				buyer.setBuyer_lgu(buyer_lgu);
				buyer.setBuyer_bank(buyer_bank);
				buyer.setBuyer_bankNo(buyer_bankNo);
				buyer.setBuyer_bankName(buyer_bankName);
				buyer.setBuyer_comTel(buyer_comTel);
				buyer.setBuyer_mail(buyer_mail);

				boolean result = service.createBuyer(buyer);

				if (result) {
					System.out.println("거래처 등록에 성공하셧습니다.");
					return;
				} else {
					System.out.println("거래처 등록에 실패하셧습니다.");
					return;
				}

			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 분류번호의 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}

	// 거래처 목록을 보기위한 메서드
	private void buyerListView() {
		Vector<BuyerVO> buyerList = service.buyerListView();
		
		System.out.println("\t 거래처 목록 \n");
		System.out.println("아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for(int index = 0 ; index < buyerList.size() ; index++){
			System.out.println(buyerList.get(index).getBuyer_id() + "\t" +
							   buyerList.get(index).getBuyer_name() + "\t " +
							   buyerList.get(index).getBuyer_lgu() + "\t " +
					  		   buyerList.get(index).getBuyer_bank() + "\t" +
							   buyerList.get(index).getBuyer_bankNo() + "\t" +
					  		   buyerList.get(index).getBuyer_bankName() + "\t" +
							   buyerList.get(index).getBuyer_comTel() + "\t" +
					  		   buyerList.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("거래처 총합\t\t"+ buyerList.size()+"개");	
	}

	// 거래처 수정시 거래처아이디를 확인하여 저장하기위한 메서드
	private boolean buyerIdsave() {
		Scanner sc = new Scanner(System.in);
		boolean result = false;

		System.out.println("수정할 거래처의 [아이디]를 입력해주세요");
		String buyer_id = sc.next();

		boolean idCheck = service.buyerIdCheck(buyer_id);

		if (!idCheck) {
			System.out.println("해당하는 거래처는 없습니다 거래처 [아이디]를 확인해주세요");
			return result;
		} else {
			this.buyer_id = buyer_id;
			result = true;
		}
		return result;
	}

	// 거래처 이름을 수정하기 위한 메서드
	private void changeBuyerName() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 거래처 이름을 입력하세요");
		String buyer_name = sc.next();

		boolean result = service.changeBuyerName(buyer_id, buyer_name);

		if (result) {
			System.out.println("거래처 이름이 성공적으로 수정되었습니다.");
		} else {
			System.out.println("거래처 이름수정에 실패하셧습니다.");
		}
	}

	// 거래처 은행을 수정하기 위한 메서드
	private void changeBuyerBank() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 거래처 은행을 입력하세요");
		String buyer_bank = sc.next();

		boolean result = service.changeBuyerBank(buyer_id, buyer_bank);

		if (result) {
			System.out.println("거래처 은행이 성공적으로 수정되었습니다.");
		} else {
			System.out.println("거래처 은행수정에 실패하셧습니다.");
		}
	}

	// 거래처 분류코드를 수정하기 위한 메서드
	private void changeBuyerLgu() {

		while (true) {

			this.lprodListView();
			System.out.println("수정할 거래처 분류코드의 분류번호를 선택하세요");

			try {
				Scanner sc1 = new Scanner(System.in);
				int lprod_id = sc1.nextInt();
				String buyer_lgu = "";

				if (service.lprodIdCheck(lprod_id)) {
					buyer_lgu = service.comeOnlgu(lprod_id);
				} else {
					System.out.println("해당하는 번호만 입력해주세요");
					continue;
				}

				boolean result = service.changeBuyerLgu(buyer_id, buyer_lgu);

				if (result) {
					System.out.println("거래처의 분류코드가 성공적으로 수정되었습니다.");
					return;
				} else {
					System.out.println("거래처 분큐코드 변경에 실패하셧습니다.");
				}
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 분류번호의 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}

	}

	// 거래처 계좌번호를 수정하기 위한 메서드
	private void changeBuyerBankNo() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 거래처 계좌번호를 입력하세요");
		String buyer_bankNo = sc.next();

		boolean result = service.changeBuyerBankNo(buyer_id, buyer_bankNo);

		if (result) {
			System.out.println("거래처 계좌번호가 성공적으로 수정되었습니다.");
		} else {
			System.out.println("거래처 계좌번호수정에 실패하셧습니다.");
		}
	}

	// 거래처 예금주를 수정하기 위한 메서드
	private void changeBuyerBankName() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 거래처 예금주를 입력하세요");
		String buyer_bankName = sc.next();

		boolean result = service.changeBuyerBank(buyer_id, buyer_bankName);

		if (result) {
			System.out.println("거래처 계좌번호가 성공적으로 수정되었습니다.");
		} else {
			System.out.println("거래처 계좌번호수정에 실패하셧습니다.");
		}
	}

	// 거래처 전화번호를 수정하기 위한 메서드
	private void changeBuyerComTel() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 거래처 전화번호를 입력하세요");
		String buyer_comTel = sc.next();

		boolean result = service.changeBuyerComTel(buyer_id, buyer_comTel);

		if (result) {
			System.out.println("거래처 전화번호가 성공적으로 수정되었습니다.");
		} else {
			System.out.println("거래처 전화번호 수정에 실패하셧습니다.");
		}
	}

	// 거래처 이메일을 수정하기 위한 메서드
	private void changeBuyerMail() {

		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 거래처 이메일을 입력하세요");
		String buyer_mail = sc.next();

		boolean result = service.changeBuyerMail(buyer_id, buyer_mail);

		if (result) {
			System.out.println("거래처 이메일이 성공적으로 수정되었습니다.");
		} else {
			System.out.println("거래처 이메일 수정에 실패하셧습니다.");
		}
	}

	// 거래처 삭제를 위한 메서드
	private void deleteBuyer() {
		Scanner sc = new Scanner(System.in);

		System.out.println("삭제할 거래처의 아이디를 입력해주세요");
		String buyer_id = sc.next();

		boolean idCheck = service.buyerIdCheck(buyer_id);

		if (!idCheck) {
			System.out.println("해당하는 거래처는 없습니다 거래처 아이디를 확인해주세요");
		}

		BuyerVO byeBuyer = service.deleteBuyer(buyer_id);

		if (byeBuyer != null) {
			System.out.println("거래처 : " + byeBuyer.getBuyer_id() + " "
					+ byeBuyer.getBuyer_name() + "가 삭제완료 되었습니다.");
		}
	}

	//아이디로 거래처를 검색하기위한 메서드
	private void searchBuyerId() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerId(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
		
	}

	//거래처 명으로 거래처를 검색하기 위한 메서드
	private void searchBuyerNm() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerNm(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}

	//분류코드로 거래처를 검색하기 위한메서드
	private void searchBuyerLgu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerLgu(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}

	//거래처은행으로 거래처를 검색하기 위한메서드
	private void searchBuyerBank() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerBank(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}

	//거래처 계좌번호으로 거래처를 검색하기 위한메서드
	private void searchBuyerBankNo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerBankNo(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}

	//거래처 예금주로 거래처를 검색하기 위한메서드
	private void searchBuyerBankName() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerBankName(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}

	//거래처 전화번호로 거래처 검색하기위한 메서드
	private void searchBuyerTel() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerTel(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}

	//거래처 이메일로 거래처 검색하기 위한 메서드
	private void searchBuyerEmail() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<BuyerVO> searchBuyer = service.searchBuyerEmail(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 거래처목록");
		System.out.println("거래처아이디\t거래처이름\t납품분류\t거래처은행\t거래처계좌번호\t예금주\t전화번호\t\te-mail");
		
		for (int index = 0; index < searchBuyer.size(); index++) {
			System.out.println(searchBuyer.get(index).getBuyer_id() + "\t" +
					           searchBuyer.get(index).getBuyer_name() + "\t " +
					           searchBuyer.get(index).getBuyer_bank() + "\t" +
					           searchBuyer.get(index).getBuyer_lgu() + "\t" +
					           searchBuyer.get(index).getBuyer_bankNo() + "\t" +
					           searchBuyer.get(index).getBuyer_bankName() + "\t" +
					           searchBuyer.get(index).getBuyer_comTel() + "\t" +
					           searchBuyer.get(index).getBuyer_mail());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 거래처\t\t"+ searchBuyer.size()+"개");
	}



	//////////////////////////////////////////////////////////////////////////////////////////////////LprodVO


	// 분류코드의 목록을 보여주는 메서드
	private void lprodListView() {
		Vector<LprodVO> lprodList = service.lprodListView();
		
		System.out.println("\n\t분류코드 목록");
		System.out.println("분류번호\t분류코드\t분류명");
		
		for(int index = 0 ; index < lprodList.size() ; index++){
			System.out.println(lprodList.get(index).getLprod_id() + "\t" +
							   lprodList.get(index).getLprod_gu() + "\t" +
							   lprodList.get(index).getLprod_nm() );
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("분류코드 총합\t\t"+ lprodList.size()+"개");
		
	}

	// 분류코드 등록을 위한 메서드
	private void createLprod() {

		Scanner sc = new Scanner(System.in);

		String lprod_gu = "";
		while (true) {
			System.out.println();
			System.out.println("등록할 분류코드를 입력하세요");
			lprod_gu = sc.next();

			if (service.lprodGuCheck(lprod_gu)) {
				System.out.println("중복된 거래처 ID입니다.");
			} else {
				break;
			}
		}

		System.out.println("분류명을 입력하세요");
		String lprod_nm = sc.next();

		LprodVO lprod = new LprodVO();
		lprod.setLprod_gu(lprod_gu);
		lprod.setLprod_nm(lprod_nm);

		boolean result = service.createLprod(lprod);

		if (result) {
			System.out.println("분류코드 등록을 완료하였습니다.");
		} else {
			System.out.println("분류코드 등록을 실패하였습니다.");
		}

	}

	// 분류코드 삭제를위한 메서드
	private void deleteLprod() {
		Scanner sc = new Scanner(System.in);
		
		
		this.lprodListView();
		System.out.println("삭제할 [분류코드]를 입력해주세요 (예 : P101)");
		String lprod_gu = sc.next();

		boolean lprodGuCheck = service.lprodGuCheck(lprod_gu);

		if (!lprodGuCheck) {
			System.out.println("해당하는 [분류코드]는 없습니다. [분류코드]를 확인해주세요.");
			return;
		}

		boolean buyerLguCheck = service.buyerLguCheck(lprod_gu);

		if(buyerLguCheck){ 
			System.out.println("해당하는 분류코드는 거래처에 참조되어 있기 때문에 삭제가 불가능합니다.");
			return;
		}

		LprodVO byeLprod = service.deleteLprod(lprod_gu);

		if (byeLprod != null) {
			System.out.println("분류코드 : " + byeLprod.getLprod_gu() + " "
					+ byeLprod.getLprod_nm() + " (이)가 삭제완료 되었습니다.");
		}
	}

	// 분류코드 수정시 분류코드아이디를 유지하기위한 메서드
	private boolean lprodIdSave() {
		boolean result = false;
		while (true) {
			try {
				Scanner scqw = new Scanner(System.in);
				service.lprodListView();
				System.out.println("수정할 분류코드의 분류번호를 입력해주세요");
				int lprod_id = scqw.nextInt();

				boolean idCheck = service.lprodIdCheck(lprod_id);

				if (!idCheck) {
					System.out.println("해당하는 분류번호는 없습니다 목록을 통하여 분류번호를 확인해주세요");
					return result;
				} else {
					this.lprod_id = lprod_id;
					result = true;
				}
				return result;
			} catch (InputMismatchException e) {
				System.out.println("[ERROR : 분류번호의 숫자만 기입해주세요 (예 : 1)] \n");
			}
		}
	}

	// 분류코드구분를 수정하는 메서드
	private void changeLprodGu() {
		Scanner sc = new Scanner(System.in);
		
		this.lprodListView();
		System.out.println("수정할 분류코드를 입력하세요");
		String lprod_gu = sc.next();

		boolean result = service.changeLprodGu(lprod_id, lprod_gu);

		if (result) {
			System.out.println("분류테이블의 분류코드가 모두 성공적으로 변경되었습니다.");
			System.out.println("분류코드가 변경되어 거래처의 분류코드를 업데이트 합니다.");
		} else {
			System.out.println("분류코드 변경이 실패하셨습니다.");
		}
	}

	// 분류명을 수정하는 메서드
	private void changeLprodName() {
		Scanner sc = new Scanner(System.in);

		System.out.println("수정할 분류명을 입력하세요");
		String lprod_nm = sc.next();

		boolean result = service.changeLprodName(lprod_id, lprod_nm);

		if (result) {
			System.out.println("분류명이 성공적으로 수정되었습니다.");
		} else {
			System.out.println("분류명 수정이 실패하셧습니다.");
		}
	}

	//분류구분으로 분류코드를 검색하기위한 메서드
	private void searchLprodGu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<LprodVO> searchLprod = service.searchLprodGu(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 분류코드 목록");
		System.out.println("분류번호\t분류코드\t분류명");
		
		for (int index = 0; index < searchLprod.size(); index++) {
			System.out.println(searchLprod.get(index).getLprod_id() + "\t" +
					           searchLprod.get(index).getLprod_gu() + "\t " +
					           searchLprod.get(index).getLprod_nm());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 분류코드\t\t"+ searchLprod.size()+"개");
		

	}

	//분류명으로 분류코드를 검색하기 위한 메서드
	private void searchLprodNm() {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색할 키워드를 입력하세요");
		String keyword = sc.next();

		Vector<LprodVO> searchLprod = service.searchLprodNm(keyword);
		
		System.out.println("'"+keyword +"' 로 검색된 분류코드 목록");
		System.out.println("분류번호\t분류코드\t분류명");
		
		for (int index = 0; index < searchLprod.size(); index++) {
			System.out.println(searchLprod.get(index).getLprod_id() + "\t" +
					           searchLprod.get(index).getLprod_gu() + "\t " +
					           searchLprod.get(index).getLprod_nm());
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("검색된 분류코드\t\t"+ searchLprod.size()+"개");

	}


}
