package practice.level16;

import javax.management.ObjectName;

public class task17 {
    public static void main(String[] args) {
        StorageBox box = new StorageBox();

        box.put("Hi");
      Object con = box.retrieve();
        System.out.println(con);
    }
}

class StorageBox {
    private Object content;

    void  put(Object item) {
        this.content=item;
    }

    public Object retrieve () {
        return  content;
    }
}