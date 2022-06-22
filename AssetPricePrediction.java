

// **||** Made by Emirhan **||**
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class AssetPricePrediction {

   
    public static void main(String[] args) throws IOException {
        
         double sum =0;
        int count=0; 
       double min=Integer.MAX_VALUE;
       double max =Integer.MIN_VALUE;
       double average =0;
       double currentValue=0;
       double potential =0;

         File n =new File("Asset.txt");     // READ
        Scanner scan = new Scanner(n);
        while(scan.hasNextDouble()){
            
        double num = scan.nextDouble();
          sum+=num;
         if(count ==0){
             currentValue=num;
         }
             
        if(num<min) min = num;
        if(num>max) max =num;
          count++;
   
        }    
     scan.close();
     
     average =sum/count;
     if(currentValue>average){
         potential= ((100-(average*100)/currentValue)*-1);
     }
     else if (average>currentValue){
                potential= (((average*100)/currentValue)-100);
     }
     
        
        System.out.println("Total Data Values is: "+count);
        System.out.println("--------------------------------");
        System.out.println("Asset Minimum Value is: "+ min);
        System.out.println("--------------------------------");
        System.out.println("Asset Maximum Value is: "+ max);
        System.out.println("--------------------------------");
        System.out.println("Current Value is: "+currentValue);
        System.out.println("--------------------------------");
        System.out.println("Asset Average Price: "+average);
        System.out.println("--------------------------------");
        System.out.println("Potential Profit: %"+potential);
        
     
        
             
    }
    
}
