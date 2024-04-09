package Day01;

public class Ex12_FloatDouble {
	public static void main(String[] args) {
		//실수 타입 변수 선언
		double var1 = 3.14;
		float var2 = 3.14F; //float 타입의 리터럴 : 실수F
		
		//실수형 정밀도
		double var3 = 0.123456789123456789D; //double 타입의 리터럴 근데 생략 가능
		float var4 = 0.1234567898123456789F;
		
		//원주율
		double PI = Math.PI;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("원주율 PI : " + PI);

	}
}
