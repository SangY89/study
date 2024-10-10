package Chapter11;

class ParentClass {
	public String parent;
	public void ParentRun() {
		System.out.println("Parents Class Run!");
	}
}

class ChildClass extends ParentClass {
	public String child;
	public void ChildRun() {
		System.out.println("Child Class Run!");
	}
}

public class EX13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parent = new ChildClass();
		parent.parent = "부모클래스";
		System.out.println(parent.parent);
		parent.ParentRun();
		System.out.println();
//		parent.child = "자식클래스";
//		parent.ChildRun();
		
		// 업캐스팅이 된 상태에선 강제로 형변환을 통해 다운캐스팅한다.
		ChildClass child = (ChildClass)parent;
		child.child = "자식클래스";
		System.out.println(child.child);
		child.ChildRun();
		
	}

}
