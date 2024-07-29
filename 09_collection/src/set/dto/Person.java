package set.dto;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	private char gender;
	
	public Person() {
		super();
	}

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "person [이름 : " + name + " 나이 : " + age + " 성별 : " + gender +"]";
	}
	
	/* boolean Object.equals(Object other)
	 * - 현재 객체와 매개변수로 전달 받은 다른 객체의
	 *   필드 값이 일치하는지 확인하는 용도로 
	 *   오버라이딩해서 사용하는 Object제공 메서드
	 */
	@Override
	public boolean equals(Object other) {
		
		if( other == null ) return false;
		if( !(other instanceof Person) ) return false;
		
		// other 다운캐스팅
		Person o = (Person)other;
		
		// 이름이 같지 않으면
		if( !this.name.equals(o.name) ) return false;
		// 나이가 같지 않으면
		if( this.age != o.age ) 		return false;
		// 성별이 같지 않으면
		if( this.gender != o.gender ) 	return false;
		
		return true; // if문 실행 안되면 같은 값을 지닌 객체
	}
	
	
	/* int hashCode()
	 * - 객체별 식별 코드(객체를 구분하는 값)를 반환
	 * 
	 * - 식별 코드가 겹치지 않게 만들기 위해서 
	 *   hash 함수를 이용함
	 *   
	 * * hash 함수 : 값을 넣으면 동일한 크기의 값이 반환되는 함수
	 * 
	 * ex) sha-256 암호와 방식
	 * 	-> 문자열을 전달하면 256바이트 길이 문자열로 반환
	 * 
	 */
	@Override
	public int hashCode() {
		// Objects : Object 관련 유용한 기능 제공 클래스
		
		// 필드에 저장된 값을 이용해 hashCode를 생성하기 때문에
		// 필드 값이 모두 같으면 동일한 hashCode를 생성함
		return Objects.hash(name, age, gender);
	}
	
	
	
	
	
	
	
	
}
