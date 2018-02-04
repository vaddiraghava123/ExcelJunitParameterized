package testjar;

public class VehicleInfo {

	public VehicleInfo() {
		// TODO Auto-generated constructor stub
	}
	
	private final static String vin = null;
	private final static String model = null;
	private final static String plate = null;
	private final static String expDate = null;
	private final static int weight = 0;
	public static String getVin() {
		return vin;
	}
	public static String getModel() {
		return model;
	}
	public static String getPlate() {
		return plate;
	}
	public static String getExpdate() {
		return expDate;
	}
	public static int getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "VehicleInfo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
