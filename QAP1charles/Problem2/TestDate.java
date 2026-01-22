public class TestDate {
    public static void main(String[] args) {
        //a
        Date date1 = new Date(15, 8, 2023);
        System.out.println(date1);
        Date date2 = new Date(1, 1, 2024);
        System.out.println(date2);

        System.out.println(date1.toString());
        System.out.println(date2.toString());
    }
}