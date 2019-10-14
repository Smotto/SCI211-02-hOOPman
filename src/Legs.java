public class Legs
{
    private String[][] stars = {{"*", "*", "*"},
                                {"*", " ", "*"},
                                {"*", " ", "*"},
                                {"*", " ", "*"}};
    Legs(){}

    Legs(String[][] stars)
    {
        this.stars = stars;
    }

    public void printStars()
    {
        for (String[] row: stars)
        {
            for (String star: row)
            {
                System.out.print(star + " ");
            }
            System.out.println();
        }
    }
}
