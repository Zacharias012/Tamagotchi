public class Main {
    public static void main(String[] args) throws InterruptedException {

        Owl harald = new Owl(8, 6, 4, 5);
        boolean isRunning = true;


        while (isRunning) {


            harald.printOwl();
            Input input = new Input();
            int inputNumb = input.getInput();

            if (inputNumb == 8){
                harald.printHelp();
                isRunning = input.getInput() == 9;
                harald.printClearWindow();
            }

            if (inputNumb == 0){
                harald.printGoodBye();
                isRunning = false;
            }

            if (inputNumb == 5) {
                harald.drink();
                harald.animationDrink(harald.analyseStat(harald.getDrunkenness()));
            }

            if (inputNumb == 4) {
                harald.nothing();
                harald.animationConfused(harald.analyseStat(1));
            }

            if (inputNumb == 3) {
                harald.sleeping();
                harald.animationSleep(harald.analyseStat(harald.getSleep()));
            }

            if (inputNumb == 2) {
                harald.washing();
                harald.animationHappy(harald.analyseStat(harald.getDirt()));
            }

            if (inputNumb == 1) {
                harald.feeding();
                harald.animationFeed(harald.analyseStat(harald.getHunger()));
            }

            if (harald.getHunger() == 10 || harald.getDirt() == 10 || harald.getSleep() == 10 || harald.getDrunkenness() == 10 || harald.getDrunkenness() == 0) {
                harald.printGameOver();
                isRunning = false;
            }




        }

        //try-catch string, only int Numbers!
    }



}