public class Main {
    public static void main(String[] args) throws InterruptedException {

        Owl harald = new Owl(9, 5, 4);
        boolean isRunning = true;


        while (isRunning) {


            harald.printOwl();
            Input input = new Input();
            int inputNumb = input.getInput();


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

            if (harald.getHunger() == 10 || harald.getDirt() == 10 || harald.getSleep() == 10) {
                harald.printGameOver();
                isRunning = false;
            }




        }    //try-catch string, only int Numbers!
    }



}