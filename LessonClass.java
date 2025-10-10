
public class LessonClass {
    public static void main(String[] args) {
    	Student st1 = new Student();
    	st1.names = "Bilalbek";
    	st1.okuu();
    	st1.fullINformation();
    	System.out.println("Nurs");
    }
}

class Student {
	String names;
	int ages;
	int course;
	char sex;
	String stNumber;
	String bolum;

	void okuu(){
		System.out.println("Okuu");
	}
	void uktoo(){}
	void gulayt(){}
	void kushayt(){}
	void fullINformation(){
		System.out.println("Name = "+names);
	}

}

class Bilgisayar {
	String[] student_names;
	int amount;

	void coding(){}
	void teaching(){}
	void learning(){}
}