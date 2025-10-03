public class Lesson5 {
	public static void main(String arg []){
/*	int factorial = 5;
	int ans = 1;

	for(int i=1;i<=factorial; i++){
		ans = ans*i;
	}

	System.out.println("In for loop = "+ans);

	// This code for while example
	// Akylcan comptu karayli ee

	int answerWhile = 1;
	int i = 5;
	while (i>=1){ // Akylcaaaan
		answerWhile = answerWhile*i;

		i--;
		System.out.println("In answerWhile = "+answerWhile+" i = "+i);
	}
	System.out.println("In while loop = "+answerWhile);


	int a = 100;
	for (int i=0;i<=a;i++) {
		if (i%2 != 0) {
			System.out.println(i);
		}
	}

	int b = 100;
	for (int i=1;i<=b;i=i+2) {
			System.out.println(i);
		}*/


		/*int a = 5;
		int b = 5;
		for (int i=0; i<a ; i++ ) {
			for (int j=0; j<b; j++ ) {
				System.out.print(" i = "+i+" "+" j = "+j);
			}
			System.out.println();
		}
	

	for (int i=0; i<10; i++) {
		for (int j = 0; j<=10; j++) {
			System.out.println(i+" * "+j+" = "+(i*j));
		}
		System.out.println();
	}

	for (int i=0; i<10; i++) {
		for (int j = 0; j<=10; j++) {
			System.out.print("*");
		}
		System.out.println();
	}



	int joop = 0;
	int birinchi = 0;
	int ekinchi = 1;
	for (int i=0; i<50; i++) {
		joop = 0;
		joop = birinchi + ekinchi;
		birinchi = ekinchi;
		ekinchi = joop;
		System.out.println(joop);
	}*/



	/*int number = 1000;
	for (int i=0;i<number; i++) {
		System.out.println(i);
		if (i==47) {
			break;
		}
	}*/


	int number = 50;
	for (int i=0;i<number; i++) {
		
		if (i==47) {
			//continue;
			return;
			//break;
		}
		System.out.println(i);
	}


	System.out.println("Hi Bilgisayar");
	}
}