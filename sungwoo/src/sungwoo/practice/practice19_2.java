package sungwoo.practice;

class Business implements Cloneable {
	private String company;
	private String work;
	public Business(String company, String work) {
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("회사 : " + company);
		System.out.println("업무 : " + work);
	}	
		public Business clone() throws CloneNotSupportedException {
	        Business copy = (Business)super.clone();
	        return copy;
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz;
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	
	public void showPersonalInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bz.showBusinessInfo();
	}
	
	@Override
	public PersonalInfo clone() throws CloneNotSupportedException {
		PersonalInfo copy = (PersonalInfo)super.clone();
		copy.bz = bz.clone();
		return copy;
	}
}
public class practice19_2 {

	public static void main(String[] args) {
		try {
            PersonalInfo org = new PersonalInfo("James", 22, "SimpeSound", "encoding");
            PersonalInfo copy = org.clone();
			
	    org.showPersonalInfo();
            copy.showPersonalInfo();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
