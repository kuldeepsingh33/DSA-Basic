package Projects;
// This is a  basic project which work like a normal atm .Its just a code which works like an atm machine.In this u can set a pin and then
// try doing transactions like cash deposit,withdrawmoney ,view last five transactions etc. 
import java.util.*;
public class Atm {
    public int currentBalance=0;
    public int pin=0000;
    ArrayList <String> list=new ArrayList<>();
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
    Atm atm=new Atm();
    int i;
    System.out.print("Enter Pin: ");
    int y=s.nextInt();
    if(atm.pin==y){
    do{
        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Change Pin");
        System.out.println("4.Show Balance");
        System.out.println("5.Print Last 5 transactions");
        i=s.nextInt();
       switch(i){
           case 1:
          System.out.println("Enter Amount to Deposit:");
         int x=s.nextInt();
         atm.currentBalance+=x;
          atm.list.add(0,"Deposited: "+x);
          break;
          case 2:
          System.out.println("Enter Amount to Withdraw:");
           x=s.nextInt();
           if(x<=atm.currentBalance)
         { atm.currentBalance-=x;
          atm.list.add(0,"Withdrawn: "+x);
         }else
         { System.out.println("Insufficient Balance");
          atm.list.add(0,"Withdrawn Failed of: "+x+" Insufficient Balance");}
          break;
          case 3:
          System.out.println("Enter the current Pin:");
           x=s.nextInt();
           if(x==atm.pin){
            System.out.println("Enter the New Pin:");
            x=s.nextInt();
            atm.pin=x;
            System.out.println("Pin Change Successfull");
           }
           else{
               System.out.println("Wrong Pin");
           }
          atm.list.add(0,"Pin Changed");
          break;
          case 4:
          System.out.println("Current Balance is: "+atm.currentBalance);
          atm.list.add(0,"Balance Checked");
          break;
           case 5:
           System.out.println("Last 5 transactions are: ");
           for(int j=0;j<atm.list.size() && j<5;j++)
           System.out.println(atm.list.get(j));
           break;
           default:
           System.out.println("Invalid Input Transaction Declined");
           System.out.println();
           System.out.println();
       } 
    }while(i>0 &&i<=5);}
    else
    System.out.println("Wrong Pin!!");
 
  }
}
