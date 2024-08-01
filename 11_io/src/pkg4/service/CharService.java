package pkg4.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* 문자 기반 스트림
 * 
 * - 2byte 문자(char) 단위로 입/출력하는 스트림
 * 
 * - 문자만 작성된 파일(txt),채팅, 인터넷 요청(주소) / 응답(html)
 * 
 * - Reader(입력), Writer(출력) 최상위 인터페이스
 */

public class CharService {
	
	/**
	 * 문자 기반 스트림을 이용해 출력하기
	 * - 기반 스트림만 이용
	 */
	public void fileOutput1() {
		
		// StringBuilder : String 불변성을 해결한 객체
		StringBuilder sb = new StringBuilder();
		
		sb.append("오늘은 8월 1일 입니다\n");
		sb.append("아쉽게도 목요일이네요\n");
		sb.append("아 벌써 배고파요\n");
		sb.append("abcdefg ABCDEFG\n");
		
		String str = sb.toString();
		
		// 문자 기반 스트림 참조 변수 선언
		FileWriter fw = null;
		
		try {
			
			File folder = new File("/io_test/char");
			if( !folder.exists() ) folder.mkdirs();
			
			fw = new FileWriter("/io_test/char/문자테스트.txt");
			
			// 문자열을 지정된 파일에 출력
			// -> 자동으로 전달한 String을 한 글자씩 출력
			
			fw.write(str);
			
			fw.flush();
			
			System.out.println("출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * 문자 기반 스트림을 이용해 출력하기
	 * - 기반 / 보조 스트림 이용
	 */
	public void fileOutput2() {
		StringBuilder sb = new StringBuilder();
		sb.append("문자 기반 보조 스트림\n");
		sb.append("BufferedWriter를 이용해\n");
		sb.append("출력한 결과 입니다\n");
		
		String str = sb.toString();
		
		// 스트림 참조 변수 선언
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			// 스트림 객체
			fw = new FileWriter("/io_test/char/보조스트림출력.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(str);
			
			bw.flush();
			
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(bw != null) bw.close();
				// 보조 스트림 닫으면 기반 스트림 자동 종료, 자동으로 flush()호출
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * 문자 기반 입력 스트림을 이용해
	 * /io_test/char/문자테스트.txt
	 * 파일 내용을 읽어와 콘솔에 출력
	 */
	public void fileInput1() {
		
		FileReader fr = null;
		
		StringBuilder sb = new StringBuilder();
		
		int value = 0;
		
		try {
			
			fr = new FileReader("/io_test/char/문자테스트.txt");
			
			while(true) {
				value = fr.read();
				
				if(value == -1) break;
				
				sb.append( (char)value );
			}
			
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 문자 기반 스트림을 이용해 입력 받기2
	 * - 기반 + 보조 스트림
	 */
	public void fileInput2() {
		FileReader fr = null;
		
		BufferedReader br = null;
		
		StringBuilder sb = new StringBuilder();
		
		try {
			
			fr = new FileReader("/io_test/char/문자테스트.txt");
			br = new BufferedReader(fr);
			
			while(true) {
				
				String line = br.readLine(); // 한 줄을 읽어옴 없으면 null
				
				if(line == null) break;
				
				sb.append(line + "\n");
			}
			
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}





}
