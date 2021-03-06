package prob4;

public class MyStack<E> implements Stack<E> {
	private E[] buffer;
	private int capacity;
	private int top;

	public MyStack(int capacity) throws MyStackException {
		if (capacity <= 0) {
			throw new MyStackException("init stack capacity > 0");
		}

		this.capacity = capacity;
		this.top = 0;
		buffer = (E[])(new Object[capacity]);
	}

	public void resizeBuffer() {
		E[] tmp = (E[])(new Object[capacity]);

		// tmp 배열에 옮겨 놓고 다시 버퍼에 덮어쓰기
		for (int i = 0; i < buffer.length; i++) {
			tmp[i] = buffer[i];
		}
		
//		선생님
//		String[] tempBuffer = new String[ capacity ]; 
// 		if( buffer != null ) { 
// 			System.arraycopy( buffer, 0, tempBuffer, 0, top ); 
// 		} 
//		buffer = tempBuffer; 

		
		buffer = tmp;
	}

	@Override
	public void push(E str){
		if (capacity == top) {
			capacity *= 2;
			resizeBuffer();
		} 
		buffer[top++] = str;
	
//		System.out.println("top:" + top + "str:" + str);
	}

	@Override
	public E pop(){
		if (top <= 0) {
			return null;
		}

		return buffer[--top];
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}

}
