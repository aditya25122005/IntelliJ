package winter_arc;
import java.util.*;
public class leetcode_71 {
    public static void main(String[] args) {
        String s="/home/user/Documents/../Pictures";
        List<String>res=new ArrayList<>();
        String [] parts=s.split("/");
        for(String part:parts){
            if(part.equals(".") || part.equals("")){
                continue;
            }
            else if(part.equals("..")){
                res.remove(res.size()-1);
            }
            else{
                res.add(part);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String a:res){
            sb.append("/").append(a);
        }
        if(sb.length()==0){
            System.out.println("/");
        }
        else {
            System.out.println(sb);
        }
    }
}
