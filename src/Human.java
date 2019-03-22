class Human implements Copyable {
    int age;
    String name;

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Human [age = " + age + ", name = " + name + "]";
    }

    public Object copy() {
        Human copy = new Human(this.age, this.name);
        return copy;
    }
}