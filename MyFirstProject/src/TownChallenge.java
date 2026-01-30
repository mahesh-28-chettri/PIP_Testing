import java.util.Random;
public class TownChallenge {

    public static void main(String[] args) {

        String[] towns = { "Jumla", "Humla", "Mugu", "Dolpa", "Jajarkot", "Surkhet", "Nepaljun", "Kalikot"};

        Random random = new Random();
        int homescore, awayscore;

        homescore = random.nextInt(10);
        awayscore = random.nextInt(10);
        System.out.println(towns[0] + " " + homescore + " " +
                towns[1] + " " + awayscore);

        homescore = random.nextInt(10);
        awayscore = random.nextInt(10);
        System.out.println(towns[2] + " " + homescore + " " +
                towns[3] + " " + awayscore);

        homescore = random.nextInt(10);
        awayscore = random.nextInt(10);
        System.out.println(towns[4] + " " + homescore + " " +
                towns[5] + " " + awayscore);

        homescore = random.nextInt(10);
        awayscore = random.nextInt(10);
        System.out.println(towns[6] + " " + homescore + " " +
                towns[7] + " " + awayscore);

    }
}
