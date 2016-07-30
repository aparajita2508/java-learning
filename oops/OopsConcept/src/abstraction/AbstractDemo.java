package abstraction;

public class AbstractDemo
{
   public static void main(String [] args)
   {
      Salary s = new Salary("Rahul", "Dehradun, UK", 3, 3600.00);
      AbstractEmployee e = new Salary("Raz", "Patna, Bihar", 2, 2400.00);

      System.out.println("Call mailCheck using Salary reference --");
      s.mailCheck();

      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
    }
}
