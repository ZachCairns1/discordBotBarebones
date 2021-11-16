public class BotMain {


    public static void main(String[] args) {

        System.out.println("Hello Zach!");

        User Zach = new User("Zach", 19.0);
        User Noah = new User("Noah", 24.0);

        System.out.println(
                "Zach score is " + Zach.score.toString() + "\n" +
                "Noah score is " + Noah.score.toString());


    }
}
