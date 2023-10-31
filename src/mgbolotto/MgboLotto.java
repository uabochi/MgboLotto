package mgbolotto;

import java.util.Scanner;

public class MgboLotto {
    static Scanner scanner = new Scanner(System.in);
    static MgboImplementation lotto = new MgboImplementation();
        
    public static void main(String[] args) {
        System.out.println("Welcome to MGBO Lotto\nI accept T&C by playing\n\n1. create account\n2. play lotto\n3. Add Bank\n\n99. More");
        int input = scanner.nextInt();
        
        switch (input) {
            case 1:
                lotto.createPlayer();
                break;
            case 2:
                lotto.playLottery();
                break;
            case 3:
                lotto.addBank();
                break;
            case 99:
                System.out.println("4. Winning\n5. Check Wallet Balance\n6. Player History\n7. TopUp");
                int value = scanner.nextInt();
            switch (value) {
                case 4:
                    lotto.winning();
                    break;
                case 5:
                    lotto.checkWalletBalance();
                    break;
                case 6:
                    lotto.playerHistory();
                    break;
                case 7:
                    lotto.topUp();
                    break;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }
                break;
            default:
                    System.out.println("INVALID INPUT!");
                break;
        }

    }
    
}
