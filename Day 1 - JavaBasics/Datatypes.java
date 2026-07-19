public class Datatypes
{
	public static void main(String arg[])
	{
		//initialising variables
		int i = Integer.parseInt(arg[0]);
		float f = Float.parseFloat(arg[1]);
		double d = Double.parseDouble(arg[2]);
		byte b = Byte.parseByte(arg[3]);
		short s = Short.parseShort(arg[4]);
		long l = Long.parseLong(arg[5]);
		boolean bl = Boolean.parseBoolean(arg[6]);
		char ch = arg[7].charAt(0);
		String str = arg[8];
		
		//output statements
		System.out.println("Integer value is: " + i);
		System.out.println("Float value is: " + f);
		System.out.println("Double value is: " + d);
		System.out.println("Byte value is: " + b);
		System.out.println("Short value is: " + s);
		System.out.println("Long value is: " + l);
		System.out.println("Boolean value is: " + bl);
		System.out.println("Character value is: " + ch);
		System.out.println("String value is: " + str);
	}
}
//user inputs should be given at the run command(java classname)	