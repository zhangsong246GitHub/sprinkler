package sprinkler.data;


import java.util.ArrayList;

import sprinkler.utilities.CSVLoader;

/**
 * @author Claudio Tanci
 * This class implements a set of records 
 *
 */
public class RecordSet {
	
	// recordSet
	private ArrayList<NominalRecord> records;

	/**
	 * New record set
	 */
	public RecordSet(){
		this.records = new ArrayList<NominalRecord>(0);
	}
		
	/**
	 * getRecords
	 * @return an ArrayList of records
	 */
	public ArrayList<NominalRecord> getRecords() {
		return records;
	}

	/**
	 * getRecord
	 * @param int
	 * @return record required
	 */
	public NominalRecord getRecord(int i) {
		return records.get(i);
	}
	
	/**
	 * contains
	 * @param record
	 * @return true if record exists in the recordset
	 */
	public boolean contains(NominalRecord record) {
		return records.contains(record);
	}
	
	/**
	 * add
	 * @param add a record to the record set
	 */
	public void add(NominalRecord record) {
		records.add(record);
		
	}
	
	/**
	 * size
	 * @return size of the RecordSet
	 */
	public int size() {
		return records.size();
		
	}
	
	/**
	 * @deprecated
	 */
	public ArrayList<ArrayList<String>> toArray() {
		ArrayList<ArrayList<String>> array = new ArrayList<ArrayList<String>>(0);
		for (NominalRecord record : records) {
			ArrayList<String> r = new ArrayList<String>(0);
			for (int j = 1; j < record.attributes.size(); j++) {
				r.add(record.getAttribute(j-1).value);
			}
			r.add(record.getLabel().label);
			
			array.add(r);
		}
		
		return array;
	}
}
