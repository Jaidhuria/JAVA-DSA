class duplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 2, 5, 6, 3};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate element found: " + nums[i]);
                }
            }
        }
    }
}
