package Day10.Ex03_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class UserList {
	
	public static void main(String[] args) {
		
		LinkedList<User> userList = new LinkedList<User>();
		
		// u1.age - u2.age  : 20 - 30
		// u1.age - u3.age	: 20 - 10
		// u1.age - u4.age	: 20 - 30
		// u1.age - u5.age	: 20 - 20
		// u1.age - u6.age	: 20 - 30
		// u1.age - u7.age	: 20 - 30
		// u1.age - u8.age	: 20 - 10
		// u1.age - u9.age	: 20 - 10
		// u1.age - u10.age	: 20 - 20
		User u1 = new User("abc1004", "홍휴먼", 20);
		User u2 = new User("bac1004", "박휴먼", 30);
		User u3 = new User("cab1004", "유휴먼", 10);
		User u4 = new User("cca1004", "김휴먼", 30);
		User u5 = new User("ffa1004", "장휴먼", 20);
		User u6 = new User("fea1004", "김교육", 30);
		User u7 = new User("fka1004", "정휴먼", 30);
		User u8 = new User("ead1004", "권휴먼", 10);
		User u9 = new User("pce1004", "고휴먼", 10);
		User u10 = new User("koe1004", "송휴먼", 20);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		userList.add(u9);
		userList.add(u10);
		
		// Collections.sort( 리스트, Comparator 구현객체 );
		// - 오버라이딩한 compare 메소드의 기준에 따라서 정렬된다
		Collections.sort(userList, new User());
		
		for (User user : userList) {
			System.out.print("id : " + user.id);
			System.out.print(", name : " + user.name);
			System.out.print(", age :" + user.age);
			System.out.println();
		}
		
	}

}










