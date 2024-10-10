package Chapter10;

// Getter & Setter(공개형)

import java.util.Scanner;

class SetGet_03 {
	private String name;
	public void setName() {
		Scanner input = new Scanner(System.in);
		System.out.print("이름 입력: ");
		this.name = input.next();
		input.close();
	}
	public String getName() {
		return this.name;
	}
}

public class EX05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGet_03 sg = new SetGet_03();
		sg.setName();
		System.out.println("공개형: " + sg.getName());
	}
}
