import java.rmi.RemoteException;

public class Impl_RI implements RI {

    // This is in place so that the printMsg method will only run after the DoubleAdding method
    int status = 0;

    @Override
    public void DoubleAdding(String[] userArray) throws RemoteException {

        // Setting the inital sum
        double sum = 0;

        // Looping through the elements
        for (int i = 0; i < userArray.length; i++) {

            // Settting a String variable equal to the element
            String num = userArray[i];

            // Making a new double variable that converts the previous String variable to a double
            double realNum = Double.parseDouble(num);

            // Adding the double variable to the sum
            sum += realNum;
        }

        // Making a new String variable that converts the sum into a String
        String realSum = Double.toString(sum);

        // Printing the String variable
        System.out.println("The sum of your numbers is: " + realSum);

        // Changing the status to 1 so that the printMsg method will run
        status = 1;

        // For debugging purposes
        // System.out.println(status);

    }

    @Override
    public String printMsg(String[] userArray) throws RemoteException {

        // Checks to see if the status is 1; if so, the method will run; if not, the method won't run
        if (status == 1) {

            // Pretty much the same thing as the DoubleAdding method
            double sum = 0;

            for (int i = 0; i < userArray.length; i++) {
                String num = userArray[i];
                double realNum = Double.parseDouble(num);
                sum += realNum;
            }

            String realSum = Double.toString(sum);

            // Here, the variable is returned, not printed
            return "The sum of your numbers is: " + realSum;
        }
        else {
            return null;
        }
    }
    
}