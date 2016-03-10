package prob6;

import java.util.ArrayList;

public class BoardDao {
	private ArrayList<Board> list = new ArrayList<Board>(3);
	
	public BoardDao(){

		for(int i=1; i<=3; i++){
			Board b = new Board();
			b.setTitle("제목"+i);
			b.setContent("내용"+i);
			list.add(b);
		}
	}
	
	public ArrayList<Board> getBoardList(){
		return list;
	}
	
}
