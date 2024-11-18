public class Main {
    public static void main(String[] args) {
        int[] nums = {5,6,9,3};
        System.out.print(nums[0] + ",");
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1]; //add current element with its previous element instead of element after it
            System.out.print(nums[i] + ",");
        }
        //current array(running sum): {5,11,20,23}
        int add = 0;
        System.out.println();
        for(int i = 0; i < nums.length; i++){
            add += nums[i];
        }System.out.print(add);//prints FINAL sum;
    }
}