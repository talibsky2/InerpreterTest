public class Test {
    public static void main(String[] args) {
//        "10-20+30"
        Context context = new Context();
        Expression exp = context.evaluate("10-20+30");
        System.out.println(exp.interpret());

    }
}