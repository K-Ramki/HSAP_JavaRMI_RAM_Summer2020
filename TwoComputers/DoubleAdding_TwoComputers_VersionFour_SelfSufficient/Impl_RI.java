import java.rmi.RemoteException;

public class Impl_RI implements RI {

    @Override
    public void DoubleAdding(String[] alpha) throws RemoteException {
        double sum = 0;

        for (int i = 0; i < alpha.length; i++) {
            String number = alpha[i];
            double realNum = Double.parseDouble(number);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        System.out.println("Your sum is " + realSum);

    }

    @Override
    public String printSum(String[] omega) throws RemoteException {
        double sum = 0;

        for (int i = 0; i < omega.length; i++) {
            String number = omega[i];
            double realNum = Double.parseDouble(number);
            sum += realNum;
        }

        String realSum = Double.toString(sum);
        return "Your sum is " + realSum;
    }
    
}