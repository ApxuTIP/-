public class Program {
    public static void main(String[] args) throws ParseException {
        View view = new View(new Controller(new PetCreator(), new PetRepository(new ArrayList())), new Dialog());
        View view = new View(new Controller(new PetCreator(), new PetRepository(new ArrayList())), new Dialog(), new Counter());
        try {
            view.start();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
