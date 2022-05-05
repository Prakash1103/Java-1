package week1.day1;

public class TwoWheeler {
	int noOfWheels= 2;
	short noOfMirrors=2;
	long chassisNumber=157667796677l;
	boolean isPunchured=true;
	String bikeName= "Pulsar";
	double runningKM=2000.1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TwoWheeler object= new TwoWheeler();
     System.out.println("noOfWheels"+object.noOfWheels);
     System.out.println(object.noOfMirrors);
     System.out.println(object.chassisNumber);
     System.out.println(object.isPunchured);
     System.out.println(object.bikeName);
     System.out.println(object.runningKM);
     
	}

}
