import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heat;
        System.out.println("Lütfen sıcaklığı giriniz...");
        heat = sc.nextInt();
        if(heat <5){
            System.out.println("Bugün Kayak yapabilirsiniz.");
        }

        else if (heat == 5) {
            System.out.println("Bugün hem kayak yapabilir hemde sinemaya gidebilirsiniz.");
        }

        else if (5 < heat && heat < 15) {
            System.out.println("Bugün sinemaya gidebilirsiniz.");
        }

        else if (heat == 15) {
            System.out.println("Bugün hem sinemaya gidebilir hemde piknik yapabilirsiniz.");
        }

        else if (15 < heat && heat < 25) {
            System.out.println("bugün piknik yapabilirsiniz.");
                   }

        else if (heat == 25) {
            System.out.println("Bugün hem piknik yapabilir hemde yüzmeye gidebilirsiniz");
        }

        else if (25 < heat) {
            System.out.println("Bugün yüzmeye gidebilirsiniz.");
        }
    }
}
