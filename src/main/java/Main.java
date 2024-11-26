public class Main {
    public static void main(String[] args) {
        System.out.println("Bolvanka");

        TestSingleTon firstSingleton = TestSingleTon.getInstance("TEST 1");
        TestSingleTon secondSingleton = TestSingleTon.getInstance("TEST 2");

        System.out.println(firstSingleton.value);
        System.out.println(secondSingleton.value);
        //условно админ который в проге, его нельзя переопределить и заменить.

    }
}