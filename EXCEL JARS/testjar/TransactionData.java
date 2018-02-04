package testjar;

public class TransactionData {

	public TransactionData(ReadTestDataUsingParameterized obj) {
		methodTesting(obj);
	}
	
	
	private static String tranType = null;
	private static String totalOwners = null;
	private static String ownerType = null;
	private static String ownerName = null;
	private static String secondOwnerType = null;
	private static String secondOwnerName = null;
	private static String jointOwnerName = null;
	private static String vin = null;
	private static String model = null;
	private static String plate = null;
	private static String expDate = null;
	private static String vehicleType = null;
	private static String weight = null;
	private static String liensCount = null;
	private static String lienName = null;
	private static String salePrice = null;
	





	@Override
	public String toString() {
		return "TransactionData [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	public static void methodTesting(ReadTestDataUsingParameterized obj){
		System.out.println("Values are "+ obj.getSalePrice());
	}

}
