package winter_arc;

public class leetcode_2079 {
    public static void main(String[] args) {
        int [] plants={2,2,3,3};
        int capacity=5;
    }
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int capa=capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]<capa){
                steps++;
                capa-=plants[i];
            }
            else if(capa<plants[i]){
                steps+=(2*(i+1))-1;
                capa=capacity;
                capa-=plants[i];

            }
            else if(capa==plants[i]){
                steps+=1;
                capa-=plants[i];
            }
        }
        return steps;
    }
}
