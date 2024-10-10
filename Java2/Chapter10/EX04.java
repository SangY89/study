package Chapter10;

// Getter & Setter(읽기 전용)

import java.util.Scanner;

class SetGet_02 {
	private String name;
	private void setName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력: ");
		this.name = input.next();
		input.close();
	}
	public String getName() {
		return this.name;
	}
	public void nameSetGet() {
		setName();
		System.out.println("이름 출력: " + getName());
	}
}

public class EX04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGet_02 sg = new SetGet_02();
		sg.nameSetGet();
		System.out.println("읽기 전용: " + sg.getName());

	}

}
