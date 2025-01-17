package winter_arc;

public class leetcode_670 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(2736));
    }
    public static int maximumSwap(int num) {


        char[] numArr = Integer.toString(num).toCharArray();
        int n=numArr.length;
        int[] last=new int[10];
        for(int i=0;i<numArr.length;i++){
            last[numArr[i]-'0']=i;
        }

        for(int i=0;i<n;i++){
            for(int digit=9;digit>numArr[i]-'0';digit--){
                if(last[digit]>i){
                    char temp=numArr[i];
                    numArr[i]=numArr[last[digit]];
                    numArr[last[digit]]=temp;
                    return Integer.parseInt(new String(numArr));

                }
            }
        }
        return num;
    }
}
