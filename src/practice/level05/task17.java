package practice.level05;

public class task17 {
    public static void main(String[] args) {
        int size = 8;

          for(int i=0;i<size;i++) {

              for(int j=0;j<size;j++) {

                  System.out.print(((i + j) % 2 == 0) ? "##" : "__");

              }
              System.out.println();
        }

    }
}
