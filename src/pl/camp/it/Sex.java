package pl.camp.it;

public enum Sex {
    MEN("men"),
    WOMEN("women"),
    OTHER("other");

    String warosc;

    Sex(String wartosc) {
        this.warosc = wartosc;
    }

    public static Sex convertFromString(String a) {
        a = a.toUpperCase();
        if(a.equals("MEN")) {
            return Sex.MEN;
        } else if(a.equals("WOMEN")) {
            return Sex.WOMEN;
        } else if(a.equals("OTHER")) {
            return Sex.OTHER;
        }

        return null;
    }
}
