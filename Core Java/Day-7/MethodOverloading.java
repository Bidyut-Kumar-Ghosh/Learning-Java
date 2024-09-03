public class MethodOverloading 
{
    // static void printValue(int value)
    // {
    //     System.out.println("Integer Value: "+value);

    // }

    // static void printValue(double value)
    // {
    //     System.out.println("double Value: "+value);
        
    // }

    static int add(int a,int b)
    {
        return a+b;
    }

    static double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args) 
    {
        int sum1 = add(5,3);
        double sum2 = add(2.5, 3.7);

        System.out.println("sum1 : "+sum1);
        System.out.println("sum2 : "+sum2);
    }   
}
