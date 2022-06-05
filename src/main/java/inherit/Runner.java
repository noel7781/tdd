package inherit;

public class Runner {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        p = new Child();
        p.show();
    }
}
