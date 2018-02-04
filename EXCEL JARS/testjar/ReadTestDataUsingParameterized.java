package testjar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ReadTestDataUsingParameterized {
	static List<Object> cellData = new ArrayList();
	
	private String usecaseid;
	/**
	 * @return the usecaseid
	 */
	public String getUsecaseid() {
		return usecaseid;
	}

	/**
	 * @return the totalOwners
	 */
	public String getTotalOwners() {
		return totalOwners;
	}

	/**
	 * @return the ownerType
	 */
	public String getOwnerType() {
		return ownerType;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @return the secondOwnerType
	 */
	public String getSecondOwnerType() {
		return secondOwnerType;
	}

	/**
	 * @return the secondOwnerName
	 */
	public String getSecondOwnerName() {
		return secondOwnerName;
	}

	/**
	 * @return the jointOwnerName
	 */
	public String getJointOwnerName() {
		return jointOwnerName;
	}

	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @return the liensCount
	 */
	public String getLiensCount() {
		return liensCount;
	}

	/**
	 * @return the lienName
	 */
	public String getLienName() {
		return lienName;
	}

	/**
	 * @return the salePrice
	 */
	public String getSalePrice() {
		return salePrice;
	}

	/**
	 * @param usecaseid the usecaseid to set
	 */
	public void setUsecaseid(String usecaseid) {
		this.usecaseid = usecaseid;
	}

	/**
	 * @param totalOwners the totalOwners to set
	 */
	public void setTotalOwners(String totalOwners) {
		this.totalOwners = totalOwners;
	}

	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @param secondOwnerType the secondOwnerType to set
	 */
	public void setSecondOwnerType(String secondOwnerType) {
		this.secondOwnerType = secondOwnerType;
	}

	/**
	 * @param secondOwnerName the secondOwnerName to set
	 */
	public void setSecondOwnerName(String secondOwnerName) {
		this.secondOwnerName = secondOwnerName;
	}

	/**
	 * @param jointOwnerName the jointOwnerName to set
	 */
	public void setJointOwnerName(String jointOwnerName) {
		this.jointOwnerName = jointOwnerName;
	}

	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param plate the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}

	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @param liensCount the liensCount to set
	 */
	public void setLiensCount(String liensCount) {
		this.liensCount = liensCount;
	}

	/**
	 * @param lienName the lienName to set
	 */
	public void setLienName(String lienName) {
		this.lienName = lienName;
	}

	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

	private String totalOwners;
	private String ownerType;
	private String ownerName;
	private String secondOwnerType;
	private String secondOwnerName;
	private String jointOwnerName;
	private String vin;
	private String model;
	private String plate;
	private String expDate;
	private String vehicleType;
	private String weight;
	private String liensCount;
	private String lienName;
	private String salePrice;
	
	public ReadTestDataUsingParameterized(String usecaseid, String totalOwners, String ownerType, String ownerName,
			String secondOwnerType, String secondOwnerName, String jointOwnerName, String vin, String model,
			String plate, String expDate, String vehicleType, String weight, String liensCount, String lienName,
			String salePrice) {
		this.usecaseid = usecaseid;
		this.totalOwners = totalOwners;
		this.ownerType = ownerType;
		this.ownerName = ownerName;
		this.secondOwnerType = secondOwnerType;
		this.secondOwnerName = secondOwnerName;
		this.jointOwnerName = jointOwnerName;
		this.vin = vin;
		this.model = model;
		this.plate = plate;
		this.expDate = expDate;
		this.vehicleType = vehicleType;
		this.weight = weight;
		this.liensCount = liensCount;
		this.lienName = lienName;
		this.salePrice = salePrice;
	}

	public static Object[] parseJSONPostionFiles(String fileName) throws IOException {

		FileInputStream fs = new FileInputStream(fileName);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Row row = sheet.getRow(sheet.getLastRowNum());
		String total = sheet.getSheetName();
		System.out.println("Total No of Rows ... "+ total);

		String[] sb = new String[sheet.getLastRowNum()+1];
		for(int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++){
			row = sheet.getRow(rowIndex);
			sb[rowIndex] = String.valueOf(rowIndex);
			System.out.println("\n "+"Row id "+ row.getRowNum()+"\n");
			for(int colIndex = row.getFirstCellNum(); colIndex <= row.getLastCellNum()-1; colIndex++){
				Cell cell = row.getCell(colIndex);
				if(cell==null){
					cellData.add("null");
				} else {
					switch (cell.getCellType()) 
					{
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						cellData.add(cell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						cellData.add(cell.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_BLANK:
						System.out.print(cell.getStringCellValue() + "\t");
						cell.setCellValue("EMPTY");
						cellData.add("EMPTY");
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
						cellData.add(String.valueOf(cell.getBooleanCellValue()));
						break;
					}
				}
			}
			sb[rowIndex] = String.valueOf(cellData);
			cellData.clear();
		}
		return sb;
	}	

	@Parameters
	public static Collection inputData() throws IOException{
		String fileName = "C:/Users/User/workspace/testjar/TRANSACTION_USECASE_TEMPLATE.xlsx";
		Object[] retrieveDataList = null;
		retrieveDataList = parseJSONPostionFiles(fileName);
		Collection<Object[]> objects = new ArrayList<Object[]>();
		
		for (Object usecaseid : retrieveDataList) {
			if(!(usecaseid == null)){
				/*int sizeOf = ((String)usecaseid).split(",").length;
				if(sizeOf<=15){
					for(int i=0; i<sizeOf ; i++){
						objects.add(new Object[] {  ((String) usecaseid).split(",")[i].replace("[", "") });
					}
					
				for(int j=sizeOf+1; j<16 ; j++){
					objects.add(new Object[] {  ((String) usecaseid).trim() });
				}
				} else {*/
				objects.add(new Object[] {  
						((String) usecaseid).split(",")[0].replace("[", "") ,
						((String) usecaseid).split(",").length>0 && 1 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[1]) : null,
						((String) usecaseid).split(",").length>0 && 2 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[2]): null,
						((String) usecaseid).split(",").length>0 && 3 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[3]: null,
						((String) usecaseid).split(",").length>0 && 4 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[4]): null,
						((String) usecaseid).split(",").length>0 && 5 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[5]: null,
						((String) usecaseid).split(",").length>0 && 6 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[6]: null,
						((String) usecaseid).split(",").length>0 && 7 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[7]: null,
						((String) usecaseid).split(",").length>0 && 8 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[8]: null,
						((String) usecaseid).split(",").length>0 && 9 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[9]: null,
						((String) usecaseid).split(",").length>0 && 10 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[10]): null,
						((String) usecaseid).split(",").length>0 && 11 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[11]): null,
						((String) usecaseid).split(",").length>0 && 12 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[12]): null,
						((String) usecaseid).split(",").length>0 && 13 < ((String) usecaseid).split(",").length ? convertToString(((String) usecaseid).split(",")[13]): null,
						((String) usecaseid).split(",").length>0 && 14 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[14]: null,
						((String) usecaseid).split(",").length>0 && 15 < ((String) usecaseid).split(",").length ? ((String) usecaseid).split(",")[15].replace("]",""): null
					});
			}
		}
		return objects;
	}
	
	private static Object convertToString(String str) {
		if(str.trim().toString().contentEquals("null")){
			return str;
		} else {
			if(str.contains("]")){
				str = str.replace("]", "");
			}
		int val = str.indexOf('.');
		return str.trim().substring(0, val-1);
		}
	}

	@Test
	public void test() throws IOException {
		System.out.println("\n"+"Values are ::" +"\n");
		if(totalOwners != null){
			if(totalOwners.trim().equalsIgnoreCase("2")) {
				System.out.println("Displaing Second OwnerValue"+ usecaseid + ":"+ salePrice);
			}
		}
		
		System.out.println(usecaseid+"*"+totalOwners
				+" *"+ownerType
				+" *"+ownerName
				+" *"+secondOwnerType
				+" *"+secondOwnerName
				+" *"+jointOwnerName
				+" *"+vin
				+" *"+model
				+" *"+plate
				+" *"+expDate
				+" *"+vehicleType
				+" *"+weight
				+" *"+liensCount
				+" *"+lienName
				+" *"+salePrice);
		
		TransactionData t = new TransactionData(new ReadTestDataUsingParameterized(usecaseid,totalOwners ,ownerType
				,ownerName
				,secondOwnerType
				,secondOwnerName
				,jointOwnerName
				,vin
				,model
				,plate
				,expDate
				,vehicleType
				,weight
				,liensCount
				,lienName
				,salePrice));
		
		
	}
}	
