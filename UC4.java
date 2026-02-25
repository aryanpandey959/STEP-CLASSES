
public class UC4 {

    public static void main(String[] args) {

        // Create String array to store banner lines
        String[] bannerLines = {

            String.join(" ",
                    " ***** ", "  ***** ", "  ***** ", "  ***** "),

            String.join(" ",
                    "*     *", " *     *", " *     *", " *      "),

            String.join(" ",
                    "*     *", " *     *", " *     *", " *      "),

            String.join(" ",
                    "*     *", " *     *", " *****  ", "  ***** "),

            String.join(" ",
                    "*     *", " *     *", " *      ", "       *"),

            String.join(" ",
                    "*     *", " *     *", " *      ", "       *"),

            String.join(" ",
                    " ***** ", "  ***** ", " *      ", "  ***** ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}