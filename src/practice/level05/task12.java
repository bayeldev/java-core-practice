package practice.level05;

import java.util.Random;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int knightHp=100;
        int dragonHp=50;
        int dragonMax=rand.nextInt(19)+2;
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        while(true) {

            System.out.print("Сила удара рыцаря (1-20): ");
            int dmgKnight=sc.nextInt();
            if(dmgKnight>dragonMax) {
                dmgKnight=0;
            } else if (dmgKnight<=dragonMax) {
                dragonHp-=dmgKnight;
//                dmgKnight-=dragonHp;
            }
                if(dragonHp<=0) {
                    System.out.println("Рыцарь победил!");
                    return;
                }
                int dragonFirstDmg=rand.nextInt(10)+1;
                int dragonSecondDmg= rand.nextInt(10)+1;
                int fullDmg = dragonFirstDmg+dragonSecondDmg;
                knightHp-=fullDmg;
                if(knightHp<=0) {
                    System.out.println("Дракон победил!");
                    return;
                }


                 System.out.println("Жизни рыцаря: "+knightHp);
                 System.out.println("Жизни дракона: "+dragonHp);
        }

    }
}
