class arrayStack{
	
	static int stack1[] = new int[11];
	static int stack2[] = new int[11];
	static int top1;
	static int top2;
	
	static void push1(int value){
		//if(top1==stack1.length){
		stack1[++top1] = value;
		//}
	}
	static void push2(int value){
		//if(top2==stack2.length){
		stack2[++top2] = value;
		//}
	}
	
	//System.arraycopy(stack1, 0, stack2, 0, stack1.length);
	
	static void pop1(){
		int value1 = stack1[top1--];
		//stack1[top1] = -1;
		System.out.println("Popped element from stack1 is "+value1);
	}
	static void pop2(){
		int value2 = stack2[top2--];
		//stack2[top2] = -1;
		System.out.println("Popped element from stack2 is "+value2);
	}
	
	public static void main(String... args){
	
	push1(5);
	push2(10);
	push2(15);
	push1(11);
	push2(7);
	push2(40);
	
	pop1();
	pop2();
	}
}