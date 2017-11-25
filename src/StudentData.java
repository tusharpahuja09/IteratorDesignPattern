import java.util.Iterator;
import java.util.ArrayList;
public class StudentData implements dataIterator {
	
	ArrayList<dataInfo> info = new ArrayList<dataInfo>();
	
	public StudentData() {
		
		addEntry("Tushar", "OCTOBER","NCSU");
		addEntry("John", "NOVEMBER","UNCP");
		addEntry("Robin", "JANUARY","MIT");
	}
	
	public void addEntry(String name,String birthMonth,String institute) {
		dataInfo d = new dataInfo(name, birthMonth, institute);
		
		info.add(d);
		
	}
	
	public ArrayList<dataInfo> getInfo(){
		return info;
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return info.iterator();
	}

}
