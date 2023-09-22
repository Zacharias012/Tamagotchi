public class Main {
    public static void main(String[] args) throws InterruptedException {

        Owl harald = new Owl(6,5,4);
        boolean isRunning = true;

        while (isRunning) {


            harald.printOwl();
            Input input = new Input();
            int inputNumb = input.getInput();


            if (inputNumb == 4) {
                harald.nothing();
                harald.animationConfused(number);
            }

            if (inputNumb == 3) {
                harald.sleeping();
                harald.analyseStat();
                harald.animationSleep(number);
            }

            if (inputNumb == 2) {
                harald.washing();
                harald.animationHappy(number);
            }

            if (inputNumb == 1) {
                harald.feeding();
                harald.animationFeed(number);
            }

            if (harald.getHunger() == 10 || harald.getDirt() == 10 || harald.getSleep() == 10) {
                harald.printGameOver();
                isRunning = false;
            }




        }    //try-catch string, only int Numbers!
    }
}