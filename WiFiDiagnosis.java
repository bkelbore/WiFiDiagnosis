import java.util.Scanner;//read input
public class WiFiDiagnosis {
  
public void troubleShootWiFi()
{
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in); // to enter some text
  
// 1st step
System.out.println("First step: reboot your computer");//Ask the user to reboot the computer 
System.out.print("Are you able to connect with the internet? (yes or no): ");
String choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))// Ask the user to choice yes or no and if enters yes, ignores "no"
{
System.out.println("Please enter yes or no!\n");
System.out.print("Are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))//if the use enters "yes", display computer seemed work
{
System.out.println("Rebooting your computer seemed to work");
return;
}
  
// 2nd step
System.out.println("Second step: reboot your router");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))// if enters "no", proceed to the next step 
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Rebooting your router seemed to work");
return;
}
  
// 3rd step
System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))// if the user enters no, proceed to the next step
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Checking the router's cables seemed to work");
return;
}
  
// 4th step
System.out.println("Fourth step: move your computer closer to your router");// if the user enters no, proceed to the 5th step
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))// ask the user to choice yes or no 
{
System.out.println("Please enter yes or no!\n");
System.out.print("Now are you able to connect with the internet? (yes or no): ");
choice = sc.nextLine().trim();
}
if(choice.equalsIgnoreCase("yes"))
{
System.out.println("Moving your computer closer to the router seemed to work");
return;
}
  
// 5th step
System.out.println("Fifth step: contact your ISP\n"
+ "Make sure your ISP is hooked up to your router.");
}
}

