/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine2;

/**
 *
 * @author VAIO
 */
import java.util.Scanner;
public class AtmMachine2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String access;
        String access2;
        int balance = 10000;
        int withdraw;
        int depositBalance;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter username");
        access = input.next();
        if (access.equals("stop")) ;        
        System.out.println("Enter password");
        access2 = input.next();
        if (access2.equals("stop"));

        while (true)
        {
             System.out.println("Choose the number representing operation you want to perform");
            System.out.println("1 withdrawal");
            System.out.println("2 Deposit");
            System.out.println("3 Account Balance");
            System.out.println("4 Exit");
             int n = input.nextInt();
             String re = input.nextLine();
             {                             
             } 
                 
                 switch(n){
              case 1:
                 
                    System.out.println("Enter Amount");
                    withdraw = input.nextInt();
                    if (balance >= withdraw);                               
                        balance = balance - withdraw;
                        System.out.println("counting in progress...");
                        System.out.println("take your money");
                    
                        default:                                                                            
                        System.out.println("");
                        break;
             
              case 2:
                    System.out.println("Enter deposit amount");
                    depositBalance = input.nextInt();
                    balance = balance + depositBalance;
                    System.out.println("Deposit successful");                    
                    System.out.println("Current balance:");
                     System.out.println("Balance: "+ balance);                                         
                    System.out.println("");
                    break;
                    
                case 3:
                    System.out.println("Balance: "+ balance);
                    System.out.println("");
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                 }
        }
    }
}
        
        
        
            
         
    

