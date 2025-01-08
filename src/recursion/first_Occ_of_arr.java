package recursion;

public class first_Occ_of_arr {
    public static void main(String[] args) {

        int [] arr={2,3,10000,3,4000,3,7};
        int item=4;
        System.out.println(index(arr,item,0));
    }
    public static int index(int [] arr, int item,int i){
        if(i>=arr.length)return -1;
        if(arr[i]==item){
            return i;
        }

            return (index(arr, item, i + 1));


    }
}
