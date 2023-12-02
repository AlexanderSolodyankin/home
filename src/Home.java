public class Home {
    Human[] humans;
    String address;
    int rooms;

    public void checkInHumans(Human[] humans){
        this.humans = humans;
    }
    public void tellWhoLivesInTheHouse(){
        System.out.println("В доме живут: " + humans.length + " человек");
        for (int i = 0; i < humans.length; i++) {
            System.out.println("=============================");
            humans[i].tellAboutYourself();
            System.out.println("==============================");
        }
    }

}
