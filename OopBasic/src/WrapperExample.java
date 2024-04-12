public class WrapperExample {
    public static void main(String[] args) {
        
        Integer myInt;
        myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        // ラッパークラスのメソッドの使用
        System.out.println(myInt);
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

    }
}
