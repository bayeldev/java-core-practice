package practice.level16;

public class task11 {

   public class ProductionCounter {

        void startCountOperation() {

            Runnable annooun = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Счётчик запущен");
                }
            };


            annooun.run();
        }
    }

  public  static void main(String[] args) {
       task11 dart = new task11();
        ProductionCounter firstCounter = dart.new ProductionCounter();
        firstCounter.startCountOperation();
    }
}
