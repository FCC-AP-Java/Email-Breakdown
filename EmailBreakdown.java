import java.util.Scanner;

// Part 1 of the Email Breakdown Program Assignment

public class EmailBreakdown
{
  private String email;

  public EmailBreakdown()
  {
    email = "";
  }

  public EmailBreakdown(String e)
  {
    email = e;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String e)
  {
    email = e;
  }

  public void inputEmail()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your email?");
    email = input.nextLine();
    System.out.println("Username: " + email.substring(0, email.indexOf("@")));
    System.out.println("Server: " + email.substring(email.indexOf("@") + 1, email.indexOf(".")));
    System.out.println("Domain: " + email.substring(email.indexOf(".") + 1));
  }

  // Part 2 of Email Breakdown Program assignment

  public boolean isCorrectDomain()
  {
    return (email.substring(email.indexOf(".") + 1).equals("edu") || email.substring(email.indexOf(".") + 1).equals("org"));
  }

  public void checkEmail()
  {
    int errorCheck = 0;
    while (isCorrectDomain() == true || errorCheck == 0)
    {
      if (isCorrectDomain() == true)
      {
        System.out.println("Thank you for entering the correct type of email.");
        System.exit(0);
      }

      else if (isCorrectDomain() == false && errorCheck == 0)
      {
        System.out.println("You did not enter a school or organizational email. Please try again. You have one attempt left.");
        errorCheck = 1;
        inputEmail();
      }
      else
      {
        System.out.println("How Did We Get Here?");
      }
    }
    if (errorCheck == 1)
    {
      System.out.println("Please get the correct type of email. Goodbye!");
      System.exit(0);
    }
  }
}
