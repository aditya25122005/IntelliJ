package OOPS;

public class person_client {
    public static void main(String[] args) {
        person p1=new person("Aditya",19);
        System.out.println(p1.name +" "+p1.age);
        person p=new person();
        System.out.println(p.age);
        System.out.println(p.name);
    }


}
