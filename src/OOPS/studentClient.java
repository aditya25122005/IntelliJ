package OOPS;
public class studentClient {
    public static void main(String[] args) {

        student s=new student();
        student s2=new student();
        s.intro_yourself();
        s.name="Aditya";
        s.age=19;
        s.intro_yourself();
        student s1=new student();
        s1.name="Adi";
        s1.age=20;
        s1.intro_yourself();
        student s3=new student();
        s3.name="kamlesh";

        s3.sayhi("ramesh");
        student.sayHello();

    }
}
