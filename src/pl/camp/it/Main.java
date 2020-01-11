package pl.camp.it;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.plec = Sex.OTHER;

        GamingConsole gamingConsole = GamingConsole.PLAY_STATION1;

        System.out.println(gamingConsole);

        String men = "men";

        //Sex plec = Sex.values();

        System.out.println(Sex.values());
    }
}
