public class TestPremTypes {

    public static void main(String[] args) {
        int data = 100;
        if(data == 100)
            System.out.println("YES");
        else
            System.out.println("No");

        System.out.println("max int :"+Integer.MAX_VALUE);
        System.out.println("max long : "+Long.MAX_VALUE);

        // byte b1 = 128; // Compiler error: cannot convert from int to byte
        byte b1 =10;
        byte b2 = 5;
        // byte b3 = b1 + b2; // Compiler error : incompatible type 
        //  when we perform arthematic operation on byte the result is automatically promoted to integer
        byte b3 = (byte) (b1 + b2); // narrowing
        b1 += 10; // b1 = b1 + 10 // +=, if you do using short circuit operator internally does the addition + it also typecaste
        
        int i = b1;
        long l = 1353425454;
        float f = l; // no error : long -> float : automatic promotion
        // f = 123.456; // compiler error : double cannot be directly convert to float
        double d =  12345.567F; 
    }
}