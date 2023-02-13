public class Dog {
    //properties
    private int age;
    private String name;
    private String color;

    //constructors
    public Dog(int userAge, String userName, String userColor) {
        age = userAge;
        name = userName;
        color = userColor;
    }

    public Dog() {

    }

    //methods
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void addOneAge(){
        age++;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        return "The dog is named " + name + " and is " + age + " years old. The dog is " + color + ".";
    }
}
