public class Human {
    String name;
    int age;
    int height ;
    int weight;

    public void setParameters(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void tellAboutYourself(){
        System.out.println("Я человек ");
        System.out.println("И меня завут: " + this.name);
        System.out.println("Мой возраст: " + this.age);
        System.out.println("Мой рост: " + this.height);
        System.out.println("Мой вес: " + this.weight);
    }
}
