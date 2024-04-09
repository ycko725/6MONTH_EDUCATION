package Day04.Class;

// classification(분류)  --> class
public class Pikachu {
	// 클래스			: 객체를 정의하는 설계도
	// 멤버			: 변수, 메소드
	
	// 변수
	public int energy;
	public String type;
	
	// 기본 생성자
	public Pikachu() {
		this(100, "전기");
//		this.energy = 100;
//		this.type = "전기";
	}
	
	// 생성자 자동완성 
	// alt + shift + S -> O
	// 매개변수가 있는 생성자
	// 메소드(생성자) 오버로딩	- "메소드 중복정의"
	public Pikachu(int energy, String type) {
//		// this : 객체 자기 자신을 가리키는 레퍼런스
		this.energy = energy;
		this.type = type;
	}

	// 메소드
	// 접근지정자 반환타입 메소드명( 매개변수 ) {  } 
	public String aAttack() {
		return "십만볼트";
	}
	

	public String bAttack() {
		return "전광석화";
	}
}











