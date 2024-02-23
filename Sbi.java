package practice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
class Banksbi
{
	String aname;
	String ano;
	double balance;
	Scanner in=new Scanner(System.in);
	Banksbi(String aname,String ano,long balance)
	{
		this.aname=aname;
		this.ano=ano;
		this.balance=balance;
	}
	public void show()
	{
		System.out.println("name of account holder = "+aname);
		System.out.println("account number = "+ano);
		System.out.println("account balance = "+balance);
	}
	public void avlbal()
	{
		long avl;
		System.out.println("add money in bank");
		avl=in.nextLong();
		balance+=avl;
		System.out.println("avilable balance is = "+balance);
	}
	public void withdrawbal()
	{
		long wil;
		System.out.println("withdraw money in bank");
		wil=in.nextLong();
		if(balance>=wil)
		{
			balance-=wil;
			System.out.println("balance is left = "+balance);
		}
		else 
		{
			System.out.println("balance is less than avl balance");
		}
	}
	
}

public class Sbi {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout=new FileOutputStream("sbi.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Banksbi b1=new Banksbi("abhishek","234599973498",80000);
		Scanner in=new Scanner(System.in);
		System.out.println("Account datils case 1");
		System.out.println("add money then press case2");
		System.out.println("withdraw monry press case 3");
		int num=in.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("account datils");
			b1.show();
			break;
		case 2:
			System.out.println("add money ");
			b1.avlbal();
			break;
		case 3:
			System.out.println("withdraw money");
			b1.withdrawbal();
			break;
		default:
			System.out.println("switch will exit");
		
		}
		FileInputStream fin=new FileInputStream("sbi.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Banksbi b2=(Banksbi)objin.readObject();
		b2.show();
	}

}
