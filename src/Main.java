
import Tasks.InsertDeleteGetRandomO1;


public class Main {

    public static void main(String[] args) {
        InsertDeleteGetRandomO1 obj = new InsertDeleteGetRandomO1();
        obj.insert(1);
        obj.insert(2);
        obj.insert(4);
        obj.insert(11);
        obj.insert(12);
        int val = 10;
        boolean param_1 = obj.insert(val);
        val = 17;
        boolean param_2 = obj.remove(val);
        int param_3 = obj.getRandom();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
    }
}