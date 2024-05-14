import java.util.Scanner;

public class JavaPediaTwo {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);

        System.out.println("*********JAVAPEDIA*********");

        System.out.println("Hello, How many Anime would you like to list?");

        int anime = Scan.nextInt();

        String[][] dataBase = new String[anime][5];

        Scan.nextLine();

        for (int x = 0; x < dataBase.length; x++) {
            
            System.out.println("Anime: " + (x + 1));

            System.out.println("\tName: ");
            dataBase[x][0] = Scan.nextLine();

            System.out.println("\tYear of release: ");
            dataBase[x][1] = Scan.nextLine();

            System.out.println("\tAnime genre: ");
            dataBase[x][2] = Scan.nextLine();

            System.out.println("\tEpisodes: ");
            dataBase[x][3] = Scan.nextLine();

            System.out.println("\tRun time per episode: ");
            dataBase[x][4] = Scan.nextLine();

        }

        while (true) {
            System.out.println("What Anime would you like information on? (Type 'exit' to quit)");
            String name = Scan.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            boolean found = false;
            for (int y = 0; y < dataBase.length; y++) {
                if (dataBase[y][0].equalsIgnoreCase(name)) {
                    System.out.println("\tName: " + dataBase[y][0]);
                    System.out.println("\tYear of release: " + dataBase[y][1]);
                    System.out.println("\tAnime Genre: " + dataBase[y][2]);
                    System.out.println("\tEpisodes: " + dataBase[y][3]);
                    System.out.println("\tRun time per episode: " + dataBase[y][4]);
                    found = true;
                    break; // Stop searching once found
                }
            }

            if (!found) {
                System.out.println("Anime not found.");
            }
        }

        System.out.println("\nThese are the Anime available.");
        printArray(dataBase);
        
        Scan.close();
    }
 
    public static void printArray(String[][] array) {
        for (int x = 0; x < array.length; x++) {
            System.out.println("\n");

            for (int y = 0; y < array[x].length; y++) {
                System.out.println(array[x][y] + " ");
            }
        }
    }
}