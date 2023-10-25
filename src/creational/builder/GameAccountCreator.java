package creational.builder;

public class GameAccountCreator {

    public static void main(String[] args) {
        User warrior = new User.Builder("Warrior123", "swordfish")
                .avatar("Warrior Avatar")
                .tagline("Ready for battle!")
                .build();

        User mage = new User.Builder("Mage456", "spellbook")
                .themeSong("Magic Melody")
                .build();

        User helio = new User.Builder("Helio999", "helioHero")
                .build();
    }
}
