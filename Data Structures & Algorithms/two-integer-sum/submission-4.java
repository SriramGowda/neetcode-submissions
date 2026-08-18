

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map =
                new HashMap<>((int) (nums.length / 0.75f) + 1);

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            Integer index = map.get(complement);

            if (index != null) {
                return new int[]{index, i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}