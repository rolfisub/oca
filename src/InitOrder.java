

public class InitOrder
{
    private String name = "Inline";
    {System.out.println("Name: " + name);}

    public InitOrder() {
        name = "Constructor";
        System.out.println("Name: " + name);
    }

    public static void main (String[]  args) {
        InitOrder init = new InitOrder();



    }

    {
        name = "Weird Code Block Init";
        System.out.println("Name: " + name);
    }
}
