package Day10.Ex01_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	
	public static void main(String[] args) {
		
		// 데이터 삽입/삭제 는 LinkedList 가 ArraysList 보다 빠르다
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();	// 시스템의 시간을 ns 단위로 출력
		// ArrayList 데이터 삽입
		for (int i = 0; i < 10000; i++) {
			arrayList.add(0, String.valueOf(i) );
		}
		
		endTime = System.nanoTime();
		
		long arrayListTime = (endTime - startTime);
		System.out.println("ArrayList 데이터 삽입 시간 : " + arrayListTime + "ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i) );
		}
		
		endTime = System.nanoTime();
		
		long linkedListTime = (endTime - startTime);
		System.out.println("LinkedList 데이터 삽입 시간 : " + linkedListTime + "ns");
		
		if( arrayListTime > linkedListTime ) {
			System.out.println("ArrayList 보다 LinkedList 가 데이터 삽입 속도이 더 빠르다");
		} else {
			System.out.println("LinkedList 보다 ArrayList 가 데이터 삽입 속도이 더 빠르다");
		}
		
		
	}

}









