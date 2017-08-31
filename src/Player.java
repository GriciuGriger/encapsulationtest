public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        System.out.println();
        if(this.health <=0){
            System.out.println("Player knocked out");
        }
    }

    public int healthRemainig(){
        return this.health;
    }
}
