class Sum{
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("sum : " +(num1+num2));

        //  sum of double number
        double num3 = Double.parseDouble(args[2]);
        double num4 = Double.parseDouble(args[3]);
        System.out.println("Sum of doubles : "+ (num3+num4));
    }
}