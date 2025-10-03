public class Lesson_array {
	public static void main(String arg []){
		/*int [] maash = new int [5];

		maash[0] = 300000;
		maash[1] = 100000;
		maash[2] = 150000;
		maash[3] = 200000;
		maash[4] = 400000;

		String [] names =  {"Aynazik", "Bilal", "Gulbayra", "Zuura", "Aigerim"};

		for (int i=0;i<maash.length;i++) {
			System.out.println(names[i]+"'s salery = "+maash[i]);
		}*/

		String name = "Nurusltan";
		char [] symbol = new char [name.length()];
		for (int i=0;i<name.length();i++) {
			if (name.charAt(i) == 'u') {
				continue;
			}
			symbol[i] = name.charAt(i);
			System.out.print(symbol[i]);
		}

		/*for (int i=0; i<name.length();i++ ) {
			if (symbol[i] == 'u') {
				symbol[i] = ' ';
			}
		}*/
/*
		for (int i=0;i<name.length(); i++) {
			System.out.print(symbol[i]);
		}*/
	}
}