package Day06.Ex01_Shape;


// Shape 클래스를 구현하시오.
// : Shape 클래스를 상속받아 추상메소드를 오버라이딩 하시오.
public class Triangle extends Shape {
	
	double width, hegith;
	
	// 기본생성자 - super() 호출
	public Triangle() {
		super();
	}
	
	// 매개변수가 있는 생성자
	public Triangle(double width, double hegith) {
		this.width = width;
		this.hegith = hegith;
	}

	@Override
	double area() {
		// (가로) x (세로) / 2
		return width * hegith / 2;
	}

	@Override
	double round() {
		// (정삼각형) : (한 변의 길이) * 3
		return width * 3;
	}

	// toString()
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", hegith=" + hegith + "]";
	}
	
}





