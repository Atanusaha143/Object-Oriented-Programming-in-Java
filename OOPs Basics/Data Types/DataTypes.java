class DataTypes
{
	public static void main(String args[])
	{
		// boolean data type
		/*boolean t = true;
		boolean f = false;
		if(t==true)
			System.out.println("True");
		if(f==false)
			System.out.println("False");*/
		
		
		// byte data type
		/*byte b = 126; // range -128 to 127
		System.out.println("In range: "+b); 
		b++; b = 127;
		System.out.println("In range: "+b);
		b++;
		System.out.println("Not in range: "+b);*/
		
		
		// char data type
		/*char a = 'A';
		System.out.println(a);*/
		
		//short data type
		/*short s = 100; //range -32,768 to 32767
		System.out.println(s);*/
		
		// int data type
		/*int i = 1500; // range -2^31 to 2^31-1
		System.out.println(i);*/
		
		// long data type
		/*long l = 12345678910L; // range -2^63 to 2^63-1
		System.out.println(l);*/
		
		// float data type
		/*float f = 123.4f; // upto 7 decimanl point
		System.out.println(f);*/
		
		// double data type
		/*double d = 4.56789; // upto 16 decimal point
		System.out.println(d);*/

		System.out.println("About Byte: ");
		System.out.println("Data Type Name: "+Byte.TYPE);
        	System.out.println("Size: "+Byte.SIZE);
        	System.out.println("Minimum Range: "+Byte.MIN_VALUE);
        	System.out.println("Maximum Range: "+Byte.MAX_VALUE);
        	System.out.println("\n");

       	 	System.out.println("About Short: ");
        	System.out.println("Data Type Name: "+Short.TYPE);
        	System.out.println("Size: "+Short.SIZE);
        	System.out.println("Minimum Range: "+Short.MIN_VALUE);
        	System.out.println("Maximum Range: "+Short.MAX_VALUE);
        	System.out.println("\n");

        	System.out.println("About Charecter: ");
        	System.out.println("Data Type Name: "+Character.TYPE);
        	System.out.println("Size: "+Character.SIZE);
        	System.out.println("Minimum Range: "+(int) Character.MIN_VALUE);
        	System.out.println("Maximum Range: "+(int) Character.MAX_VALUE);
        	System.out.println("\n");

       		System.out.println("About Integer: ");
        	System.out.println("Data Type Name: "+Integer.TYPE);
        	System.out.println("Size: "+Integer.SIZE);
        	System.out.println("Minimum Range: "+Integer.MIN_VALUE);
        	System.out.println("Maximum Range: "+Integer.MAX_VALUE);
        	System.out.println("\n");

        	System.out.println("About Float: ");
        	System.out.println("Data Type Name: "+Float.TYPE);
        	System.out.println("Size: "+Float.SIZE);
        	System.out.println("Minimum Range: "+Float.MIN_VALUE);
        	System.out.println("Maximum Range: "+Float.MAX_VALUE);
        	System.out.println("\n");

        	System.out.println("About Double: ");
        	System.out.println("Data Type Name: "+Double.TYPE);
        	System.out.println("Size: "+Double.SIZE);
        	System.out.println("Minimum Range: "+Double.MIN_VALUE);
        	System.out.println("Maximum Range: "+Double.MAX_VALUE);
        	System.out.println("\n");
        
        	System.out.println("About Long: ");
        	System.out.println("Data Type Name: "+Long.TYPE);
        	System.out.println("Size: "+Long.SIZE);
        	System.out.println("Minimum Range: "+Long.MIN_VALUE);
        	System.out.println("Maximum Range: "+Long.MAX_VALUE);
	}
}