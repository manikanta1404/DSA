
class Array {
    public static void main(String[] args) {
        System.out.println("mani  Day -06 ( DSA )");

        //printing 2d-array using nested loop


        int[][] arr = new int[4][3];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                count++;
                arr[i][j] = count;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}