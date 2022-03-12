package deepclonning;

public class StudentInfo implements Cloneable  {
int rollNumber;
String name;
AddressStu addressstu;
public StudentInfo () {
	
}
public StudentInfo(int rollNumber,String name,AddressStu addressstu) {
	this.rollNumber=rollNumber;
	this.name=name;
	this.addressstu=addressstu;
	
}
@Override
public String toString() {
	return "StudentInfo [rollNumber=" + rollNumber + ", name=" + name + ", addressstu=" + addressstu + "]";
}
@Override
public  Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	 StudentInfo dummystd=( StudentInfo)super.clone();
	 AddressStu addresss=(AddressStu)addressstu.clone();
	 dummystd.addressstu=addresss;
	 return dummystd;
	}

}
