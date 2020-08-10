public class Impl_RI implements RemoteInterface {
    public void DoubleAdding (String[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            String number = nums[i];
            double realNum = Double.parseDouble(number);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        System.out.println(realSum);
    }

    public String AddingDoubles (String[] nums) {
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            String number = nums[i];
            double realNum = Double.parseDouble(number);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        return realSum;
    }
}