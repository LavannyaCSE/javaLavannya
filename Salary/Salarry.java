import java.util.*;
public class Salarry{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        int salary = sc.nextInt();
        System.out.println("Enter the choice:");
        int i = sc.nextInt();
        if(i==1){
            double percent = salary*0.1;
            double sal = salary+percent;
            System.out.println("Salary of manager is"+sal);
        }
        else if(i==2)
        {
            double percent = salary*0.2;
            double sal= salary+percent;
            System.out.println("Salary of manager is ++sal");
        }
        else{
            System.out.println(salary);
        }
        }
        }
       