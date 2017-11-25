
public class DataDisplay {
	
	public static void main(String[] args) {
	TeacherData td = new TeacherData();
	StudentData sd = new StudentData();
	DataManager dm = new DataManager(td, sd);
	
	dm.showData();
	//sd.showData();
	}
}
