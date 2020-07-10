package bcs.test5;

public class Method03 {

	public static int dosomething() {
		int result;
		result = 10*100;
		return result;
		
	}//매개변수는 없고 반환값이 있는 경우
	public static void main(String[] args) {
		int x;
		x=dosomething();
		System.out.println("x: "+x);
	}

}
