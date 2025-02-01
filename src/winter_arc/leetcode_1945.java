package winter_arc;

public class leetcode_1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }
    public static int getLucky(String s, int k) {
        int n=s.length();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i)-'a'+1;
        }
        int sum=0;

        for(int i=0;i<arr.length;i++){
            while(arr[i] !=0){
                int rem=arr[i] %10;
                sum+=rem;
                arr[i]/=10;
            }

        }
        if(k==1){
            return sum;
        }

        for(int i=1;i<k;i++){
            int val=sum;
            sum=0;
            while(val!=0){
                int last=val%10;
                sum+=last;
                val/=10;

            }
        }
        return sum;

    }
}
