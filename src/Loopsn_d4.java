
public class Loopsn_d4 {
	public static void main(String[] args) {
		
		
		//1 to 10:
		//Loops
		//1. while loop
		int i = 1;  //Initialization part
		while(i<=10) {  //Conditional part  /While loop start from here
			System.out.println(i);//1
			i++;  //Incremental/ Decremental part
		}
		
		System.out.println("-------");
		
		//For Loop:
		//1 to 10;
		for (int k=1; k<=10; k++) {
			System.out.println(k);//1
		}
		
//For( ; ;  ) {
//	System.out.println("hello");
		
//}
		System.out.println("-----");
		//Even numbers: 0 2 4 6 8 10
		for (int even=0; even<=10; even=even+2){
			System.out.println(even); //0 2 4 6 8 10
		}
		
	//odd numbers: 1 3 5 7 9
		for (int odd=1; odd<10; odd=odd+2) {
			System.out.println(odd); //1 3 5 7 9
			
			
		}
		System.out.println("-----");
		//see video till 30 min
		for (int p=1; p<=10;) {
			System.out.println(p);
			//p++;
			p=p+1;
		}
		System.out.println("......");
		
		//
		for (int h=1; h<=100; h++) {
			System.out.println(h);
			if(h % 5 ==0);{
				System.out.println("Hiii");
			}
				
		}
		
		//3- Do While Loop
		int n=1;
		do{
			System.out.println("n");
			n++;
		}
		while(n<=10);
		}
		
	}


