public class Level1q5 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;

        int perStudent = pens / students;       // equal distribution
        int remaining = pens % students;        // leftover pens

        System.out.println("The Pen Per Student is " + perStudent +
                           " and the remaining pen not distributed is " + remaining);
    }
}