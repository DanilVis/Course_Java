package JavaCourse.Seminar6.Homework6;

public class Notebook {
    private String name;
    private int price;
    private String processor;
    private int ram;
    private int hdd;
    private String os;

    public Notebook(String name, int price, String processor, int ram, int hdd, String os) {
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    
    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }
    
    public String getOS() {
        return os;
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %d, processor: %s, ram: %d GB, hdd: %d GB, OS: %s", 
        this.name, this.price, this.processor, this.ram, this.hdd, this.os);
    }

}
