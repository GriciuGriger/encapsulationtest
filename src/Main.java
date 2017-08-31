public class Main {
    public static void main(String[] args) {
      /* Player player = new Player();
        player.fullName = "Tim";
        player.health = 20 ;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = "+player.healthRemainig());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remainig health = "+player.healthRemainig());
        */

      EnhancedPlayer player = new EnhancedPlayer("Tim", 500, "Sword");
        System.out.println("Initial health is "+ player.getHealth());
    }
}
