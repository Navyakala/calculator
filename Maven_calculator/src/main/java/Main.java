import java.util.*;
public class Main extends Cal  {
    public static void main(String[] args)
    {
        Cal obj=new Cal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1:");
        double num1=scanner.nextDouble();
        System.out.println("Enter the number2:");
        double num2=scanner.nextDouble();
        String n;
        do
        {
            System.out.println("1.Addition\n");
            System.out.println("2.Subtraction\n");
            System.out.println("3.Multiplication\n");
            System.out.println("4.Division\n");
            System.out.println("enter the operator\n");
            char operator = scanner.next().charAt(0);
            if(operator=='1')
            {
                obj.addition(num1,num2);
            }
            else if(operator=='2')
            {
                obj.subtraction(num1,num2);
            }
            else if(operator=='3')
            {
                obj.multiplication(num1,num2);
            }
            else if(operator=='4')
            {
                obj.division(num1,num2);
            }
            else
            {
                System.out.println("Invalid choice");
            }
            System.out.println("Do you wish to continue(y/n)?");
            n = scanner.next();
        }while(n=="y");

    }
}
