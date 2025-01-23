package lec_28;
public class student {
    String name;
    int age;

    public void intro_yourself(){
        System.out.println("My name is "+ name + " and Age is" +age);
    }
    public void sayhi(String name){
        System.out.println(this.name+ " SAY HEY!! "+ name);
    }
    public static void sayHello(){
        System.out.println("THis is static");
    }
    static {
        System.out.println("Hello I am in static block");
    }
}