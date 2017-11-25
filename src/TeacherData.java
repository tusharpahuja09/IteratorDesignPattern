import java.util.Iterator;
import java.util.Arrays;

public class TeacherData implements dataIterator {
	
	dataInfo[] info;
	int arrayValue = 0;
	
	public TeacherData(){
		
		info = new dataInfo[3];
		
		addEntry("Heber", "DECEMBER","NCSU");
		addEntry("Ed", "MARCH","NCSU");
		addEntry("Vatsavai", "FEBRUARY","NCSU");
	}
	
	public void addEntry(String name,String birthMonth,String institute) {
		
		dataInfo d = new dataInfo(name, birthMonth, institute);
		
		info[arrayValue] = d;
		arrayValue++;
	}
	
	public dataInfo[] getInfo() {
		return info;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(info).iterator();
	}

}
