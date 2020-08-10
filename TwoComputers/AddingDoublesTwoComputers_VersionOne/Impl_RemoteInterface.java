public class Impl_RemoteInterface implements RemoteInterface {
    public double DoubleAdding (double[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }
}