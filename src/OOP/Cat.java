package OOP;

/**
 * Created by Admin on 13.06.2017.
 */
public class Cat {
        String color;
        String sex;
        String name;
        double weight;
        int year;

        public Cat(String color, String sex, String name, double weight, int year) {
            this.year = year;
            this.weight = weight;
            this.sex = sex;
            this.color = color;
            this.name = name;
        }

        public Cat() {

        }

        @Override
        public String toString() {
            return "Cat{" +
                    "color='" + color + '\'' +
                    ", sex='" + sex + '\'' +
                    ", name='" + name + '\'' +
                    ", weight=" + weight +
                    ", year=" + year +
                    '}';
        }

        public void may() {
            System.out.println("May-May");
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void print() {
            System.out.println("Color: " + color);
            System.out.printf("Year: " + year);
            System.out.println("Weight: " + weight);
            System.out.println("Sex: " + sex);
            System.out.println("Name: " + name);

        }
    }


