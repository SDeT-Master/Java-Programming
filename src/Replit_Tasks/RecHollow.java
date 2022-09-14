package Replit_Tasks;

public class RecHollow {
    public static void main(String[] args) {
        printHollowRec(5,5);
    }

    public static void printHollowRec(int h,int w) {
        for(int j=1; j<=h; j++)
        {
            for(int i=1; i<=w; i++)
            {
                if(j ==1 || j==h || i==1 || i==w)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}