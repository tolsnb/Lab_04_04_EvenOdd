public class Main {
    public static void main(String[] args)
    {
        int numToExamine = 83;
        int check = 1;
        check = numToExamine % 2;

        if (check == 0)
        {
            System.out.println("The number " + numToExamine + " is even.");
        }
        else
        {
            System.out.println("The number " + numToExamine + " is odd.");
        }
    }
}