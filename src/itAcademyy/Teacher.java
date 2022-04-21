package itAcademyy;

public class Teacher extends Human{
    private String predmetName;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Это преподаватель с именем " + getName());
    }

    public Teacher(String name, String predmetName) {
        super(name);
        this.predmetName = predmetName;
    }

    public String getPredmetName() {
        return predmetName;
    }

    public void setPredmetName(String predmetName) {
        this.predmetName = predmetName;
    }
}


