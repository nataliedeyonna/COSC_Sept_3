//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {

        String FN;
        String LN;
        int Sid;
Student(){
    this.FN = "No first name";
    this.LN = "No last name";
    this.Sid = 0;
}

    //How many parameter? 3
        Student(String FN, String LN, int Sid) {
            this.FN = FN;
            this.LN = LN;
            this.Sid = Sid;
        }
        public static void main(String[] args) {
            Student s1;
            s1 = new Student();
            System.out.println(s1);
            System.out.println(s1.FN);

    }
}