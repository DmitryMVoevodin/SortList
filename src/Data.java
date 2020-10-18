public class Data {
    int number;
    String name;

    public Data(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Data{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}