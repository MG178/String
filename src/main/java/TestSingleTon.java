public final class TestSingleTon {// финал запрещает наследовть
    private static TestSingleTon instance; //это оббект instance ОБРАЗЕЦ ПРИМЕР
    public String value;
    private TestSingleTon(String value){
        this.value=value; // ЗНАЧЕНИЕ
    }

    public static TestSingleTon getInstance(String value){ // МЕТОД КОТОРЫЙ ВОЗВРАЩАЕТ ОБРАЗЕЦ(защита конструктора)
        if (instance==null){
            instance = new TestSingleTon(value);
        }
        return instance;
    }

}
