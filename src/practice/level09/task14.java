package practice.level09;

public class task14 {
   public static void main() {
       String filename = "document.pdf";

       boolean start = filename.startsWith("doc");

       boolean end = filename.endsWith(".pdf");

       System.out.println(start + " " + end);
    }
}
