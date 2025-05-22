public class Activities {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] finish = {2,4,6,7,9,9};

        int[][] activities = new int[6][2];
        for(int i =0;i<6;i++){
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }
        
    }
}
