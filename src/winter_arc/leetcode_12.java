package winter_arc;

public class leetcode_12 {
    public static void main(String[] args) {

        System.out.println(intToRoman(225));
    }
    public static  String intToRoman(int num) {
        int [] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String [] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            if(num==0){
                break;
            }
            while(num>=values[i]){
                sb.append(symbol[i]);
                num-=values[i];
            }
        }
        return sb.toString();
    }
}
