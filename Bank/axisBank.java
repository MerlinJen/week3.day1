package Bank;

public class axisBank extends bankInfo {
public void deposit(double d) {
	System.out.println("Deposit at the end of the year: " +d);
}


public static void main(String[] args) {
	bankInfo o1=new bankInfo();
	o1.saving(125400.00);
	o1.fixed(65002.36);
	o1.deposit(52610.78);
	axisBank o=new axisBank();
	o.deposit(165520.54);
}}

//Class     :BankInfo
//Methods :saving(),fixed(),deposit()
//
// Class     :AxisBank
// Methods :deposit()
//
//Description:
//You have to override the method deposit in AxisBank.