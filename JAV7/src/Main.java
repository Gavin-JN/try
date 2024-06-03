import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
            File file = new File("Exercise9_19.txt");
                PrintWriter output = new PrintWriter(file);
                for (int i = 0; i < 10; i++) {
                    int a = (int) (Math.random() * 100);
                    output.print(a);
                    output.print(" ");

                }
                output.close();

            Scanner input=new Scanner(file);
            int i=0;
            int[] a =new int [10];
            while(input.hasNext())
            {
                int m=input.nextInt();
                a[i]=m;
                i++;
            }
               input.close();

            for(int m=0;m<9;m++)
            {
                for(int n=0;n<10-m-1;n++)
                {
                    if(a[n]>a[n+1])
                    {
                        int tem=a[n];
                        a[n]=a[n+1];
                        a[n+1]=tem;
                    }
                }
            }

            for(int k=0;k<10;k++)
            {
                System.out.print(a[k]+" ");
            }





    }
}