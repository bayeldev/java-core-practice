package practice.level9;

public class task20 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Я люблю Java!");
        sb.delete(1, 7);
        System.out.println(sb);
        sb.replace(2,6, "программирование");

        System.out.println(sb);
    }
}
