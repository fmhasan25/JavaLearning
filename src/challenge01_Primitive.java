import java.sql.SQLOutput;

public class challenge01_Primitive {
    /**
     * create variable for byte,short,int and long and make it equal to 50000+ 10*(byte+short+int)
     * */

    public static void main(String[] args) {
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        byte byteNumber= 110;
        short shortNumber = 2200;
        int intNumber = 3300;

        long longNumber = 50000L+ 10L * (byteNumber+shortNumber+intNumber);
        System.out.println(longNumber);
        short castShort =  (short) (5000+ 10 * (byteNumber+shortNumber+intNumber));
    }

}//end of the class
