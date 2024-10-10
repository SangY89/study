package Chapter6;

public class EX19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldArrayStr = {"C", "JAVA", "PYTHON"};
		String[] newArrayStr = new String[5];
		
		System.arraycopy(oldArrayStr, 0, newArrayStr, 0, oldArrayStr.length);
		
		for (String str : newArrayStr) {
			System.out.println(str);
		}
	}

}
