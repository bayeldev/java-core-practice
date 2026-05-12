    package practice.level5;

    import java.util.Scanner;

    public class task10 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int dragonHp = 50;
            int knightHits = 10;

            System.out.println("Вы напали на спящего дракона - дракон расстроился");


            int punchPower;
            while (knightHits > 0 && dragonHp > 0) {
                System.out.print("Сила удара (1-10): ");
                punchPower=sc.nextInt();
                if (punchPower < 1 || punchPower > 10) {
                    System.out.println("Вы промахнулись.");
                    continue;
                }

                dragonHp-=punchPower;
                knightHits--;
                if(knightHits<1 && dragonHp>=1) {
                    System.out.println("Рыцарь проиграл!");
                    break;
                } else if(knightHits>=1 && dragonHp<1) {
                    System.out.println("Дракон повержен!");
                    break;
                }


            }
        }
    }
