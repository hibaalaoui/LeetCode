class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // évite overflow

            if (nums[mid] == target) {
                return mid; // trouvé
            } else if (nums[mid] < target) {
                left = mid + 1; // chercher à droite
            } else {
                right = mid - 1; // chercher à gauche
            }
        }

        return -1; // pas trouvé
    }
}
