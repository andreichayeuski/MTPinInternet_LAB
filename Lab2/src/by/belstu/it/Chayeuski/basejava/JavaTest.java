package by.belstu.it.Chayeuski.basejava;
import static java.lang.Math.*;
public class JavaTest {
    static int sint;
    public static void main(String[] args) {
        char pchar = 'x';
        int pint = 123;
        short pshort = 456;
        byte pbyte = 35;
        long plong = 789;
        boolean pbool = true;

        System.out.println("kyky" + pint);
        System.out.println("kyky" + pchar);
        System.out.println("kyky" + 123.456d);

        pbyte += pint;
        System.out.println("byte=byte+int" + pbyte);

        int rint = (int)(123.456d + plong);
        System.out.println("int=double+long  " + rint);

        long rlong = pint + 2147483647;
        System.out.println("plong=pint+2147483647    " + rlong);

        System.out.println("sint=" + sint);

        boolean abool = pbool && pbool;
        System.out.println("boolean=boolean&&boolean  " + abool);

        boolean obool = pbool ^ pbool;
        System.out.println("boolean=boolean^boolean   " + obool);

        //not works
        //obool = pbool + abool;

        long num = 9223372036854775807l;

        long num2 = 0x7fff_ffff_fffl;

        char zu = 'z' - 'a';
        System.out.println(zu);

        char zuzu = '\u0061';
        System.out.println(zuzu);

        char zuzuzu = 97;
        System.out.println(zuzuzu);

        System.out.println((char)(zu + zuzu + zuzuzu));

        System.out.println("3.45%2.4=" + (3.45%2.4));

        System.out.println("1.0/0.0=" + (1.0/0.0));

        System.out.println("0.0/0.0=" + (0.0/0.0));

        System.out.println("log(-345)=" + (log(-345)));

        System.out.println(Float.intBitsToFloat(0x7F800000));

        System.out.println(Float.intBitsToFloat(0xFF800000));
    }
    final int ZE = 123;
    public final int ZEZE = 456;
    public static final int ZEZEZE = 789;
    public void exD(){
        System.out.println("Exercise D");
        System.out.println("PI=" + Math.PI);

        System.out.println("e=" + Math.E);

        long opi = Math.round(Math.PI);
        System.out.println("Round(PI)=" + opi);

        long oe = Math.round(Math.E);
        System.out.println("Round(E)=" + oe);

        System.out.println("Min(PI, E)=" + Math.min(opi, oe));

        System.out.println("random=" + random()%1);
    }
    public void exE() {
        System.out.println("Exercise E");

        Character oChar   = new Character('a');
        Integer   oInt    = new Integer(10);
        Short     oShort  = new Short((short)-2);
        Long      oLOng   = new Long (12345678901l);
        Double    oDouble = new Double(123.456);

        int nInt = ~oInt;
        System.out.println("~Integer=" + nInt);

        char ze = 'b';
        ze += oChar;
        System.out.println("+Char=" + ze);

        int ne = oShort >> 2;
        System.out.println(ne);
        int be = oShort >>> 2;
        System.out.println(be);

        long lo = oLOng&111;
        System.out.println("Long&111=" + lo);

        System.out.println("longMIN=" + oLOng.MIN_VALUE);
        System.out.println("longMAX=" + oLOng.MAX_VALUE);
        System.out.println("doubleMIN=" + oDouble.MIN_VALUE);
        System.out.println("doubleMAX=" + oDouble.MAX_VALUE);

        Integer zint = new Integer(123);
        int zu = zint;
        Byte zbyte = new Byte((byte)255);
        byte zer = zbyte;

        int x = Integer.parseInt("9");
        System.out.println(x);
        System.out.println(Integer.toHexString(10)) ;
        System.out.println(Integer.compare(10, 2));//сравнение
        System.out.println(Integer.toString(123, 2));
        System.out.println(Integer.bitCount(123));
    }

    public void exF(){
        System.out.println("Exercise F");
        String s34 = "2345";
        System.out.println(Integer.valueOf(s34));
        Integer kek = new Integer(s34);
        System.out.println(kek);

        byte[] nen = s34.getBytes();
        System.out.println(nen);
        String news34 = new String(nen);
        System.out.println(news34);

        System.out.println(Boolean.valueOf(s34));
        System.out.println(Boolean.getBoolean(s34));

        //String str1 = new String("Hello");
        //String str2 = new String("Hello");
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("-------------");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        //str2 = null;
        System.out.println(str1 == str2);
        System.out.println(str2.equals(str1));
        //System.out.println(str1.compareTo(str2));

        String str = new String("hello my dear friends");
        for(String retval : str.split(" ")){
            System.out.println(retval);
        }
        System.out.println(str.contains("my"));
        System.out.println(str.hashCode());
        System.out.println(str.indexOf("my"));
        System.out.println(str.length());
        System.out.println(str.replace("friends", "frd"));
    }

    public void exG(){
        System.out.println("Exercise G");

        char[][] c1;
        int[] c2[];
        int c3[][];

        int ze[] = new int[0];

        //System.out.println(ze[2]);

        c1 = new char[3][];
        c1[0] = new char[0];
        c1[1] = new char[1];
        c1[2] = new char[2];
        System.out.println(c1.length);
        System.out.println(c1[0].length);
        System.out.println(c1[1].length);
        System.out.println(c1[2].length);

        c2 = new int[][]{ {1,2,3}, {1,2,3}, {1,2,3}};
        c3 = new int[][]{ {1,2,3}, {1,2,3}, {1,2,3}};
        boolean comRez = c2==c3;
        System.out.println(comRez);
        c2 = c3;

        for (int[] z2 :
                c2) {
            for (int z:
                    z2) {
                System.out.println(z);
            }
        }
    }
}
