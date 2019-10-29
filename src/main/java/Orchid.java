public class Orchid {
    String name;

    int cutOrchid;

    double species;

    Orchid(){

    }

    public Orchid(String name, int cutOrchid, double species) {
        this.name = name;
        this.cutOrchid = cutOrchid;
        this.species = species;
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
