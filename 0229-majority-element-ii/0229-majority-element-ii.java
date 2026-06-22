class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {

            if (list.size() == 0 || list.get(0) != nums[i] && (list.size() < 2 || list.get(1) != nums[i])) {

                int cnt = 0;

                for (int j = i; j < nums.length; j++) {

                    if (nums[i] == nums[j])
                        cnt++;
                }

            if (cnt > (n / 3))
                list.add(nums[i]);
            }
        }

        return list;
    }
}