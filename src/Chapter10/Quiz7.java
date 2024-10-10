package Chapter10;

import java.util.Scanner;

class UDgame {
	int num;
	int Scnt;
	public void GameStart(int num) {
		Scanner input = new Scanner(System.in);
		
		if(num == 1) {
			int ran = (int)(Math.random() * (100 - 0 + 1));
			int cnt = 0;
			
			System.out.println("=== Game Start ===");
			while(true) {
				System.out.print("정답 입력: ");
				int ans = input.nextInt();
				if(ans > ran) {
					System.out.println("DOWN!");
					cnt += 1;
				} 
				else if( ans < ran) {
					System.out.println("UP!");
					cnt += 1;
				} 
				else {
					System.out.println("GOOD!");
					System.out.println();
					System.out.println("<정답을 입력하셨습니다.>");
					System.out.println("<정답입력 횟수: " + cnt + "회 입니다.>");
					Scnt = cnt;
					break;
				} continue;
			}
		} 
		else if(num == 2) {
			
		}
		else if(num == 3){
			System.out.println("게임을 종료합니다.");
		} 

	}
	public void Record(int num){
		if(num == 2) {
			System.out.println("이전 기록은 " + Scnt + "점 입니다.");
		}
	}
}

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UP & Down Game 프로그램 제작
		// 기능 Random값, 시도횟수 저장, Random값 발생 / 이전 기록 확인
		Scanner input = new Scanner(System.in);
		UDgame ud = new UDgame();
		
		System.out.print("====== UP & DOWN GAME ======");
		System.out.println();
		System.out.println("1. 게임 시작");
		System.out.println("2. 기록 확인");
		System.out.println("3. 게임 종료");
		System.out.print("번호를 선택하세요: ");
		int num = input.nextInt();
		ud.GameStart(num);
		ud.Record(num);
		
	}

}
