import java.util.Scanner;

public class BankApplication {

	static int count = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		BankDTO b = new BankDTO();
		String new_id1;
		String new_pw1;
		do{ 			
		System.out.println("Welcome XYZ");
		System.out.println("Enter Id: ");
		Scanner sc = new Scanner(System.in);
		new_id1 = sc.nextLine();
		System.out.println("Enter Pw: ");
		Scanner sc1 = new Scanner(System.in);
		new_pw1 = sc1.nextLine();
		}while (b.checkIdentification(new_id1, new_pw1));

		System.out.println("Your Id is BA0001 \n----------------");
		System.out.println("A. Check Balance");// 어떤 메뉴들을 선택할 수 있는지 표시함
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Transfer");
		System.out.println("E. Previous transaction");
		System.out.println("F. Exit");
		System.out.print("------------------\nSelect an option: ");
		String menu = scan.next().toLowerCase();
		switch (menu.charAt(0)) {
		case 'a':
		case 'ㅁ':
			b.getBalance();
			break;
		case 'b':
		case 'ㅠ':
			b.deposit();
			break;
		case 'c':
		case 'ㅊ':
			b.withdraw();
			break;

		case 'd':
		case 'ㅇ':
			b.transfer();
			break;

		case 'e':
		case 'ㄷ':
			b.printIo();
			break;

		case 'f':
		case 'ㄹ':
			System.out.println("Program is closed");
			scan.close();
			System.exit(0);
		default:
			System.out.println("you had wrong choice! Enter again please");
		}
	}

}
