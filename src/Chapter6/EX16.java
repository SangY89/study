package Chapter6;

public class EX16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제2) int[][] arrayInt9 = 
		// {{10}, {20,30}, {40,50,60}, {70,80,90,100}}
		// 반복문 사용하여 값 꺼내어 출력
		int[][] arrayInt9 = {{10}, {20,30}, {40,50,60}, {70,80,90,100}};
		
		for(int i = 0; i < arrayInt9.length; i++) { 
				for(int j = 0; j < arrayInt9[i].length; j++) {
					System.out.println(arrayInt9[i][j]);
				}
		}
		
	}
}
