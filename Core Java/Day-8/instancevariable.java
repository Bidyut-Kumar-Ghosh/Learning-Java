
public class instancevariable 
{
    private int count =0;
    public void incrementCount() 
    {
        count++;
    }
    public void displayCount()
    {
        System.out.println("Count : "+count);
    }
    public static void main(String[] args) 
    {
        scope demo = new scope();
        demo.incrementCount();
        demo.displayCount();
    }
}
