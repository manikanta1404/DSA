import java.util.*;

class MergeTwoArray {

    static double median(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int s = m + n;

        int[] nums3 = new int[s];

        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            nums3[m + i] = nums2[i];
        }

        Arrays.sort(nums3);
        System.out.println(Arrays.toString(nums3));

        if (s % 2 == 1) {
            return nums3[s / 2];
        } else {
            return (nums3[s / 2 - 1] + nums3[s / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println(median(nums1, nums2));
    }
}
