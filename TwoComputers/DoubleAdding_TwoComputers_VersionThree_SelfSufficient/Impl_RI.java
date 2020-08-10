import java.rmi.RemoteException;

public class Impl_RI implements RI {

	@Override
	public void DoubleAdding(String[] alpha, String[] beta) throws RemoteException {
		double sum_alpha = 0;
        double sum_beta = 0;
        
        for (int i = 0; i < alpha.length; i++) {
            String number_alpha = alpha[i];
			double realNum_alpha = Double.parseDouble(number_alpha);
			sum_alpha += realNum_alpha;
		}
		
		for (int j = 0; j < beta.length; j++) {
			String number_beta = beta[j];
			double realNum_beta = Double.parseDouble(number_beta);
			sum_beta += realNum_beta;
		}

		double superSum = sum_alpha + sum_beta;
		String realSum = Double.toString(superSum);
		System.out.println("Your sum is: " + realSum);
	}

	@Override
	public String printSum(String[] alpha, String[] beta) throws RemoteException {
		double sum_alpha = 0;
        double sum_beta = 0;
        
        for (int i = 0; i < alpha.length; i++) {
            String number_alpha = alpha[i];
			double realNum_alpha = Double.parseDouble(number_alpha);
			sum_alpha += realNum_alpha;
		}
		
		for (int j = 0; j < beta.length; j++) {
			String number_beta = beta[j];
			double realNum_beta = Double.parseDouble(number_beta);
			sum_beta += realNum_beta;
		}

		double superSum = sum_alpha + sum_beta;
		String realSum = Double.toString(superSum);
		return "Your sum is: " + realSum;
	}
    
}