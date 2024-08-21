public class CGPA {

    public static void main (String args[])
    {
        // Take Subject In Variables

        double Math,Physics,Chemistry,CGPA,CGPAPer;

        // Define Marks of Subjects
 
        Math = 8.1;
        Physics = 7.5;
        Chemistry = 7.9;

        // Perform 
        CGPA = (8.1 + 7.5 + 7.9) /(3);

        CGPAPer = (float)( 10 * (CGPA));

        System.out.println(" CGPA Percentage is:  "+CGPAPer +" % ");
        
        
    }

}