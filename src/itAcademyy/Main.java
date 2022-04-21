package itAcademyy;


public class Main {
        public static void main(String[] args) {
            Student student = new Student("Alex", "505");
            Teacher teacher = new Teacher("Veronika", "English");

            System.out.println(student.getGroupName());
            System.out.println(teacher.getPredmetName());

            student.printInfo();
            teacher.printInfo();

            Figure[] figures = {
                    new Triangle("Red", 10, 10, 10),
                    new Triangle("green", 10, 20, 30),
                    new Triangle("Red", 10, 20, 15),
                    new Rectangle("Red", 5, 10),
                    new Rectangle("Orange", 40, 15),
                    new Circle("Red", 4),
                    new Circle("Red", 10),
                    new Circle("Blue", 5),
            };

            System.out.println(calculateRedPerimeter(figures));
            System.out.println(calculateRedArea(figures));

        }

        public static double calculateRedPerimeter(Figure[] figures) {
            double count1 = 0;
            for (Figure i : figures) {
                if (i.getColor().equals("Red")) {
                    count1 += i.perimeter();
                }
            }
            return count1;
        }

        public static double calculateRedArea(Figure[] figures) {
            double count2 = 0;
            for (Figure i : figures) {
                if (i.getColor().equals("Red")) {
                    count2 += i.area();
                }
            }
            return count2;
        }
}
