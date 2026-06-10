package practice.level11;

public class task05 {
    public static void main(String[] args) {
      int totalDistance = 100;
      int stepsPerUnit = 0;

      try  {
          int steps = totalDistance/stepsPerUnit;
          System.out.println(steps);
      } catch (ArithmeticException e) {
          System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");
      }
    }
}
