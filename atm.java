package loops_projeler;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		double bakiye=1049.5;
		int input,avanslimit=500,miktar;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bankamıza hoşgeldiniz");
		System.out.println("Bakiyeniz: " + bakiye + " TL");
		
		while(bakiye>0) {
			System.out.println();
			System.out.println("1- para yatırma");
			System.out.println("2- para çekme");
			System.out.println("3- nakit avans çekme");			
			System.out.println("4- kart iade");
			System.out.println("yapmak istediğiniz işlemi seçiniz :");
			input=scan.nextInt();
			

			if(input==1) {
				System.out.println("Lütfen parayı bölmeye koyunuz"); 
				System.out.println("Eklediğiniz miktar= " );
				miktar=scan.nextInt();						
				bakiye=bakiye + miktar;
				System.out.println("Güncel Bakiyeniz=" + bakiye);
			}
			else if (input==2) {
				System.out.println("Çekeceğiniz miktar =");
				miktar=scan.nextInt();
				if(miktar>bakiye) {
					System.out.println("yetersiz bakiye");
				}
				else {
					bakiye=bakiye-miktar;
				}
				
				System.out.println("Güncel Bakiyeniz=" + bakiye);
			}
			else if(input==3) {
				System.out.println("nakit avans limitiniz=" + avanslimit);
				System.out.println("Çekeceğiniz miktar =");
				miktar=scan.nextInt();
				avanslimit=avanslimit-miktar;
				System.out.println("Güncel avans limitiniz:" + avanslimit );
			}
			else if(input==4) {
				System.out.println("Kartınızı almayı unutmayın");
				break;
			}
			else {
				System.out.println("geçersiz işlem");
			}
			
			
			
		}
	
		
		
		
		
	}

}
