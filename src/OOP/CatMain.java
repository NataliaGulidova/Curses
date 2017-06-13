package OOP;

/**
 * Created by Admin on 13.06.2017.
 */
public class CatMain {
    public static class MainCat {
        public static void main(String[] args) {
            Cat CatOne = new Cat ();
            CatOne.setColor("Grey");
            CatOne.setName("Trexi");
            CatOne.setSex("Female");
            CatOne.setWeight(5);
            CatOne.setYear(3);
            CatOne.may();
            CatOne.print();

            Cat CatTwo = new Cat("White", "male", "Bingo", 7, 5);
            CatTwo.print();
        }
    }
}
