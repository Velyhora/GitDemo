package Fruits;

public class BasketModel {
    private String name;
    private int size;
    private String color;
    private String shape;

    public BasketModel(String name, int size, String color, String shape, int days) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.shape = shape;
        this.days = days;
    }

    private int days;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setName(String name) {
        this.name = name;
    }
}

