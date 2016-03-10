package prob3;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "모든 프로그램은  자바언어로 개발 될 수 있습니다.";

		int idx = str.indexOf("자바");	// 없으면 -1리턴
		
		if(idx != -1){
			str = str.replaceAll("자바", "Java");
			System.out.println(str);
		}
		
	}

}
