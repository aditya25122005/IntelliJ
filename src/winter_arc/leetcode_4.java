package winter_arc;

public class leetcode_4 {
    public static void main(String[] args) {
        int [] nums1={1,2};
        int [] nums2={3,4,5};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int [] nums3= new int [n+m];

        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                nums3[k]=nums1[i];
                i++;
            }
            else{
                nums3[k]=nums2[j];
                j++;

            }
            k++;
        }
        while(i<n){
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            nums3[k]=nums2[j];
            j++;
            k++;
        }
        int N=nums3.length;
        if(N%2==0){

            return (double)(nums3[N/2 -1]+nums3[N/2])/2;
        }
        else{
            N=N/2;
            return (double) nums3[N];
        }

    }
}
