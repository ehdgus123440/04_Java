package list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import list.dto.BookDTO;

public class BookService {

	// BookDTO 객체 참조 변수만을 저장하는 ArrayList 객체 생성
	// -> <BookDTO> == 제네릭(타입 제한)
	private List<BookDTO> booklist = new ArrayList<BookDTO>();

	public BookService() {
		booklist.add(new BookDTO("자바 프로그래밍 입문", "박은종", 25000));
		booklist.add(new BookDTO("선재 업고 튀어 대본집 세트", "이시은", 45000));
		booklist.add(new BookDTO("THE MONEY BOOK", "토스", 19800));

		booklist.add(new BookDTO("자바의 정석", "남궁 성", 35000));
		booklist.add(new BookDTO("자바의 정석2", "남궁 성", 30000));
		booklist.add(new BookDTO("눈물의 여왕 대본집 세트", "박지은", 60000));
		booklist.add(new BookDTO("삼국지 전권 세트", "이문열", 300000));
	}

	/**
	 * booklist를 반환하는 서비스 메서드
	 * 
	 * @return booklist
	 */
	public List<BookDTO> selectAll() {

		return booklist;
	}

	/**
	 * booklist에 전달받은 index가 존재하면 해당 index 번째 요소(BookDTO) 반환 없으면 null 반환
	 * 
	 * @param index
	 * @return BookDTO, null
	 */
	public BookDTO selectIndex(int index) {

		if (index < 0 || index >= booklist.size())
			return null;

		return booklist.get(index);
	}

	/**
	 * booklist 요소의 제목 중 전달 받은 title이 포함된 책을 모두 반환
	 * 
	 * @param title
	 * @return searchList (찾은 책이 저장된 리스트)
	 */
	public List<BookDTO> selectTitle(String title) {

		List<BookDTO> searchList = new ArrayList<BookDTO>();

		for (BookDTO book : booklist) {
			if (book.getTitle().contains(title)) {

				searchList.add(book);
			}
		}

		return searchList;

	}

	public List<BookDTO> selectName(String name) {

		List<BookDTO> searchList = new ArrayList<BookDTO>();

		for (BookDTO book : booklist) {
			if (book.getWriter().contains(name)) {
				searchList.add(book);
			}
		}

		return searchList;

	}

	public List<BookDTO> selectPrice(int priceMax, int priceMin) {

		List<BookDTO> searchList = new ArrayList<BookDTO>();

		for (BookDTO book : booklist) {
			if (book.getPrice() <= priceMax && book.getPrice() >= priceMin) {
				searchList.add(book);
			}
		}

		return searchList;
	}

	/**
	 * 전달 받은 newBook을 booklist에 추가
	 * 
	 * @param newBook
	 * @return true
	 */
	public boolean addBook(BookDTO newBook) {

		return booklist.add(newBook);
	}

	public boolean removeBook(int index) {

		boolean check = false;
		if (index >= 0 && index <= booklist.size()) {
			String bookName = booklist.get(index).getTitle();
			System.out.println("[" + bookName + "] 책이 목록에서 제거 되었습니다");
			booklist.remove(index);
			check = true;
			return check;
		}
		return check;
	}

	public boolean changePrice(int index) {

		System.out.println("["+booklist.get(index).getTitle() + "] 의 가격은 : " + booklist.get(index).getPrice());

		Scanner scan = new Scanner(System.in);

		System.out.print("변경할 가격 : ");

		int price = scan.nextInt();

		if (price > 0) {
			System.out.print("\n["+booklist.get(index).getTitle() + "] 의 가격이 (" +
					booklist.get(index).getPrice() + ") 에서 (");
			booklist.get(index).setPrice(price);
			System.out.println(booklist.get(index).getPrice() + ") 으로");
			return true;
		}

		return false;
	}

}
