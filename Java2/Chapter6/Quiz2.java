package Chapter6;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래의 그림과 같이 데이터를 저장하는 2차원 배열을 구성하세요.
		// 콘솔에 아래 이미지와 같이 값을 꺼내와 출력하세요.
		int [][] arrayInt1 = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
		System.out.print("저장 값 출력");
		for(int i = 0; i < arrayInt1.length; i++) { 
			for(int j = 0; j < arrayInt1[i].length; j++) {
				if(j % 5 == 0) {
					System.out.println();
				}
				System.out.print(arrayInt1[i][j] + "\t");
			}
		}
	}
}

