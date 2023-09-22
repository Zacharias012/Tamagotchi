import java.util.Scanner;

public class Owl {
    public Owl(int sleep, int dirt, int hunger) {
        this.sleep = sleep;
        this.dirt = dirt;
        this.hunger = hunger;
    }

    private int sleep;
    private int dirt;
    private int hunger;





    // ------------------------------------------
    //              Methoden
    // ------------------------------------------





    public void feeding() {
        hunger = hunger - 3;
        dirt++;
        sleep++;
        if (hunger <= -1) {
            hunger = 0;
        }
    }
    public void washing() {
        dirt = dirt - 3;
        hunger++;
        sleep++;
        if (dirt <= -1) {
            dirt = 0;
        }
    }
    public void sleeping() {
        sleep = sleep - 3;
        dirt++;
        hunger++;
        if (sleep <= -1) {
            sleep = 0;
        }
    }

    public void nothing() {
        sleep++;
        dirt++;
        hunger++;
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
        System.out.println("Feeding:1");
        System.out.println("Washing:2");
        System.out.println("Sleeping:3");
        System.out.println("Do nothing:4");
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






    // ------------------------------------------
    //          Methode für Animation
    // ------------------------------------------





    public int analyseStat() {

        //
        //########################### Status vergleichen => größte Zahl vom Status raussuchen => maybe mit array liste?
        //

    }


     public void animationSleep (int number) throws InterruptedException {

             printClearWindow();
             printSleepy();
             Thread.sleep(500);
             printClearWindow();
             printNormal();
             Thread.sleep(500);
     }


     public void animationHappy (int number) throws InterruptedException {

         printClearWindow();
         printHappy();
         Thread.sleep(500);
         printClearWindow();
         printNormal();
         Thread.sleep(500);
     }


     public void animationFeed () throws InterruptedException {

         printClearWindow();
         printHungry();
         Thread.sleep(500);
         printClearWindow();
         printNormal();
         Thread.sleep(500);
         printClearWindow();
         printHungry();
         Thread.sleep(500);
     }

     public void animationConfused () throws InterruptedException {

         printClearWindow();
         printConfused();
         Thread.sleep(500);
         printClearWindow();
         printNormal();
         Thread.sleep(500);
         printClearWindow();
         printConfused();
         Thread.sleep(500);
     }




    // ------------------------------------------
    //          ASCII Art
    // ------------------------------------------





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
        System.out.println("((ovo))");
        System.out.println("():::()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }

    public void printHappy() {

        // Happy
        System.out.println(" 0");
        System.out.println("  0");
        System.out.println("      0");
        System.out.println("     0");
        System.out.println(" ");
        System.out.println(" .^.^. ");
        System.out.println("((^v^))");
        System.out.println("():::()");
        System.out.println("  VVV  ");
        System.out.println(" ");
    }

    public void printSleepy() {

        // Sleep
        System.out.println("         z");
        System.out.println("      z");
        System.out.println("   z");
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