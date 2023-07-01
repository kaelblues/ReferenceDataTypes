public class Application {

    public static void main(String[] args) {
        //Numeric primitives
        int integerNumber = 1;
        Integer integerNumberRef = 1;
        short shortNumber = 32767;
        Short shortNumberRef = 32767;
        long longNumber = 373923;
        Long longNumberRef = 3713923L;
        double doubleNumber = 2.7;
        Double doubleNumberRef = 2.7;
        float floatNumber = 52.3f;
        Float floatNumberRef = 52.3f;

        //Other primitives
        char character = 'a';
        Character characterRef = 'a';
        boolean booleanValue = false;
        Boolean booleanValueRef = false;
        byte myByte = 120;
        Byte myByteRef = 120;

        System.out.println(integerNumberRef);
        System.out.println(shortNumberRef);
        System.out.println(longNumberRef);
        System.out.println(doubleNumberRef);
        System.out.println(floatNumberRef);
        System.out.println(characterRef);
        System.out.println(booleanValueRef);
        System.out.println(myByteRef);
    }
}