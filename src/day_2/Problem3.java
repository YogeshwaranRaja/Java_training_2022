package day_2;

public class Problem3 {	
	public static void main(String[] args) {
		 byte byteval=1;
		 byte byteval2=1;
		 short shortval=1;
		 short shortval2=1;
		 int integer=1;
		 int integer2=1;
		 long longinteger=1;
		 long longinteger2=1;
		 float floatingPoint=1.3f;
		 float floatingPoint2=1.3f;
		 double doubleValue=1.1;
		 double doubleValue2=1.1;
		 boolean bool=true;
		 boolean bool2=false;		 
		 char character='a';
		 char character2='a';
		 String string="abcd";
		 String string2=new String("abcd");
		 String string3="";
		 
		 byteval2=(byte)shortval;
		 System.out.println(byteval2);
		 shortval2=byteval;
		 System.out.println(shortval2);
		 shortval2=(short)integer;
		 System.out.println(shortval2);
		 integer2=shortval;
		 System.out.println(integer2);
		 integer=(int)longinteger;
		 System.out.println(integer2);
		 longinteger2=integer;
		 System.out.println(longinteger2);
		 longinteger2=(long)floatingPoint;
		 System.out.println(longinteger2);
		 floatingPoint2=longinteger;
		 System.out.println(floatingPoint2);
		 floatingPoint2=(float)doubleValue;
		 System.out.println(floatingPoint2);
		 doubleValue2=floatingPoint;
		 System.out.println(doubleValue2);
	}
}
