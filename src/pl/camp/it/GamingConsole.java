package pl.camp.it;

public enum  GamingConsole {
    PLAY_STATION1("Intel", "Nvidia",
            "Corsair", "DDR5", "Sony"),
    PLAY_STATION4("Intel5", "Nvidia5",
            "Z200/KR15", "DDR6", "Sony"),
    XBOX("Intel", "AMD",
            "Corsair", "DDR5", "Microsoft"),
    SWITCH("Intel", "AMD",
            "Corsair", "DDR5", "Nintendo");

    private String processor;
    private String graphicCard;
    private String powerSupply;
    private String ram;
    private String brand;
    private int age;

    GamingConsole(String processor, String graphicCard, String powerSupply, String ram, String brand) {
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.powerSupply = powerSupply;
        this.ram = ram;
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public String getRam() {
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GamingConsole{" +
                "processor='" + processor + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", ram='" + ram + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
