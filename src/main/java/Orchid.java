public class Orchid {
    String name;

    int cutOrchid;

    double species;

    Orchid(){

    }
    public Orchid(String name) {
        this.name = name;
    }
    public Orchid(String name, int cutOrchid) {
        this.name = name;
        this.cutOrchid = cutOrchid;
    }

    public Orchid(String name, int cutOrchid, double species) {
        this.name = name;
        this.cutOrchid = cutOrchid;
        this.species = species;
    }
    public Orchid(int cutOrchid) {
        this.cutOrchid = cutOrchid;
    }
    public Orchid(int cutOrchid, String name) {
        this.cutOrchid = cutOrchid;
        this.name = name;
    }

    public Orchid(int cutOrchid, String name, double species) {
        this.cutOrchid = cutOrchid;
        this.name = name;
        this.species = species;
    }
    public Orchid(double species) {
        this.species = species;
    }
    public Orchid(double species, String name) {
        this.species = species;
        this.name = name;
    }
    public Orchid(double species, String name, int cutOrchid) {
        this.species = species;
        this.name = name;
        this.cutOrchid = cutOrchid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCutOrchid() {
        return cutOrchid;
    }

    public void setCutOrchid(int cutOrchid) {
        this.cutOrchid = cutOrchid;
    }

    public double getSpecies() {
        return species;
    }

    public void setSpecies(double species) {
        this.species = species;
    }
}
