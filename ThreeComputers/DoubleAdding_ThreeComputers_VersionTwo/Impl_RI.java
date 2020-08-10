import java.rmi.RemoteException;

public class Impl_RI implements RI {

    int status = 0;

    @Override
    public void DoubleAdding(String[] userArray) throws RemoteException {
        double sum = 0;

        for (int i = 0; i < userArray.length; i++) {
            String num = userArray[i];
            double realNum = Double.parseDouble(num);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        System.out.println("The sum of your numbers is: " + realSum);
        status = 1;
        // System.out.println(status);

    }

    @Override
    public String printSum(String[] userArray) throws RemoteException {
        if (status == 1) {
            double sum = 0;

            for (int i = 0; i < userArray.length; i++) {
                String num = userArray[i];
                double realNum = Double.parseDouble(num);
                sum += realNum;
            }

            String realSum = Double.toString(sum);
            return "The sum of your numbers is: " + realSum;
        }
        else {
            return null;
        }
    }
    
}