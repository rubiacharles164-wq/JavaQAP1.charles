package QAP1charles.Problem3;
public class TestDate {
    public static void main(String[] args){

        Time t1 = new Time(21,10,15);
        
        Time t2 = new Time(10,20,25);
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        t1.nextSecond();
        t2.previousSecond();
        System.out.println("t1: " + t1.toString() + ", t2: " + t2.toString());
    }
}