package metodyIKonstruktory;

public class ComputerStore {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Intel", 2048);
//        computer1.processor = "IntelCore i5";
//        computer1.memory = 2000;

        Computer computer2 = new Computer("AMD", 3072);
//        computer2.processor = "IntelCore i7";
//        computer2.memory = 3000;

//    ComputerFactory computerFactory = new ComputerFactory();
//    Computer computer1 = computerFactory.create("Intel i5", 1024);
//    Computer computer2 = computerFactory.create("AMD", 2028);
//    computerFactory.create("Intel i5", 1024);
//    computerFactory.create("AMD", 2048);


        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(computer2,4000);


        computer1.printInfo();
        computer2.printInfo();
    }
}
