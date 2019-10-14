public class Human
{
    private Head head;
    private Torso torso;
    private Legs legs;

    public Human(){}    // Default constructor, don't touch!
    Human(Head head, Torso torso, Legs legs) // Blueprint
    {
        this.head = head;
        this.torso = torso;
        this.legs = legs;
    }

    @Override
    public String toString()
    {
        this.head.printStars();
        this.torso.printStars();
        this.legs.printStars();
        return "You should not see this line.";
    }

}