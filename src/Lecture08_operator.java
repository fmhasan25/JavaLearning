public class Lecture08_operator {

    public static void main(String[] args) {
        int result = 1 + 2; //1+2=3
        int a = 2;
        int b = 4;
        System.out.println(result);
        System.out.println(a+b);
        result = result *10;
        System.out.println("result * 10 = "+result);
        result = result/2;
        System.out.println("result / 2 = "+ result);
        result = result % 4;
        System.out.println("result % 4 = "+ result);
        result ++ ;
        System.out.println("result ++ : "+result);
        result -- ;
        System.out.println("result -- : "+result);
        result +=2;
        System.out.println("result +=2 : "+result);
        result *= 10;
        System.out.println("result *=10 : "+result);
        result /=3;
        System.out.println("result/=3: "+result);
        result-=2;
        System.out.println("result-=2: "+result);

        /**
         * After if condition if semicolon is used the expected condition will no longer have
         * the relation with the logic
         * Code block can be used for multiple output
         * */
        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien!");

    }
}
