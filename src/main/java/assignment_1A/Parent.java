package assignment_1A;

public class Parent {

    private String color;

    public Parent(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void display(){
        System.out.println(color);
    }
}
