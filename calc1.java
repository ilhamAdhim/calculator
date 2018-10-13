import java.util.*;

class calc1 {
	
public static void main(String[] args){
		password();
		Inputnumber();
		repeat();
 		}

static void Print1(){
 	System.out.println("input first number");
 	}

static void Print2(){
 	System.out.println("input second number");
 	}


static void iteration(){
	do{
		Tutorial();
		Inputnumber();
		}
		while(repeat());
	}

static void password(){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter special number");

	int number= sc.nextInt();
	if (number == 2833) {
		Name();
	} else {
		System.out.println("Incorrect input");
		System.out.println("Closing...");
		System.exit(0);
		}
 }

static void Name(){
	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter username");
 	String username = sc.nextLine();

 	if (username.equals("Ilham A") ) {
 		Tutorial();
 	} 
 	else {
 		System.out.println("Username is not recognized");
		System.out.println("Closing...");
		System.exit(0);
 	}
 }

static void Tutorial(){
	System.out.println("\t\tWelcome\t\t");
 	System.out.println("\tThis is a calculator app\n");
 	System.out.println("Choose one (use number):\n");

 	System.out.println("1. Sum");
 	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	}

static void Inputnumber(){
		Scanner sc = new Scanner(System.in);
	 	int numbers = sc.nextInt();
	 		switch (numbers) {
	 		case 1: System.out.println("\nYou have chosen Sum");
	 				Sum();
	 		break;
		 	case 2: System.out.println("\nYou have chosen Subtraction");
	 				Subtraction();
	 		break;
	 		case 3: System.out.println("\nYou have chosen Multiplication");
	 				Multiplication();
	 		break;
	 		case 4: System.out.println("\nYou have chosen Division");
	 				Division(); 
	 		break;

	 		default:
	 			System.out.println("Error\n Closing...");
	 			System.exit(0);


		 }
		}
		
 static void Sum(){
 		Scanner sum = new Scanner(System.in);

 		Print1();
 		int x = sum.nextInt();
		Print2();
 		int y = sum.nextInt();
 
 		float res = x + y;
 		System.out.printf("%.2f",res );
 	}
 static void Subtraction(){
 		Scanner sub = new Scanner(System.in);

 		Print1();
 		int x = sub.nextInt();
 		Print2();
 		int y = sub.nextInt();
 	
 		float ressub = x-y;
 		System.out.printf("%.2f",ressub);
 	}
 static void Multiplication(){
 		Scanner mul = new Scanner(System.in);
 		
 		Print1();
 		int x = mul.nextInt();
 		Print2();
 		int y = mul.nextInt();

 		float resmul = x * y;
 		System.out.printf("%.2f",resmul);
	}
 static void Division(){
 		Scanner div = new Scanner(System.in);

 		Print1();
 		int x = div.nextInt();
 		Print2();
 		int y = div.nextInt();

 		float resdiv = x/y;
 		System.out.printf("\n%.2f",resdiv);
 	}
 
static boolean repeat(){
	System.out.println("\nAgain? (Y/N)");
	Scanner sc = new Scanner(System.in);
	
	char rep = sc.nextLine().charAt(0);
	 if ( rep == 'N') {
	 	System.out.println("Closing....");
	 	System.exit(0);
	 }else if (rep == 'Y') {
	 	iteration();
	 } 
	 return true;
	}
}