package Chapter1;

public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서식 문자
		// 서식문자 출력
		// 현재 무엇을 하는 지 알 수 있도록 인자를 출력
		// System.out.printf("서식문자", 인자);
		System.out.printf("이름 : %s\n", "펭수");
		System.out.printf("나이 : %d\n", 20);
		System.out.printf("학점 : %c\n", 'A');
		System.out.printf("성적 평균: %.1f\n", 99.9);
		System.out.printf("내국인 : %b\n", false);
		
		System.out.printf("취미 : %s / 특기 : %s\n", "노래", "방송");
	}

}
