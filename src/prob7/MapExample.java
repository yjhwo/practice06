package prob7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put( "blue", 85 );
		map.put( "red", 96 );
		map.put( "black", 92 );
		
		String name = null;   // 최고 점수를 받은 아이디 저장
		int maxScore = 0;  // 최고 점수
		int totalScore = 0;   // 점수 합계
		
		// ------------------
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String s = it.next();
			
			if(map.get(s)> maxScore){
				maxScore = map.get(s);
				name = s;
			}
			totalScore += map.get(s);
		}
		
		// 선생님
//		Set<String> set = map.keySet();
//		for (String s : set) {
//			int score = map.get(s);
//			if (score > maxScore) {
//				maxScore = score;
//				name = s;
//			}
//
//			totalScore += score;
//		}

		
		// ------------------ 출력
		System.out.println("평균점수:"+ (totalScore/map.size()));
		System.out.println("최고점수:"+ maxScore);
		System.out.println("최고 점수를 받은 아이디:"+name);
		
	}

}
