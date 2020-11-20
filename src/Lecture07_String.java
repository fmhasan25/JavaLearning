public class Lecture07_String {
    public static void main(String[] args) {

        /**
         * String is a sequence of characters. In the case of the char which you can see above
         * which we discussed in the previous video, it could a single character only(regular
         * character or unicode characters)
         * A string is limited by the memory or the max value of an int which was 2.14 billion.
         * That's a lot of the characters.
         * */

        String myString = "This is a String";
        System.out.println("myString is equal to "+ myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to "+ myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to "+ myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
