import java.util.Arrays;
import java.util.Iterator;

public class DataManager {
	
	TeacherData td;
	StudentData sd;
	
	dataIterator tdItr;
	dataIterator sdItr;
	
	public DataManager(dataIterator newTd, dataIterator newSd){
		this.tdItr = newTd;
		this.sdItr = newSd;
	}
	
	public void showData() {
		Iterator tds = tdItr.createIterator();
		Iterator sds = sdItr.createIterator();
		
		System.out.println("Teacher Data");
		printData(tds);
		System.out.println("Student Data");
		printData(sds);
	}
	
	public void printData(Iterator itr) {
		
		while(itr.hasNext()) {
			dataInfo d = (dataInfo) itr.next();
			System.out.println(d.getName());
			System.out.println(d.getBirthMonth());
			System.out.println(d.getInstitute());
		}
	}

}
