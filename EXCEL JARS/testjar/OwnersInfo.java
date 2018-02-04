package testjar;

public class OwnersInfo {

	public OwnersInfo() {
		// TODO Auto-generated constructor stub
	}

	private final static int ownersTotal = 0;
	private final static String ownerType = null;
	private final static int secondOwnerTotal = 0;
	private final static String secondOwnerName = null;
	private final static String jointOwnerName = null;
	public static int getOwnerstotal() {
		return ownersTotal;
	}
	@Override
	public String toString() {
		return "OwnersInfo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public static String getOwnertype() {
		return ownerType;
	}
	public static int getSecondownertotal() {
		return secondOwnerTotal;
	}
	public static String getSecondownername() {
		return secondOwnerName;
	}
	public static String getJointownername() {
		return jointOwnerName;
	}
	
	
}
