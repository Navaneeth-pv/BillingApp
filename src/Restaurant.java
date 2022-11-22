import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] s = new String[] {" tea", "coffee", "Snacks","idli","Dosha","Bill","View all transaction","Exit"};
        int[] rate = new int[]{10,15,10,8,6,0,0,0,};
        int[] qt = new int[8];
        int sum=0;
        boolean quit=true;


        do{
            System.out.println("ITEM"+"\t\t\tPrice");
            for(int i=0;i<8;i++)
                System.out.println((i+1)+"."+s[i]+"\t\t"+rate[i]);

            System.out.println("Choose a number");


            int ch=input.nextInt();
            if(ch>0 && ch<6) {
                System.out.println("enter the no of quantites of " + s[ch - 1]);
                int q = input.nextInt();
                qt[ch - 1] += q;
            }
            else if (ch == 7) {
                System.out.println("Previous Transactions are");
                break;


            }
            else
            {
                quit=false;

            }

        } while(quit);


        System.out.println("Your Orders are:\n");
        for(int i=0;i<8;i++)
        {
            if(qt[i]!=0)
            {
                sum+=qt[i]*rate[i];
                System.out.println(s[i]+"*   "+qt[i]+"=="+qt[i]*rate[i]+"rs");
            }
        }


        System.out.println("Your total bill="+sum+ "rs");

        System.out.println("Thank you");


    }

}
