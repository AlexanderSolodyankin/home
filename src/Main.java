
public class Main {
    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[0] = new Human();
        humans[0].setParameters("Абдиль", 18, 170, 65);
        humans[1] = new Human();
        humans[1].setParameters("Мама", 53, 170, 45);
        humans[2] = new Human();
        humans[2].setParameters("Папа", 60, 175, 90);
        humans[3] = new Human();
        humans[3].setParameters("Захадин", 27, 170, 80);
        humans[4] = new Human();
        humans[4].setParameters("Саид", 25, 165, 60);

        Home home = new Home();
        home.humans = humans;
        home.address = "Город бишкек улица 7-й Микрорайон до 23/1";
        home.rooms = 5;

        home.tellWhoLivesInTheHouse();


    }
}