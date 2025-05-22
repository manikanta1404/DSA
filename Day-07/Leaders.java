import java.util.ArrayList;

public class Leaders {
    public static void main(String[] args) {
        int[] values = { 7, 1, 5, 3, 6, 4 };
        ArrayList<Integer> leaders = new ArrayList<>();
        // System.out.println(leaders);
        int Max = Integer.MIN_VALUE;
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] > Max) {
                leaders.add(values[i]);
                Max = values[i];
            }
        }
        System.out.println(leaders);
    }
}
