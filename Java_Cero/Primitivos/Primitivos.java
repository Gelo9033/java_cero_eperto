package Java_Cero.Primitivos;

public class Primitivos {
    public static void main(String[] args) {

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;
        long numLong = 9223372036854775807L;
        float numFloat = 3.4028235E38F;
        double numDouble = 1.7976931348623157E308;
        char letra = 'A';
        boolean verdadero = true;   

        System.out.println("byte: " + numByte);
        System.out.println("el byte utiliza "+ Byte.BYTES + " bytes y su rango es desde " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + numShort);
        System.out.println("el short utiliza "+ Short.BYTES + " bytes y su rango es desde " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + numInt);
        System.out.println("el int utiliza "+ Integer.BYTES + " bytes y su rango es desde " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + numLong);
        System.out.println("el long utiliza "+ Long.BYTES + " bytes y su rango es desde " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float: " + numFloat);
        System.out.println("el float utiliza "+ Float.BYTES + " bytes y su rango es desde " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + numDouble);
        System.out.println("el double utiliza "+ Double.BYTES + " bytes y su rango es desde " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("char: " + letra);
        System.out.println("el char utiliza "+ Character.BYTES + " bytes y su rango es desde " + (int) Character.MIN_VALUE + " a " + (int) Character.MAX_VALUE);
        System.out.println("boolean: " + verdadero);
        System.out.println("el boolean utiliza "+ Boolean.TRUE + " y su valor falso es "+ Boolean.FALSE);
    }

}
