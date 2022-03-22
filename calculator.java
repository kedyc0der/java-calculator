
import java.util.Scanner;
public class IlkProgram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Toplama için = 1 \n Çıkarma için = 2 \n Çarpma için = 3 \n Bölme için = 4 \n Seçenek seç hadi ===>");
        int isaretler = input.nextInt();
        System.out.println("-----------------------------------------");
        System.out.print("1.Sayı giriniz: ");
        int mesaj = input.nextInt(); 
        System.out.print("2.Sayı giriniz: ");
        int mesaj2 =input.nextInt();
        if(isaretler == 1){
            System.out.println(mesaj + mesaj2);
        }else if(isaretler == 2){
            System.out.println(mesaj - mesaj2);
        }else if(isaretler==3){
            System.out.println(mesaj*mesaj2);
        }else if(isaretler==4){
            System.out.println(mesaj/mesaj2);
        }

    }
 
}
