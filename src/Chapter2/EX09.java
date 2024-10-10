package Chapter2;

public class EX09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형 변환 정리
		int s1 = 10;	// 4byte
		long s2 = s1;	// 8byte	
		short s3;		// 2byte
		s3 = (short)s1;
		
		System.out.println(s2);
		System.out.println(s3);
	}

}
