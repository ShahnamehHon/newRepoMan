public class Orchidaceae {
    public static void main(String[] args) {
        // First ver. First opt. //
        Orchid orchid_1 = new Orchid();
        orchid_1.setName("Dactylorhiza sambucina");
        orchid_1.setCutOrchid(3);
        orchid_1.setSpecies(18);
        String print_1 = orchid_1.getName();
        int print_2 = orchid_1.getCutOrchid();
        double print_3 = orchid_1.getSpecies();
        System.out.println(print_1 + "\n" + print_2 + "\n" + print_3);
        //Second ver. Second opt
        Orchid orchid_2 = new Orchid();
        orchid_2.name = "Brassolaeliocattleya";
        orchid_2.cutOrchid = 2;
        orchid_2.species = 2;
        String print_4 = orchid_2.getName();
        int print_5 = orchid_2.getCutOrchid();
        double print_6 = orchid_2.getSpecies();
        System.out.println(print_4 + "\n" + print_5 + " weeks" + "\n" + print_6);
        //Orchid ver. Third opt
        Orchid orchid_3 = new Orchid("Ophrys apifera ", 4, 3);
        String print_7 = orchid_3.getName();
        int print_8 = orchid_3.getCutOrchid();
        double print_9 = orchid_3.getSpecies();
        System.out.println("Orchid: " + print_7 + "\n" + "Lifespan of cut flower: " + print_8 + " weeks" + "\n" + "Species " + print_9);
    }
}