package Chapter13;

// 1. 호출
import java.util.ArrayList;

public class EX01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. 객체 생성
		ArrayList list = new ArrayList();
		
		// 3. 메서드
		list.add(123);
		list.add(456);
		list.add(789);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.size());
		
		System.out.println(list.get(3));
		
		
		
		// Collection Framework
		// 데이터 그룹을 저장, 조작, 처리하기 위한 표준화된 구조 및 인터페이스를 제공하는 클래스들의 집합
		// List 계열 - 구현 클래스 (ArrayList, Vector, LinkedList)
		// 순서를 유지하며 값을 저장 중복 저장이 가능
		// Set 계열 - 구현 클래스 (HashSet, TreeSet)
		// 순서를 유지하지 않고 값을 저장 중복 저장이 불가능
		// Map 계열 - 구현 클래스 (HashMap, Hashtable, TreeMap, Properties)
		// 키와 값을 쌍으로 저장 중복 키 사용은 불가능
		
		// ArrayList (Index 관리O, 중복 객체X)
		// 데이터 그룹을 저장, 조작, 처리하기 위한 표준화된 구조 및 인터페이스를 제공하는 클래스들의 집합
		// ArrayList의 초기 용량은 10으로 고정되어있으며, 지정이 가능
		// 지정된 용량을 초과하는 경우 자동으로 확장됨(배열과 차이점)
		// 객체 제거 시 객체들의 Index조정작업이 진행됨 (Shift)
	}

}
