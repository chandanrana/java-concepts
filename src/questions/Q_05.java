package questions;

public class Q_05 {

    private static int count = 0;

    public Q_05() {
        count++;
    }

    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        Q_05 ob1j1 = new Q_05();
        Q_05 ob1j2 = new Q_05();
        Q_05 ob1j3 = new Q_05();
        Q_05 ob1j4 = new Q_05();

        System.out.println(Q_05.count);
        System.out.println(getCount());
    }
}
