class Solution {
    public int maxSubArray(int[] nums) {
        int somme = nums[0];
        int maxSomme = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (somme < 0) {
                somme = nums[i];
            } else {
                somme += nums[i];
            }
            if (somme > maxSomme) {
                maxSomme = somme;
            }
        }
        return maxSomme;
    }
}