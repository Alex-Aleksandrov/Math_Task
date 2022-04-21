package itAcademyy;

public class Human {
    private String name;

    public void printInfo(){
        System.out.println("Это человек с именем " + name);
    }


    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}