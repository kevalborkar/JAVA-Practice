
public class Program {

	public static void main(String[] args) {
		
		Student[] st = new Student[5];
		
		st[0] = new Student("Faizaan",1,48.2);
		st[1] = new Student("Kasam",2,49.2);
		st[2] = new Student("Keval",3,49.9);
		st[3] = new Student("Akshay",4,47.2);
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

}
