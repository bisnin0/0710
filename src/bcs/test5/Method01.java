package bcs.test5;

public class Method01 {
	public static void show() {
		System.out.println("i am show method.");
	}//매개변수와 반환값이 모두 없는 경우
	
	public static void main(String[] args) {
		System.out.println("before show call");
		show();
		System.out.println("after show call");
	}

}
