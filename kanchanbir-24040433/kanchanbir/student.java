
/**
 * Write a description of class student here.
 *
 * @author (kanchanbir-24040433)
 * @version (09/09/22)
 */
import java.util.Scanner;
import java.util.Arrays;
public class student
{
    public static void main(String[] args){
        System.out.println("Enter the Unit Name:");
        String unitname = (new Scanner(System.in)).next();
        System.out.println("Enter student count");
        int count = (new Scanner(System.in)).nextInt();
        double[] marks= new double[count];
        double avg=0.0;
        double standardDeviation=0.0;
        double result=0.0;
        
        int i=0;
        while(i<marks.length){
            System.out.println("Enter the marks:");
            double mrks= (new Scanner(System.in)).nextDouble();
            marks[i]=mrks;
            if((mrks<0)||(mrks>100)){
                System.out.println("Enter valid marks between 0 and 100");
            }
            else 
            {
                i+=1;    
            }
        } 
        System.out.println("Unit Name is:" + unitname);
        for(int j=0;j<marks.length;j++)
        {
            System.out.print(marks[j]+",");
        }
        
        Arrays.sort(marks);
        System.out.println("");
        System.out.println("Highest students' marks are:"+ marks[marks.length-1]);
        System.out.println("Lowest students' marks are:"+ marks[0]);
        
         for(int k=0;k<count;k++)

       {

          
          avg=avg+marks[k];

        }
        System.out.println("Mean is:" + (avg/count));
    
        for (int m=0;m<count;m++)
    {
        standardDeviation+=Math.pow((marks[m] - avg), 2);
        result = Math.sqrt(standardDeviation/count);
    }
        System.out.println("Standard Deviation is:" + result );    
}
}
    

        