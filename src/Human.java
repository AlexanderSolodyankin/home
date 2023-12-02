public class Human {
    private String heard;
    private String name;
    private int age;
    private int height;
    private int weight;

//    public Human() {
//    }

//    public Human(String name, int age, int height, int weight, String heard){
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//        this.heard = heard;
//    }
//public Human( String heard){
//    this.heard = heard;
//    this.height = 25;
//    this.weight = 3;
//}

//    public void setParameters(String name, int age, int height, int weight) {
//        this.name = name;
//        this.age = age;
//        this.height = height;
//        this.weight = weight;
//
//
//    }
//
//    public void tellAboutYourself() {
//        System.out.println("Я человек ");
//        System.out.println("И меня зовут: " + this.name);
//        System.out.println("Мой возраст: " + this.age);
//        System.out.println("Мой рост: " + this.height);
//        System.out.println("Мой вес: " + this.weight);
//        System.out.println("Мои органы : " + this.heard);
//    }


    public String getHeard() {
        return heard;
    }

    public void setHeard(String heard) {
        this.heard = heard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
