public class Head
{
    private String[][] stars = {{"*", "*", "*", "*", "*"},
                                {"*", "O", "_", "O", "*"},
                                {"*", "*", "*", "*", "*"}};
    Head(){}

    Head(String[][] stars)
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
