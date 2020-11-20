public class Lecture06_charAndBoolean {
    public static void main(String[] args) {

        /**
         * A char occupies two bytes of memory or 16 bits and thus has a width of 16. The reason it's
         * not just a single byte is that it allows you to store unicode characters
         *
         * unicode: unicode is an international encoding standard for use with different languages and scripts
         * by which each letter, digit or symbol is assigned a unique numeric value that applies across
         * different platforms and programs.
         * 2 bytes and capable to represent 65535 different types
         * browser https://unicode-table.com
         * */

        char myChar = 'D';
        char myUniCodeChar = '\u0044'; // from https://unicode-table.com
        char myCopyrightChar = '\u00A9'; // from https://unicode-table.com
        System.out.println(myChar);
        System.out.println(myUniCodeChar);
        System.out.println(myCopyrightChar);


        /**
         * Boolean works with true or false
         * */

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOver21 = true;




    }//end of the main method
}//end of the java class
