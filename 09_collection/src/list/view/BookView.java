package list.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import list.dto.BookDTO;
import list.service.BookService;

public class BookView {

	private Scanner scan = new Scanner(System.in);

	private BookService service = new BookService(); 

	public void mainMenu() {
		int input = 0;
		do {
			System.out.println("\n****** 도서 관리 프로그램 *******\n");
			System.out.println("1. 전체 조회");
			System.out.println("2. index로 조회");
			System.out.println("3. 책 이름으로 조회(포함)");
			System.out.println("4. 글쓴이 이름으로 조회(포함)");
			System.out.println("5. 가격으로 조회");
			System.out.println("6. 책 추가하기");
			System.out.println("7. 책 제거하기");
			System.out.println("8. 책 가격 수정하기");
			System.out.println("0. 종료");

			System.out.println();
			System.out.print("메뉴 선택 >> ");
			input = scan.nextInt();
			scan.nextLine();
			System.out.println();

			switch (input) {
			case 1:
				selectAll();
				break;
			case 2:
				selectIndex();
				break;
			case 3:
				selectTitle();
				break;
			case 4:
				selectWriter();
				break;
			case 5:
				selectPrice();
				break;
			case 6:
				addBook();
				break;
			case 7:
				removeBook();
				break;
			case 8:
				changePrice();
				break;
			case 0:
				System.out.println("******** 프로그램 종료 **********");
				break;
			default:
				System.out.println(" =-=-= 잘못 입력 =-=-=");
			}

		} while (input != 0);

	}

	private void selectAll() {
		System.out.println("\n--------- 전체 조회 ----------\n");
		List<BookDTO> booklist = service.selectAll();

		for (int i = 0; i < booklist.size(); i++) {
			System.out.println(i + ") " + booklist.get(i));
		}
	}

	private void selectIndex() {
		System.out.println("\n--------- index로 조회 ---------\n");
		System.out.println("조회할 책의 index번호 입력");
		int index = scan.nextInt();

		// 전달한 index번째 요소가 존재하면 BookDTO 객체 주소
		// 없다면 null 반환
		BookDTO book = service.selectIndex(index);

		if (book == null) {
			System.out.println("=-=-= 해당 인덱스에 책이 존재하지 않습니다 =-=-=");
			return;
		}
		System.out.println("제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getWriter());
		System.out.println("가격 : " + book.getPrice() + "원");
	}

	private void selectTitle() {
		System.out.println("\n------- 책 이름으로 조회(포함) --------\n");
		System.out.print("검색한 책 제목 입력 : ");
		String title = scan.nextLine();

		List<BookDTO> searchList = service.selectTitle(title);

//		if(searchList.size() == 0) {}
		if (searchList.isEmpty()) {
			System.out.println("=-=-= 조회 결과가 없습니다 =-=-=");
			return;
		}

		// 검색 결과 있는 경우
		for (BookDTO book : searchList) {
			System.out.println(book);
		}
	}

	private void selectWriter() {
		System.out.println("\n-------- 글쓴이 이름으로 조회(포함) ----------\n");
		System.out.print("검색할 글쓴이 이름 입력 : ");
		String name = scan.nextLine();

		List<BookDTO> searchList = service.selectName(name);

		if (searchList.isEmpty()) {
			System.out.println("=-=-= 조회 결과가 없습니다 =-=-=");
			return;
		}
		// 검색 결과 있는 경우
		for (BookDTO book : searchList) {
			System.out.println(book);
		}
	}

	private void selectPrice() {
		System.out.println("\n-------- 가격으로 조회 ----------\n");
		System.out.print("검색할 가격 최소값 검색 : ");
		int priceMin = scan.nextInt();
		System.out.print("검색할 가격 최대값 검색 : ");
		int priceMax = scan.nextInt();
		System.out.println();

		List<BookDTO> searchList = service.selectPrice(priceMax, priceMin);

		if (searchList.isEmpty()) {
			System.out.println("=-=-= 조회 결과가 없습니다 =-=-=");
			return;
		}
		// 검색 결과 있는 경우
		for (BookDTO book : searchList) {
			System.out.println(book);
		}
	}

	private void addBook() {
		// 제목, 글쓴이, 가격 입력받아 추가
		System.out.println("\n--------- 책 추가하기 -----------\n");

		System.out.print("추가할 책 제목 입력 : ");
		String bookName = scan.nextLine();
		System.out.print("추가할 책 글쓴이 입력 : ");
		String writer = scan.nextLine();
		System.out.print("추가할 책 가격 입력 : ");
		int price = scan.nextInt();

		BookDTO newBook = new BookDTO(bookName, writer, price);

		boolean result = service.addBook(newBook);

		if (result) {
			System.out.println("---------- 추가 완료 ------------");
		} else {
			System.out.println("----------- 추가 중 문제 발생 -----------");
		}

	}

	public void removeBook() {

		System.out.println("\n----------- 책 제거하기 ------------\n");

		System.out.print("제거할 책의 인덱스 입력 : ");
		int index = scan.nextInt();

		boolean check = service.removeBook(index);

		if (check == false) {
			System.out.println("해당 인덱스에 존재하는 책이 없습니다");
		}

	}

	public void changePrice() {
		System.out.println("----------- 책 가격 수정하기 ------------");

		System.out.print("수정할 책의 인덱스 번호 입력 : ");
		int index = scan.nextInt();

		boolean check = service.changePrice(index);

		if(check) {
			System.out.println("변경이 완료 되었습니다");
		}
		else {
			System.out.println("양수를 입력해 주세요");
		}
	}

}
