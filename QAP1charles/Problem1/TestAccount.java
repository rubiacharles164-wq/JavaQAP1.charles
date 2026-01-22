public class TestAccount {
    public static void main(String[] args) {
        //a
        Account acc1 = new Account("1", "Alice", 5000);
        System.out.println(acc1);
        Account acc2 = new Account("2", "Bob", 4000);
        System.out.println(acc2);


        //b
        System.out.println(acc1.getBalance(0) + ", " + acc2.getBalance(0));

        //c
        System.out.println(acc1.transferTo(acc2, 1000));

        //d
        System.out.println(acc1.getBalance(0) + ", " + acc2.getBalance(0));
        

}
}
