public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                inter.add(nums2[i]);
            }
        }
        int[] result = new int[inter.size()];
        int i = 0;
        for (Integer num : inter) {
            result[i++] = num;
        }
        return result;
    }
}
