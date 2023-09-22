public class Owl {
    public Owl(int sleep, int dirt, int hunger, int drunkenness) {
        this.sleep = sleep;
        this.dirt = dirt;
        this.hunger = hunger;
        this.drunkenness = drunkenness;
    }

    private int sleep;
    private int dirt;
    private int hunger;
    private int drunkenness;





    // ------------------------------------------
    //              Methoden
    // ------------------------------------------





    public void feeding() {
        hunger = hunger - 3;
        dirt++;
        sleep++;
        drunkenness--;
        if (hunger <= -1) {
            hunger = 0;
        }
    }
    public void washing() {
        dirt = dirt - 3;
        hunger++;
        sleep++;
        drunkenness--;
        if (dirt <= -1) {
            dirt = 0;
        }
    }
    public void sleeping() {
        sleep = sleep - 3;
        dirt++;
        hunger++;
        drunkenness--;
        if (sleep <= -1) {
            sleep = 0;
        }
    }

    public void nothing() {
        sleep++;
        dirt++;
        hunger++;
        drunkenness--;
    }

    public  void drink() {
        sleep--;
        dirt--;
        hunger--;
        drunkenness = drunkenness +2;
        if (sleep <= -1) {
            sleep = 0;
        }
        if (dirt <= -1) {
            dirt = 0;
        }
        if (hunger <= -1) {
            hunger = 0;
        }
    }


    public void printOwl() {
        printClearWindow();
        printActions();
        printNormal();
        printStats();
        printEnterNumb();
    }

    public void printEnterNumb() {
        System.out.println("");
        System.out.println("Enter Number:");
    }

    public void printClearWindow() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }
    }

    public void printActions() {
        System.out.println("Feeding:  [1]");
        System.out.println("Washing:  [2]");
        System.out.println("Sleeping: [3]");
        System.out.println("Do nothing: [4]");
        System.out.println("Drink beer: [5]");
        System.out.println("For Help:   [0](Zero)");
        System.out.println("Close Game: [8]");
    }

    public void printHelp() {
        printClearWindow();
        System.out.println("");
        System.out.println("Harald the Owl");
        System.out.println("Harald dies if you accumulate 10 points in the attributes HUNGER, DIRT and SLEEP");
        System.out.println("Harald is a real bavarian owl! So he always wants beer.");
        System.out.println("But don't let him get 10 points in DRUNKENNESS or 0 points!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 9 to continue...");

    }



    public void printGoodBye() {
        printClearWindow();
        System.out.println("Good Bye!");
        System.out.println("");
    }



    // ------------------------------------------
    //      Getter & Setter für Attribute
    // ------------------------------------------





    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }


    public int getSleep() {
        return sleep;
    }
    public void setSleep(int sleep) {
        this.sleep = sleep;
    }


    public int getDirt() {
        return dirt;
    }
    public void setDirt(int dirt) {
        this.dirt = dirt;
    }


    public int getDrunkenness() {
        return drunkenness;
    }
    public void setDrunkenness(int drunkenness) {
        this.drunkenness = drunkenness;
    }


    // ------------------------------------------
    //          Methode für Animation
    // ------------------------------------------





    public int analyseStat(int first) {

        int count = 1;

        for (int i = 0; i < count; i++) {
            int result1 = first / 2;


            if (result1 != 0) {
                count++;
                first = result1;
            }
        }
        return count;

    }





     public void animationSleep (int count) throws InterruptedException {
         for (int i = 0; i < count; i++) {

             printClearWindow();
             printSleepy();
             Thread.sleep(500);
             printClearWindow();
             printNormal();
             Thread.sleep(250);
             printClearWindow();
             printSleepy();
             Thread.sleep(500);

         }
     }


     public void animationHappy (int count) throws InterruptedException {
         for (int i = 0; i < count; i++) {

             printClearWindow();
             printHappy();
             Thread.sleep(500);
             printClearWindow();
             printNormal();
             Thread.sleep(250);
             printClearWindow();
             printHappy();
             Thread.sleep(500);
         }
     }


     public void animationFeed (int count) throws InterruptedException {
         for (int i = 0; i < count; i++) {

             printClearWindow();
             printHungry();
             Thread.sleep(500);
             printClearWindow();
             printNormal();
             Thread.sleep(250);
             printClearWindow();
             printHungry();
             Thread.sleep(500);
         }
     }

     public void animationConfused (int count) throws InterruptedException {
         for (int i = 0; i < count; i++) {

             printClearWindow();
             printConfused();
             Thread.sleep(500);
             printClearWindow();
             printNormal();
             Thread.sleep(250);
             printClearWindow();
             printConfused();
             Thread.sleep(500);
         }
     }

    public void animationDrink (int count) throws InterruptedException {
        for (int i = 0; i < count; i++) {

            printClearWindow();
            printDrink1();
            Thread.sleep(500);
            printClearWindow();
            printDrink2();
            Thread.sleep(500);
            printClearWindow();
            printNormal();
            Thread.sleep(250);
        }
    }



    // ------------------------------------------
    //          ASCII Art
    // ------------------------------------------


    public void printDrink1() {

        // Drink
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("             .~~~~.       ");
        System.out.println(" .^.^.       i====i_      ");
        System.out.println("((^O^))      |cccc|_)     ");
        System.out.println("():::()      |cccc|      ");
        System.out.println("  VVV        `-==-       ");
        System.out.println(" ");
    }


    public void printDrink2() {

        // Drink
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                 ___      ");
        System.out.println("              __|___|_.   ");
        System.out.println(" .^.^.       ° 0 0 0 0|   ");
        System.out.println("((^O^))      °________|   ");
        System.out.println("():::()                   ");
        System.out.println("  VVV   ");
        System.out.println(" ");
    }



    public void printConfused() {

        // Confused
        System.out.println(" ?");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("     ?");
        System.out.println(" ");
        System.out.println(" .^.^. ");
        System.out.println("((°vO))");
        System.out.println("():::()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }

    public void printNormal(){

        // Normal
        System.out.println(" ");
        System.out.println(" .^.^. ");
        System.out.println("((°v°))");
        System.out.println("():::()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }

    public void printHappy() {

        // Happy
        System.out.println(" ° 0");
        System.out.println(" °0");
        System.out.println("       °°");
        System.out.println("     ° 0");
        System.out.println(" ");
        System.out.println(" .^.^. ");
        System.out.println("((^v^))");
        System.out.println("():::()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }

    public void printSleepy() {

        // Sleep
        System.out.println("         Z");
        System.out.println("      z");
        System.out.println("   Z");
        System.out.println("     z");
        System.out.println(" ");
        System.out.println(" .-.-. ");
        System.out.println("((-v-))");
        System.out.println("()...()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }

    public void printHungry() {

        // Hunger
        System.out.println(" omnom");
        System.out.println(" ");
        System.out.println("   omnom");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" .´.´. ");
        System.out.println("((°O°))");
        System.out.println("():::()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }



    // ------------------------------------------
    //           Statusanzeige
    // ------------------------------------------



    public void printStats(){
        System.out.print("Sleep: " + sleep + " ");
        for (int i = 0; i < sleep; i++) {
            System.out.print("#");
        }
        System.out.println("");

        System.out.print("Dirt: " + dirt + " ");
        for (int i = 0; i < dirt; i++) {
            System.out.print("#");
        }
        System.out.println("");

        System.out.print("Hunger: " + hunger + " ");
        for (int i = 0; i < hunger; i++) {
            System.out.print("#");
        }
        System.out.println("");

        System.out.print("Drunkenness: " + drunkenness + " ");
        for (int i = 0; i < drunkenness; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }



    // ------------------------------------------
    //           GAME OVER
    // ------------------------------------------





    public void printGameOver() {

        printClearWindow();

        System.out.println("");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⢀⣤⣤⣤⣶⣶⣷⣤⣀ ");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣶⣶⣶⠀⠀⠀⠀⣠⣾⣿⣿⡇⠀⣿⣿⣿⣿⠿⠛⠉⠉⠀");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠀⠀⠀⢀⣿⣿⣶⡀⠀⠀⠀⠀⠀⣾⣿⣿⣿⡄⠀⢀⣴⣿⣿⣿⣿⠁⢸⣿⣿⣿⣀⣤⡀⠀⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⠀⣠⣴⣶⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⣼⣿⣿⣿⣧⠀⠀⠀⠀⢰⣿⣿⣿⣿⣇⣠⣿⣿⣿⣿⣿⡏⢠⣿⣿⣿⣿⣿⡿⠗⠂⠀⠀");
        System.out.println("    ⠀⠀⠀⣰⣾⣿⣿⠟⠛⠉⠉⠉⠉⠋⠀⠀⠀⣰⣿⣿⣿⣿⣿⣇⣠⣤⣤⣿⣿⣿⢿⣿⣿⣿⣿⢿⣿⣿⡿⠀⣼⣿⣿⡟⠉⠁⢀⣀⡄⠀⠀");
        System.out.println("    ⠀⢀⣾⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣴⣿⣿⣿⣿⡿⣿⣿⣿⡏⠈⢿⣿⣿⠏⣾⣿⣿⠃⢠⣿⣿⣿⣶⣶⣿⣿⣿⡷⠦⠀");
        System.out.println("    ⢠⣾⣿⡿⠀⠀⠀⣀⣠⣴⣶⣿⣿⡷⠀⣠⣿⣿⣿⣿⡿⠟⣿⣿⣿⣠⣿⣿⣿⠀⠀⠀⠀⠁⢸⣿⣿⡏⠀⣼⣿⣿⣿⠿⠛⠛⠉⠀⠀⠀⠀");
        System.out.println("    ⢸⣿⣿⠣⣴⣾⣿⣿⣿⣿⣿⣿⡿⠃⣰⣿⣿⣿⠋⠁⠀⠀⠸⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠸⠿⠿⠀⠀⠛⠛⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("    ⠸⣿⣿⣆⣉⣻⣭⣿⣿⣿⡿⠋⠀⠀⢿⣿⡿⠁⠀⠀⠀⠀⠀⠹⠟⠛⠛⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("    ⠀⠙⠿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣶⣶⣶⣶⣦⣄⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣷⠄⣤⣤⣤⣤⣶⣾⣷⣴⣿⣿⣿⣿⠿⠿⠛⣻⣿⣿⣷⡄");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣄⠀⣶⣶⣤⡀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠋⢠⣿⣿⣿⠿⠛⠋⠉⠛⣿⣿⣿⠏⢀⣤⣾⣿⣿⡿⠋⠀");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣾⣿⣿⣿⣿⠓⢹⣿⣿⣷⠀⠀⠀⠀⢀⣶⣿⡿⠁⠀⣾⣿⣿⣟⣠⣤⠀⠀⢸⣿⣿⣿⣾⣿⣿⣿⡟⠋⠀⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⡿⠛⠉⠸⣿⣦⡈⣿⣿⣿⡇⠀⠀⣰⣿⣿⡿⠁⠀⢸⣿⣿⣿⣿⣿⠿⠷⢀⣿⣿⣿⣿⡿⠛⣿⣿⣿⡀⠀⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⢀⣼⣿⣿⡿⠋⠀⠀⠀⠀⣿⣿⣧⠘⣿⣿⣿⡀⣼⣿⣿⡟⠀⠀⢀⣿⣿⣿⠋⠁⠀⣀⣀⣼⣿⣿⡟⠁⠀⠀⠘⣿⣿⣧⠀⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⣼⣿⣿⡟⠀⠀⠀⠀⠀⣠⣿⣿⣿⠀⢹⣿⣿⣿⣿⣿⡟⠀⠀⠀⣼⣿⣿⣷⣶⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠸⣿⣿⡆⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⢹⣿⣿⣇⠀⠀⢀⣠⣴⣿⣿⣿⡿⠀⠈⣿⣿⣿⣿⡟⠀⠀⠀⢰⣿⣿⣿⠿⠟⠛⠉⠁⠸⢿⡟⠀⠀⠀⠀⠀⠀⠀⠘⠋⠁⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⠈⢻⣿⣿⣿⣾⣿⣿⣿⣿⣿⠟⠁⠀⠀⠸⣿⣿⡿⠁⠀⠀⠀⠈⠙⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("    ⠀⠀⠀⠀⠀⠀⠉⠛⠿⠿⠿⠿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }




}