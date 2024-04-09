package Day07.Ex06_AutoClose;

import java.io.FileInputStream;

public class TryWithResources {
	
	public static void main(String[] args) {
		
		// try-with-resources 문
		// : try( 자동으로 자원해제할 객체 생성 ) {  }
		// * AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원해제 가능
		try (FileInputStream fis = new FileInputStream("test.txt") ) {
			int read;
			
			while( (read = fis.read()) != -1 ) {
				System.out.print( (char) read );
			}
			
		} catch (Exception e) {
			System.err.println("예외 발생");
		}
		
		
	}
	
	

}
