package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import dto.Member;
import service.MemberService;
import service.MemberServiceImpl;

// View : 사용자에게 보여지는 역할을 하는 클래스/객체
// - 보여줄 화면을 출력 / 필요한 데이터를 입력
public class MemberView {

	private MemberService service = null;
	private BufferedReader br = null;

	// 기본 생성자
	public MemberView() {

		try {
			// 객체 생성 중 발생한 예외를 View에 모아서 처리
			service = new MemberServiceImpl();

			// 키보드를 입력 받기 위한 스트림 생성
			br = new BufferedReader(new InputStreamReader(System.in));

		} catch (Exception e) {

			System.out.println("*** 프로그램 실행 중 오류 발생 ***");
			e.printStackTrace();
			System.exit(0); // 프로그램 종료
		}
	}

	// -------------------------------------------------------------------
	// [메인 메뉴]
	public void mainMenu() {

		int input = 0;
		do {

			try {
				// 메뉴 출력 후 입력된 번호를 반환 받기
				input = selectMenu();

				// 선택된 메뉴 번호에 따라 case 선택
				switch (input) {
				case 1:
					addMember();
					break;
				case 2:
					selectAll();
					break;
				case 3:
					selectName();
					break;
				case 4:
					updateAmount();
					break;
				case 5:
					updateMember();
					break;
				case 6:
					deleteMember();
					break;
				case 0:
					System.out.println("*** 프로그램 종료 ***");
					break;
				default:
					System.out.println("### 메뉴에 작성된 번호만 입력 해주세요 ###");
				}

				System.out.println("--------------------------------");

			} catch (NumberFormatException e) {
				System.out.println("\n### 숫자만 입력 해주세요 ###\n");
				input = -1; // 첫 반복에서 종료되지 않게 값 변경

			} catch (IOException e) {
				System.out.println("\n### 입출력 관련 예외 발생 ###\n");
				e.printStackTrace(); // 예외 추적

			} catch (Exception e) { // 나머지 예외 처리
				e.printStackTrace();
			}

		} while (input != 0);

	}

	// -------------------------------------------------------------------
	// [메뉴 출력/선택하는 메서드]

	private int selectMenu() throws NumberFormatException, IOException {

		System.out.println("\n===== 회원 관리 프로그램 =====\n");

		System.out.println("1. 회원 가입(추가)");
		System.out.println("2. 회원 전체 조회");
		System.out.println("3. 이름 검색(동명이인 있으면 모두 조회)");
		System.out.println("4. 특정 회원 사용 금액 누적하기");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 종료");

		System.out.print("메뉴 선택 >>> ");

		// 입력 받은 문자열을 int 형태로 변환
		int input = Integer.parseInt(br.readLine());
		System.out.println(); // 줄바꿈

		return input;
	}

	// 1.회원가입
	private void addMember() throws IOException {
		System.out.println("\n------- 회원 가입(추가)--------\n");

		System.out.print("이름 : ");
		String name = br.readLine();

		String phone = null;
		while (true) {
			System.out.print("휴대폰 번호(- 제외): ");
			phone = br.readLine();
			if (phone.length() != 11) {
				System.out.println("*** 다시 입력 해주세요 ***\n");
				continue;
			}
			break;
		}

		boolean result = service.addMember(name, phone);

		if (result) {
			System.out.println("\n**** 회원이 추가 되었습니다****\n");
		} else {
			System.out.println("\n#### 중복되는 휴대폰 번호가 존재합니다 ####\n");
		}
	}

	// 2. 회원 전체 조회
	private void selectAll() {
		System.out.println("\n------ 회원 전체 조회 ------\n");

		// 회원 목록을 조회해 반환하는 서비스 호출
		List<Member> memberList = service.getMemberList();

		// 조회된 회원 목록이 없을 경우
		if (memberList.isEmpty()) {
			System.out.println("\n### 회원이 존재하지 않습니다 ###\n");
		}

		String[] gradeArr = { "일반", "골드", "다이아" };

		// 향상된 for문
		for (Member member : memberList) {

			System.out.printf("%-6s %-12s %8d %5s \n", member.getName(), member.getPhone(), member.getAmount(),
					gradeArr[member.getGrade()]);
		}
	}

	// 3. 이름으로 검색
	private void selectName() throws IOException {
		System.out.println("\n------- 이름 검색(동명이인 있으면 모두 조회) ---------\n");
		System.out.print("검색할 이름 검색 : ");
		String searchName = br.readLine();

		// 이름 검색 서비스 호출 후 결과 반환
		// (서비스 작성 후 돌아올 예정)
		List<Member> searchList = service.selectName(searchName);

		// 검색 결과가 없을 경우
		if (searchList.isEmpty()) {
			System.out.println("\n### 검색 결과가 없습니다 ###\n");
			return;
		}

		// 검색 결과가 있을 경우
		for (Member member : searchList) {
			System.out.println(member);
		}

	}

	// 4. 특정 회원 사용 금액 누적하기
	private void updateAmount() throws IOException {
		System.out.println("\n------- 특정 회원 사용 금액 누적하기 -------\n");
		System.out.print("회원 이름 입력 : ");
		String targetName = br.readLine();

		// 이름이 일치하는 회원 모두 조회
		List<Member> searchList = service.selectName(targetName);

		// 이름이 일치하는 회원이 없을 경우
		if (searchList.isEmpty()) {
			System.out.println("\n### 이름이 일치하는 회원이 존재하지 않습니다 ###\n");
			return;
		}

		// 금액 증가 대상 회원만 참조할 Member 참조 변수 선언
		Member target = null;

		// 1) 동명이인이 있을 경우
		// -> 이름, 전화번호 출력해서 한 명만 선택하게 함
		if (searchList.size() > 1) {
			System.out.println("\n*** 대상 회원 선택 ***\n");
			for (int i = 0; i < searchList.size(); i++) {
				System.out.printf("%d) %s (%s)\n", i + 1, searchList.get(i).getName(), searchList.get(i).getPhone());
			}

			System.out.print("선택할 회원의 번호를 입력 : ");

			int input = Integer.parseInt(br.readLine()) - 1;

			if (input < 0 || input >= searchList.size()) {
				System.out.println("\n### 없는 회원 번호 입니다. ###\n");
				return;
			}
			// target에 회원을 저장
			target = searchList.get(input);
		} else {
			// 2) 동명이인이 없을때
			target = searchList.get(0);
		}

		// 누적할 금액 입력
		System.out.print("누적할 금액 입력 : ");
		int acc = Integer.parseInt(br.readLine());

		// 대상 회원, 누적할 금액을 서비스로 전달하여
		// - 금액 누적
		// - 등급 조정
		// - 파일에 데이터 저장

		// 서비스에서 반환 받을 문자열
		// ex) 신짱구 님의 누적 금액
		// 2000 -> 10000
		// * 골드 * 등급으로 변경 되셨습니다

		String result = service.updateAmount(target, acc);

		System.out.println(result);

	}

	// 5. 회원 정보 수정
	private void updateMember() throws IOException {

		System.out.println("\n------- 회원 정보 수정 -------\n");
		System.out.print("수정할 회원 이름 입력 : ");

		String targetName = br.readLine();

		// 이름이 일치하는 회원 모두 조회
		List<Member> searchList = service.selectName(targetName);

		// 이름이 일치하는 회원이 없을 경우
		if (searchList.isEmpty()) {
			System.out.println("\n### 이름이 일치하는 회원이 존재하지 않습니다 ###\n");
			return;
		}

		Member target = null;

		if (searchList.size() > 1) {
			System.out.println("\n*** 대상 회원 선택 ***\n");
			for (int i = 0; i < searchList.size(); i++) {
				System.out.printf("%d) %s (%s)\n", i + 1, searchList.get(i).getName(), searchList.get(i).getPhone());
			}

			System.out.print("선택할 회원의 번호를 입력 : ");

			int input = Integer.parseInt(br.readLine()) - 1;

			if (input < 0 || input >= searchList.size()) {
				System.out.println("\n### 없는 회원 번호 입니다. ###\n");
				return;
			}
			// target에 회원을 저장
			target = searchList.get(input);
		} else {
			// 2) 동명이인이 없을때
			target = searchList.get(0);
		}

		System.out.print("수정할 전화번호 입력 : ");
		String number = br.readLine();

		String result = service.updateMember(target, number);

		System.out.println(result);

	}

	// 6. 회원 탈퇴
	private void deleteMember() throws IOException {
		System.out.println("\n------- 회원 탈퇴 --------\n");

		System.out.print("회원 이름 입력 : ");

		String targetName = br.readLine();

		// 이름이 일치하는 회원 모두 조회
		List<Member> searchList = service.selectName(targetName);

		// 이름이 일치하는 회원이 없을 경우
		if (searchList.isEmpty()) {
			System.out.println("\n### 이름이 일치하는 회원이 존재하지 않습니다 ###\n");
			return;
		}

		// 수정 대상을 참조할 변수 선언
		Member target = null;

		if (searchList.size() > 1) { // 동명이인 있을 경우

			System.out.println("\n*** 대상 회원을 선택 해주세요 ***\n");

			for (int i = 0; i < searchList.size(); i++) {
				System.out.printf("%d) %s (%s)\n", i + 1, searchList.get(i).getName(), searchList.get(i).getPhone());
			}

			System.out.print("선택할 회원의 번호를 입력 : ");
			int input = Integer.parseInt(br.readLine()) - 1;

			if (input < 0 || input >= searchList.size()) {
				System.out.println("\n### 없는 회원 번호 입니다. 다시 시도 해주세요 ###\n");
				return;
			}

			target = searchList.get(input);

		} else { // 동명이인 없을 경우
			target = searchList.get(0);
		}
		
		// 탈퇴 여부 재확인
		System.out.println("정말 탈퇴 처리 하시겠습니까? (y/n) : ");
		
		// 입력 받은 문자열을 소문자로 만들어 제일 앞 문자만 반환
		char check = br.readLine().toLowerCase().charAt(0);
		
		if(check == 'n') {
			System.out.println("\n### 탈퇴 취소 ###\n");
			return;
		}
		if(check != 'y') {
			System.out.println("\n### 잘못 입력 하셨습니다. 다시 시도해주세요 ###\n");
			return;
		}
		
		// y가 입력된 경우
		// 탈퇴 서비스 호출 후 결과 문자열 반환 받기
		String result = service.deleteMember(target);
		
		System.out.println(result);
		

	}

}
