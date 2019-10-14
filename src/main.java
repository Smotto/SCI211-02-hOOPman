public class main
{
    public static void main(String[] args)
    {
        // User input.

        // Create objects.
        Head headObject = new Head();
        Torso torsoObject = new Torso();
        Legs legsObject = new Legs();
        Human humanObject = new Human(headObject, torsoObject, legsObject);

        // Print out objects.
        humanObject.toString();
    }
}
