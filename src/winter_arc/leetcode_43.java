package winter_arc;

public class leetcode_43 {
    public static void main(String[] args) {
        String num1="12";
        String num2="12";
        System.out.println(multiply(num1,num2));
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";

        int [] ans=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int valueIdx=i+j+1;
                int rem=i+j;
                int product=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');


                product+=ans[valueIdx];
                ans[valueIdx]=product%10;  //last digit of prod.is stored
                ans[rem]+=product/10;

            }
        }
        boolean Preceedingzeroes=true;

        StringBuilder res=new StringBuilder("");
        for(int i=0;i<ans.length;i++){
            int val=ans[i];
            if(val!=0) Preceedingzeroes=false;
            if(!Preceedingzeroes){
                res.append(val);
            }

        }
        return res.toString();

    }
}
