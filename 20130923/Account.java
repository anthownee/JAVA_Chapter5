
public class Account {
//1. �������
	String accountNo;
	String ownerName;
	int balance;
//2. ������
Account(){

Account obj = new Account ();
}
//3. ��� �޼ҵ�
void deposit(int account){
	this.balance += account;
}
int withdraw(int account){
	if(this.balance < account){
		return 0;
	}
	return this.balance -= account;
}
}