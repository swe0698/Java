package src;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Parent{
    public int startElement, endElement;
    public String filter(int startElement,int endElement){
      return null;
    }
    
}
class ChildOne extends Parent{
    @Override
    public String filter(int startElement,int endElement){
        StringBuffer s = new StringBuffer();
        int sum;
        for(int i=startElement; i<endElement;i++){
            sum = 0;
            for(int j=1; j<=i;j++){
                //sum = 0;
                if(i%j==0){
                    sum++;
                }
                
            }
            if(sum==2)
            s.append(i + " ");
            
        }
        String k = s.toString();
        return k;
    }
}
class ChildTwo extends Parent {
  @Override
    public String filter(int startElement,int endElement){
        StringBuffer s = new StringBuffer();
         
        for(int i = startElement; i<endElement;i++){  
            int j = i;
            int result = calculate(j);
            if(result==1)
            s.append(i+ " ");
        }
         String k = s.toString();
         return k;
    }
        public int calculate(int j)
        {
             int sum = 0;
             while(j!=0){  
            sum = sum + ((j%10) * (j%10));             
            j = j/10;  
        }
        if(sum!=1 && sum!=4){
            sum = calculate(sum);

        }
        return sum;
        }
}
public class HelloWorld {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        ChildOne c = new ChildOne();
        ChildTwo g = new ChildTwo();
        Scanner sc = new Scanner(System.in);
        int startElement = sc.nextInt();
        int endElement = sc.nextInt();
        String K = c.filter(startElement,endElement);
        String B = g.filter(startElement,endElement);
        System.out.println(K);
        System.out.println(B);
    }
}