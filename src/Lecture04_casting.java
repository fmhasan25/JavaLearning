public class Lecture04_casting {public static void main(String[] args) {
    /**
     *Finding the minimum and maximum value of integer
     * check with adding a value with maximum value
     * A Byte occupies 8 bit and width is 8
     * A short occupies 16 bit and width is 16
     * An int occupies 32 bit and width is 32
     *
     * */
    int myValue= 10000;
    int myMinValue= Integer.MIN_VALUE;
    int myMaxValue= Integer.MAX_VALUE;
    System.out.println("integer Minimum value = "+ myMinValue);
    System.out.println("integer Maximum value = "+ myMaxValue);
    System.out.println("Busted Max value = "+(myMaxValue+1));//overflowed
    System.out.println("Busted Min value = "+ (myMinValue-1));//underflow
    int myMaxIntTest = 2_147_483_647;// _ is acceptable


    byte MyMinByteValue= Byte.MIN_VALUE;
    byte MyMaxByteValue= Byte.MAX_VALUE;
    System.out.println("Byte Minimum value = "+MyMaxByteValue);
    System.out.println("Byte Maximum value = "+MyMinByteValue);

    short MyMinShortValue= Short.MIN_VALUE;
    short MyMaxShortValue= Short.MAX_VALUE;
    System.out.println("Short Minimum value = "+MyMinShortValue);
    System.out.println("Short Maximum value = "+MyMaxShortValue);


    long myLongValue = 100L; // 2 xy 64 ; 2 to the power 64
    long bigLongLiteralValue = 2_147_483_648L;
    long MyMinLongValue= Long.MIN_VALUE;
    long MyMaxLongValue= Long.MAX_VALUE;
    System.out.println("Short Minimum value = "+MyMinLongValue);
    System.out.println("Short Maximum value = "+MyMaxLongValue);
    System.out.println(myLongValue);
    System.out.println(bigLongLiteralValue);
    short bigShortLiteralValue = 32767;

    byte myTotal = (byte) (MyMinByteValue/2);
    short myNewByteValue = (short) (MyMinByteValue/2);


}
}
