package java22sept;
import java.util.*;

public class NoOfSeniorCitizen {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));


    }
    public static int countSeniors(String[] details) {
        int ans=0;
        for(int i=0;i<details.length;i++){
            int x1=details[i].charAt(11)-48;
            int x2=details[i].charAt(12)-48;
            if(x1>6){
                ans++;
            }
            else if(x1==6 && x2>0 ){
                ans++;
            }

        }
        return ans;

    }

}
