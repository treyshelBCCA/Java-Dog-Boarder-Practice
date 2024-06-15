
class Dog {
    private String name;
    private String breed;
    private String ownerName;

    public Dog(String name, String breed, String ownerName) {
        this.name = name;
        this.breed = breed;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "', ownerName='" + ownerName + "'}";
    }
}