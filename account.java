package da08;

public class account {

	private int accountNumber;
	private String name;
	private long balance;
	private String password;
	private String[] io = new String[180];
	private int count;
	
	public void deposit(long money) { 
		this.balance += money;
		String message = this.name+"님의 계좌로"+money+"원이 입금되었습니다."
				+ "\n잔액: "+ this.balance;
		io[count++] = message;
		System.out.println(message);
	}
	
	public boolean checkPassword(String password) {
		return password.equals(this.password);
	}
	
	public void withdraw(long money, String password) {
		if(checkPassword(password)) {
			if(this.balance-money<0) {
				System.out.println("잔액이 부족.");
			
			}else {
				this.balance -=money;
				String message = this.name+"님의 계좌로"+money+"원이 출금되었습니다."
						+ "\n잔액: "+ this.balance;
				io[count++] = message;
				System.out.println(message);
			}
		}else {
			System.out.println("비밀번호가 다름.");
		}
	}
	 public void transfer(long money, String password, account account) {
		 if(checkPassword(password)) {
			 if(this.balance-money<0) {
			 System.out.println("잔액 부족.");
		 }else {
			 this.balance -= money;
			 account.balance +=money;
			 String message = this.name+"님의 계좌에서"+account.name+"님의 계좌로 "+money+"원이 이체되었음."
				+ "\n잔액: "+ this.balance;
			 io[count++]=message;
			 System.out.println(message);

		 }
	 }else {
			 System.out.println("비밀번호가 다름.");
			 			 
		 }
	 }
	 public void getBalance(String password) {
		 if(checkPassword(password)) {
			 System.out.println(this.name+"계좌잔액: "+this.balance);
		 }else {
			 System.out.println("비밀번호 다름.");
		 }
	 }
	 
	 public account(String name, String password) {
		 this.accountNumber = (int)(Math.random()*Integer.MAX_VALUE);
		 this.name =name;
		 this.password =password;
	 }
	 public void printIo() {
		 for(int i=0; i<count;i++) {
			 System.out.println(io[i]);
		 }
}

	@Override
	public String toString() {
		return "account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", password="
				+ password + ", count=" + count + "]";
	}
	 
}
	 


