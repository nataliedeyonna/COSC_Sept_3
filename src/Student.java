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


    //Student(String FN, String LN){
    //    this.FN = FN;
    //    this.LN = LN;
   // }
    //How many parameter? 3
        Student(String FN, String LN, int Sid) {
            this.FN = FN;
            this.LN = LN;
            this.Sid = Sid;
        }

    Student(String FN, int Sid, String LN) {
        this.FN = FN;
        this.LN = LN;
        this.Sid = Sid;
    }
        //You can create overloaded constructers by varying 1) the parameter number, 2) order
        public static void main(String[] args) {

    Student s4 = new Student( "Helena", "Payton");
    System.out.println(s4.FN);
    System.out.println(s4.LN);
            System.out.println(s4.Sid);
            System.out.println("---------");

            Student s1;
            s1 = new Student();
            System.out.println(s1);
            System.out.println(s1.FN);


            Student s2;
            s2 = new Student("Tobiloba","Ayodeji", 14141);
            System.out.println(s2.FN);
            System.out.println(s2.LN);

            Student s3;
            String FN = "Miguel";
            String LN = "Gascaortega";
            int Sid = 31415;
            s3 = new Student(FN, LN, Sid);
            System.out.println(s3.FN);
            System.out.println(s3.LN);

    }
}