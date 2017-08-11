class HomeTest1{
	public static void main(String[] args){
	
	int i = 1234567890; // -2147483648 to 2147483647
	float f = i;
	System.out.println(i);
	System.out.println(2147483647 - i);
	System.out.println((int)f);
	System.out.println(f);
	System.out.println(i - (int)f);	
	}
}	