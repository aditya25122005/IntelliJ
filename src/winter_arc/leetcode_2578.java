package winter_arc;

public class leetcode_2578 {
    public static void main(String[] args) {
        System.out.println(splitNum(4325));
    }
    public static int splitNum(int num) {
        String s=String.valueOf(num);
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                num1.append(arr[i]);
            }
            else{
                num2.append(arr[i]);
            }
        }
        int n1=Integer.parseInt(num1.toString());
        int n2=Integer.parseInt(num2.toString());
        return n1+n2;


    }
}
