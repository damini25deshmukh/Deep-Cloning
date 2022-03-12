package deepclonning;

public class TestClonning {
public static void main(String[] args) throws CloneNotSupportedException{
	AddressStu add=new AddressStu( "pune","India",441206);
	StudentInfo s1=new StudentInfo(10,"ram",add);
	System.out.println(s1);
	StudentInfo s2=(StudentInfo)s1.clone();
	System.out.println("clone object"+s2);
	s1.addressstu.city="mumbai";
	System.out.println("s1 after change"+s1);
	System.out.println("clone s2 after change"+s2);
}
}
