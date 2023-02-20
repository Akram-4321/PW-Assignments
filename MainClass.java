package PatternAssignment;


// 29 Jan 2023 Pattern Programming Assignment

// Que1 : Write a program to print Alphabets A,B,C,D,E,F,G,H using patter programming logic.
class Que1{
	void alphabets() {

		int n = 9;
		for(int i=0; i<n; i++) {
			
			//For A
			for(int j=0; j<n; j++) 
			{
				if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || i==(n-1)/2 || j==(n-1) && i>0) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
		
		    //For B
			for(int j=0; j<n; j++) 
			{
				if(j==0 || i==0&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || j==(n-1)/2&&i>(n-1)/2&&i<(n-1) || i==(n-1)&&j<(n-1)/2) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("");
			
			//For C
			for(int j=0; j<n; j++) 
			{
				if(i==0&&j>0&&j<(n-1) || j==0&&i>0&&i<(n-1) || i==(n-1)&&j>0&&j<(n-1)) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			//For D
			for(int j=0; j<n; j++) 
			{
				if(j==0 || i==0&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<(n-1) || i==(n-1)&&j<(n-1)/2) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("");
			
			//For E
			for(int j=0; j<n; j++) 
			{
				if(i==0&&j<=(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || i==(n-1)&&j<=(n-1)/2 || j==0) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("");
			
			//For F
			for(int j=0; j<n; j++) 
			{
				if(i==0&&j<=(n-1)/2 || i==(n-1)/2&&j<(n-1)/2 || j==0) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
			System.out.print("");
			
			//For G
			for(int j=0; j<n; j++) 
			{
				if(i==0&&j>1&&j<=((n-1)/2)+2 || i==1&&j==1 || j==0&&i>1&&i<(n-1) || i==(n-1)&&j<(n-1)/2&&j>0 ||j==(n-1)/2&&i>(n-1)/2&&i<(n-1) || i==(n-1)/2&&j>(n-1)/2 || j==(n-1)&&i>(n-1)/2) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			//For H
			for(int j=0; j<n; j++) 
			{
				if(j==0 || j==(n-1) || i==(n-1)/2) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}

	}

	}


// Que2 : Write a program to print triangle using star pattern programming logic.
class Que2{
	void traingle() {
		int n = 17;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i+j==(n-1)/2 || j-i==(n-1)/2 || i==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


// Que3 : Write a program to print temple.
class Que3{
	void temple() {
		int n = 14;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(i+j<=(n-1)/2 || j-i>=(n-1)/2 || j==0 || j==(n-1) || i==(n-1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


// Que4 : Write a program to print PW SKILLS using pattern programming logic.
class Que4{
	void PW_SKILLS() {
		int n = 9;
		for(int i = 0; i<n; i++) {
			
			//For P
			for(int j = 0; j<n; j++) {
				if(j==0 || i==0&&j<((n-1)/2)-1 || i==1&&j==3 || j==(n-1)/2&&i<(n-1)/2&&i>1 || i==(n-1)/2&&j<(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("");
			
			//For W
			for(int j = 0; j<n; j++) {
				if(j==0 || j==(n-1) || i+j==(n-1)&&i>=4 || i==j&&i>4)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("             ");
			
			//For S
			for(int j = 0; j<n; j++) {
				if(i==0&&j>1 || j==1&&i==1 || j==0&&i>1&&i<(n-1)/2 || i==(n-1)/2&&j>0&&j<(n-1)-1 || i==5&&j==7 || j==n-1&&i<n-1&&i>((n-1)/2)+1 || i==n-1&&j<n-1&&j>0)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//For K
			for(int j = 0; j<n; j++) {
				if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("");
			
			//For I
			for(int j = 0; j<n; j++) {
				if(i==0 || j==(n-1)/2 || i==(n-1))  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//For L
			for(int j = 0; j<n; j++) {
				if(j==0 || i==n-1)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			
			//For L
			for(int j = 0; j<n; j++) {
				if(j==0 || i==n-1)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//For S
			for(int j = 0; j<n; j++) {
				if(i==0&&j>1 || j==1&&i==1 || j==0&&i>1&&i<(n-1)/2 || i==(n-1)/2&&j>0&&j<(n-1)-1 || i==5&&j==7 || j==n-1&&i<n-1&&i>((n-1)/2)+1 || i==n-1&&j<n-1&&j>0)  {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


// Que5 : Write a program to print your Full Name using pattern programming logic.
class Que5{
	void Full_Name() {
		int n = 9;
		for(int i=0; i<n; i++) {
			
			// For A
			for(int j=0; j<n; j++) {
				if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || i==(n-1)/2 || j==(n-1) && i>0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			    
			 //For K
				for(int j=0; j<n; j++) {
					if(j==0 || i+j == n/2 || i-j==(n-2)/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.print("");
				
				//For R
				for(int j=0; j<n; j++) {
					if(j==0 || i==0 && j<n/2 || j==n/2 && i>0 && i<n/2 || i==(n-1)/2 && j<n/2 || i-j==(n-2)/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					} 
				}
				System.out.print("");
				
				//For A
				for(int j=0; j<n; j++) {
					if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || i==(n-1)/2 || j==(n-1) && i>0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					} 
				}
				System.out.print("  ");
				

				//For M
				for(int j=0; j<n; j++) {
					if(j==0 || j== n-1 || i==j && j<=(n-1)/2 || i+j ==n-1 && i<=(n-1)/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					} 
				}
				System.out.print("               ");
                
				//For A
				for(int j=0; j<n; j++) {
					if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || i==(n-1)/2 || j==(n-1) && i>0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
				//For N
				for(int j=0; j<n; j++) {
					if(j==0 || i==j || j==n-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
				//For S
				for(int j = 0; j<n; j++) {
					if(i==0&&j>1 || j==1&&i==1 || j==0&&i>1&&i<(n-1)/2 || i==(n-1)/2&&j>0&&j<(n-1)-1 || i==5&&j==7 || j==n-1&&i<n-1&&i>((n-1)/2)+1 || i==n-1&&j<n-1&&j>0)  {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.print("  ");
				
				//For A
				for(int j=0; j<n; j++) {
					if(i==0 && j>0 && j<(n-1) || j==0 && i>0 || i==(n-1)/2 || j==(n-1) && i>0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					} 
				}
				System.out.print("  ");
				
				//For R
				for(int j=0; j<n; j++) {
					if(j==0 || i==0 && j<n/2 || j==n/2 && i>0 && i<n/2 || i==(n-1)/2 && j<n/2 || i-j==(n-2)/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					} 
				}
				System.out.print("");
				
				//For I
				for(int j=0; j<n; j++) {
					if(i==0 || i==n-1 || j==(n-1)/2) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					} 
				}
				System.out.println();
			}
		
	}
}


public class MainClass {

	public static void main(String[] args) {
		System.out.println("Que1 : Write a program to print Alphabets A,B,C,D,E,F,G,H using patter programming logic.");
		System.out.println("Answer 1 : ");
		Que1 obj1 = new Que1();
		obj1.alphabets();
		
		System.out.println();
		
		System.out.println("Que2 : Write a program to print triangle using star pattern programming logic.");
		System.out.println("Answer 2 : ");
		Que2 obj2 = new Que2();
		obj2.traingle();
		
		System.out.println("Que3 : Write a program to print temple.");
		System.out.println("Answer 3 : ");
		Que3 obj3 = new Que3();
		obj3.temple();
		
		System.out.println();
		
		System.out.println("Que4 : Write a program to print PW SKILLS using pattern programming logic.");
		System.out.println("Answer 4 : ");
		Que4 obj4 = new Que4();
		obj4.PW_SKILLS();
		
		System.out.println();
		
		System.out.println("Que5 : Write a program to print your Full Name using pattern programming logic.");
		System.out.println("Answer 5 : ");
		Que5 obj5 = new Que5();
		obj5.Full_Name();
	}
}
