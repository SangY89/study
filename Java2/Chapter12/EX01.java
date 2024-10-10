package Chapter12;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("수행 코드 작성 영역!");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException이 발생될 경우 실행!");
		} catch (Exception e) {
			System.out.println("예외 발생 시 수행 할 코드 작성 영역 ");
		} finally {
			System.out.println("생략 가능");
			System.out.println("예외 여부와 상관없이 무조건 실행");
		}
		
		
		
		// 예외처리
		// 사용자의 잘못된 조작이나, 개발자의 잘못된 코드 작성으로 발생하는 프로그램상의 오류
		// Exception
		// 일반 예외(Checked Exception)
		// - 컴파일 전 발생하는 에러로 검사를 수행할 수 있음
		// 실행 예외(Unchecked Exception)
		// - 실행 시 발생하는 예외이므로 컴파일 전 검사가 불가능
		
		// Runtime Exception 종류
		// 실행예외
		// Arithmetic Exception				// 어떠한 수를 0으로 나누고자 할 때 발생
		// NullPointer Exception 			// Null값을 갖는 참조변수를 사용하고자 할 때 발생
		// ClassCast Exception 				// 허용되지 않는 클래스 타입변환을 진행할 때 발생
		// NegativeAarraySize Exception 	// 배열의 크기가 음수값인 경우 발생
		// OutOfmemory Exception  			// 사용가능한 Heap영역의 Memory가 부족할 때 발생
		// NoClassDefFound Exception 		// 원하는 클래스를 탐색하지 못했을 때 발생
		// ArrayIndexOutOfBounds Exception	// 배열이 갖는 인덱스 범위를 벗어났을 때 발생
		
		
		// try {
		//  	수행코드
		// } catch(예외1) {
		//  	수행코드
		// } catch(예외2) {
		//  	수행코드
		// } finally {
		//  	수행코드
		// }
	}

}
