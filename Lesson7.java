import java.util.*;
public class Lesson7 {

	 static void a(double a, String s){
	 	System.out.println(a);
	 }


    public static void main(String[] args) {

       /* String sentence = "I love kazak in this lesson"; // сүйлөм
        char[] words = new char[sentence.length()];       // сүйлөмдү массив кылуу үчүн
        int array_length = 0;                             // сүйлөмдөгү пробелдерди санап, сөздөрдүн санын табуу үчүн

        // сүйлөмдү символдорго бөлүү
        for (int i = 0; i < sentence.length(); i++) {
            words[i] = sentence.charAt(i);
            if (words[i] == ' ') { // пробел болсо
                array_length++;
            }
        }

        String[] words_array = new String[array_length + 1]; // сөздөрдү сактоо үчүн массив
        int temp_array = 0;                                  // массив индекси үчүн
        String true_word = "";                               // сөздөрдү түзүү үчүн

        // ар бир символду текшерүү
        for (int i = 0; i < sentence.length(); i++) {
            if (words[i] == ' ') {                // эгер пробел болсо
                words_array[temp_array] = true_word;
                temp_array++;
                true_word = "";
            } else {
                true_word = true_word + words[i]; // символдорду кошуу
            }
        }

        // акыркы сөздү кошуу
        words_array[temp_array] = true_word;

        // бир сөздү өзгөртүү мисалы
        words_array[0] = "aziza";

        // бардык сөздөрдү чыгарып көрөлү
        for (int i = 0; i < words_array.length; i++) {
            System.out.println(words_array[i]);
        }

		boolean checker = true;
        for (int k=0;k<words_array.length; k++) {
        	
			checker = true;
			int i = 0;
			int j = words_array[k].length()-1;

			while(i<j) {
				if (words_array[k].charAt(i) != words_array[k].charAt(j)) {
					checker = false;
					break;
				}
				i++;
				j--;
			}

			if (checker) {
				System.out.println(k+"-polindrom soz eken");
			} 
		}
		if (!checker){
			System.out.println("Kalgandarynda Polindrom jok");
		}*/
		/*Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		String[] greeting = {"Hello", "Privet","Salam", "Mihau"};
		int randomInt = (int) (Math.random() * greeting.length);

		System.out.println(name+" "+greeting[randomInt]);*/
		String [] greeting = {"Hi", "Hello", "Bonjure"}
	
	a(213.45, "san");
    }


}