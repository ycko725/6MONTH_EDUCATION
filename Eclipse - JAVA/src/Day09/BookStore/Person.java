package Day09.BookStore;

public class Person {
	// 변수
	private String name;			// 이름
	private String tel;				// 전화번호
	private String address;			// 주소
	
	// 생성자
	public Person() {
		
	}

	public Person(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public Person(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
