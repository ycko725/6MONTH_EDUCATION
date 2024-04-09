package Day10.Ex01_Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 	List 인터페이스
 	- 객체 추가
 	add(E)				: 맨 끝에 추가
 	add(index, E) 		: index 에 추가
 	add(index, E)		: index 의 객체를 E 로 변경
 	
 	- 객체 검색
 	get(index)			: index 에 있는 객체를 반환
 	contains(Object)	: 객체가 컬렉션에 포함되어있는지 확인(true/false)
 	isEmpty()			: 컬렉션이 비어있는지 확인
 	size()				: 저장된 요소의 개수 반환
 	
 	- 객체 삭제
 	remove(index)		: index 에 있는 객체를 삭제
 	remove(Object)		: 객체를 삭제
 	clear()				: 모든 요소 삭제
*/
public class VectorEx {
	
	public static void main(String[] args) {
		// 컬렉션 객체 생성
		// 컬렉션타입<요소타입> 변수명 = new 클래스명<요소타입>();
		// 벡터 객체 생성
		Vector<String> vector = new Vector<String>(10);
		
		// 요소 추가
		vector.add("토피넛 라떼");
		vector.add("커피우유");
		vector.add("아메리카노");
		vector.add("헤이즐넛");
		
		// 개수, 용량 확인
		System.out.println("개수 : " + vector.size());
		// vector 는 내부적으로 배열로 요소를 관리한다
		// - 기본 배열 요소의 개수를 10로 생성하고,
		//   배열이 꽉찰 때마다 2배씩 용량을 증가시킨다
		System.out.println("용량 : " + vector.capacity());
		System.out.println();
		
		// 검색
		// 반복 방법 1
		System.out.println(">>반복 1");
		for (int i = 0; i < vector.size(); i++) {
			String item = vector.get(i);
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 반복 방법 2
		System.out.println(">>반복 2");
		for (String item : vector) {
			System.out.println("메뉴 이름 : " + item);
		}
		System.out.println();
		
		// 삭제
		// 삭제 할 때, index 는 앞으로 한 칸씩 당겨짐
									// 0		1		2		3
									// 토피넛라떼	커피우유	아메리카노	헤이즐넛
		vector.remove(0);			// 커피우유	아메리카노	헤이즐넛
		vector.remove(1);			// 커피우유	헤이즐넛
		vector.remove("커피우유");		// 헤이즐넛
		vector.remove("헤이즐넛");		// empty(요소 없음)
		
		if( !vector.isEmpty() ) {
			for (String item : vector) {
				System.out.println("메뉴 이름 : " + item);
			}
		}
		else {
			System.out.println("메뉴가 없습니다");
		}
		
		Scanner sc = new Scanner(System.in);
		
		// Vector 는 List 인터페이스를 구현한 클래스
		List<String> newMenuList = new Vector<String>();
		
		System.out.println("메뉴 추가하기 (종료:0)");
		do {
			System.out.print("추가할 메뉴 이름 : ");
			String menu = sc.nextLine();
			
			if( menu.equals("0") )
				break;
			
			newMenuList.add(menu);
		} while (true);
		
		// 반복 방법 3
		// Iterator 를 이용한 반복
		// 해당 리스트 컬렉션으로부터 Iterator 객체를 가져옴
		// Iterator 메소드
		// hasNext() 	: 다음 요소의 존재여부를 반환
		// next()		: 다음 요소를 반환
		System.out.println(">>반복");
		// 컬렉션객체.iterator() : 해당 컬렉션에 대한 iterator 객체를 반환
		Iterator<String> it = newMenuList.iterator();
		
		System.out.print("새로 추가된 메뉴 : ");
		while( it.hasNext() ) {
			String item = it.next();
			System.out.print(item);
			
			if( it.hasNext() ) {
				System.out.print(", ");
			} else {
				System.out.println();
			}
		}
		
		
	}

}




















