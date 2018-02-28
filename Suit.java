public enum Suit {

    HEARTS("red heart"),
    CLUBS ("black clubs"),
    SPADES ("black spades"),
    DIAMONDS ("red diamonds");

    private final String description;

    Suit(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
