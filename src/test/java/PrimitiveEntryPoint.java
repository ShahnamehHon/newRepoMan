public class PrimitiveEntryPoint {
    public static void main(String[] args) {
        Primitive newByte = new Primitive();
        newByte.a = 100;
        Primitive newShort = new Primitive();
        newShort.b = 20000;
        Primitive newInt = new Primitive();
        newInt.c = 40000;
        Primitive newLong = new Primitive();
        newLong.d = 12345987609L;
        Primitive newChar = new Primitive();
        newChar.e = 'A';
        Primitive newFloat = new Primitive();
        newFloat.f = 100.0f;
        Primitive newDouble = new Primitive();
        newDouble.g = 100.00d;
        Primitive newBoolean = new Primitive();
        newBoolean.h = false;
        System.out.println("Result " + newChar.e);
    }
}
