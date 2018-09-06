
import aqua.*;


public class Aqua {
    Water water = new Water();

    protected void finalize() {
        System.out.println("This might not be called");
    }

    public static void main(String[] args) {
        Water wa = new Water();
        Aqua a = new Aqua();
        a = null;
        System.gc();
    }
}
