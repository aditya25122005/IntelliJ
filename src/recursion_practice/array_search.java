package recursion_practice;

public class array_search {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,1,6};
        int item=3;
        System.out.println(index(arr,item,0));
    }
    public static int index(int [] arr,int item, int idx){
        if(idx==arr.length){
            return -1;
        }
       if(arr[idx]==item){
           return idx;
       }
       return index(arr,item,idx+1);

    }
}
