
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int population = 50000;
		double infected = 2000;
		double recovered = 250;
		double susceptable = 47750;
		double transmissionRate = 0.00005;
		double recoveryRate = 0.06;
		int day = 0;
		
		while (day < 190) {
			
			double dSdT = (transmissionRate * -1)*(susceptable*infected);
			//System.out.println("dSdT= " + dSdT);
			
			double dIdT = (transmissionRate*(susceptable*infected)) - (recoveryRate*infected);
			//System.out.println("dIdT= " + dIdT);
			
			double dRdT = recoveryRate*infected;
			//System.out.println("dRdT= " + dRdT);
			
			susceptable = susceptable + dSdT;
			infected = infected + dIdT;
			recovered = recovered + dRdT;
			
			
			
			System.out.println("Day " + day + " new Values \nSusceptable= " + (Math.round(susceptable)*100)/100 + "\nInfected= " + (Math.round(infected)*100)/100 + "\nRecovered= " + (Math.round(recovered)*100)/100 + "\n");
				
			day++;
		}


	}

}
