/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: 
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int addTwo = add(3, 8);
        System.out.println(addTwo);
    }




    // 1. add
    public static int add(int i1, int i2) {
        return i1 + i2;
    }

    // 2. add
    public static int add(int i1, int i2, int i3, int i4) {
        int firstSum = add(i1, i2);
        int secondSum = add(i3, i4);
        return add(firstSum, secondSum);
    }

    // 3. morningGreeting   morningGreeting(“Toby Fox”) → 早上好, Toby Fox!
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!" ;
    }

    // 4. afternoonGreeting     afternoonGreeting(“Mac Miller”) → 下午好, Mac Miller!
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!" ;
    }

    // 5. triple    triple(“oohbaby”) → oohbabyoohbabyoohbaby
    public static String triple(String word) {
        return word + word + word;
    }

    // 6. half
    public static double half(int i) {return (double) i /2;}

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double v) {
        return (int) (v + 0.5) ;
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double v) {
        return (int) (v - 0.5) ;
    }
}


