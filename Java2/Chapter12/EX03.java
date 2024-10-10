package Chapter12;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일반 예외(ClassNotFoundException)
		
		try {
			Class test = Class.forName("Animal");
		} catch (ClassNotFoundException c){
			System.out.println("예외 발생!");
		} 
	}

}
