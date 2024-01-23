package exception;

import java.time.LocalDateTime;

public class ExceptionPractice {
    public static void main(String[] args) {
//        doSomething();



        LocalDateTime datetime = null;
        System.out.println(convertToString(datetime));
        System.out.println("HELLO");
    }

    //exception available in java
    //types of exception
    //exception hirarchy
    //checked vs unchecked

    private static String convertToString(LocalDateTime datetime) {
        try {
            int c = 10/0;
            System.out.println(c);
            return datetime.toString();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            return "নাল পয়েন্টার খাইছি";
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return "ভাগ করতে পারছি না";
        }
    }

    private static void doSomething() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
    }
}
