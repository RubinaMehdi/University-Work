public class LoanInstallment {
public static void main(String[] args) {
double loanAmount = 1200000;      
double annualInterestRate = 12;    
int years = 5;

double monthlyInterestRate = annualInterestRate / 12 / 100; 
int totalMonths = years * 12;

double monthlyPayment = (loanAmount * monthlyInterestRate) /
(1 - Math.pow(1 + monthlyInterestRate, -totalMonths));

System.out.println("Loan Amount: Rs. " + loanAmount);
System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
System.out.println("Loan Duration: " + years + " years");
System.out.printf("Monthly Installment: Rs. %.2f\n", monthlyPayment);
       }
}

