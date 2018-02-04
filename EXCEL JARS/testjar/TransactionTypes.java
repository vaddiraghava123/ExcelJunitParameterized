package testjar;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TransactionTypes {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	private final static List<OwnersInfo> ownerInfo = null;
	private final static List<VehicleInfo> vehicleInfo = null;
	private final static List<SalesInfo> salesInfo = null;
	
	
	public static List<OwnersInfo> getOwnerinfo() {
		return ownerInfo;
	}
	@Override
	public String toString() {
		return "TransactionTypes [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public static List<VehicleInfo> getVehicleinfo() {
		return vehicleInfo;
	}
	public static List<SalesInfo> getSalesinfo() {
		return salesInfo;
	}

}
