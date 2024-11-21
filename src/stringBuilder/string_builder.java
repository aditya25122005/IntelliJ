package stringBuilder;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.capacity());

        //add
//        sb.append("jjjjj");
//        sb.append(true);
//        sb.append(7);
//        sb.append('a');
//        System.out.println(sb.getClass());
//        System.out.println(sb);
//        System.out.println(sb.charAt(3));
//        System.out.println(sb.indexOf("jjjj"));
//        System.out.println(sb.reverse());
//        System.out.println(sb.delete(2,5));
//        String s=sb.toString();
//        System.out.println(s);


String_demo();
//        StringBuilder_demo();
    }
    public static void String_demo(){
        String s="";
        for(int i=0;i<100000;i++){
            s=s+i;
        }
        System.out.println(s);
    }
    public static void StringBuilder_demo(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<100000;i++){
            sb=sb.append(i);
        }
        System.out.println(sb);

    }
}
