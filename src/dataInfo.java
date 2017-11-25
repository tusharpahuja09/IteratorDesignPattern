
public class dataInfo {
	String name;
	String birthMonth;
	String institute;
	
	dataInfo(String name,String birthMonth,String institute){
		this.name = name;
		this.birthMonth = birthMonth;
		this.institute = institute;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBirthMonth() {
		return birthMonth;
	}
	
	public String getInstitute(){
		return institute;
	}

}
