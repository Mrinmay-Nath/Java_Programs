//write a program to implement type casting(narrowing) from int to byte ,double to byte from double to int.
class typecasting
{
    public static void main(String[] args)
    {
        byte b;
        int i = 257;
        double d=323.142;
        b=(byte)i;
        b=(byte)d;
        i=(int)d;                                                                                 

        System.out.println("\n Conversion of int to byte "+ b);
        System.out.println("\n Conversion of double to byte " + b);
        System.out.println("\n Conversion of double to int " + i);

    }
}