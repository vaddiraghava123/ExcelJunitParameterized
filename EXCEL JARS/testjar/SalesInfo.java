package testjar;

/**
 * @author User
 *
 */
public class SalesInfo {

	public SalesInfo() {
		// TODO Auto-generated constructor stub
	}

	private final static double totalSalesPrice = 0;

	public static double getTotalsalesprice() {
		return totalSalesPrice;
	}

	@Override
	public String toString() {
		return "SalesInfo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
