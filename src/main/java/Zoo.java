public class Zoo {
    public static void main(String[] args) {
        Panda myZoo = new Panda();
        myZoo.setName("Ailuropoda melanoleuca");
        String printName = myZoo.getName();
        myZoo.setAge(8);
        int printAge = myZoo.getAge();
        myZoo.setWeight(285.05);
        double printWeight = myZoo.getWeight();
        System.out.println("Scientific name: " + printName + "\n" + "Age: " + printAge  + "\n" + "Weight: " + printWeight);

    }
}
