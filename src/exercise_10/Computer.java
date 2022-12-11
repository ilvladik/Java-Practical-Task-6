package exercise_10;

import java.util.Scanner;

public class Computer implements Inputable {

    private String model;
    private ComputerType cType = null;

    @Override
    public String toString() {
        return "Computer ("
                + " processor = " + cType.getProcessor()
                + ", monitor = " + cType.getMonitor()
                + ", memory = " + cType.getMemory() + " )";
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Новый компьтер");
        System.out.print("Выберите модель компьютера: ProDesk or G4: ");

        model = scanner.next();
        switch (model) {
            case "ProDesk":
                cType = ComputerType.ProDesk;
                break;
            case "G4":
                cType = ComputerType.G4;
                break;
        }
    }

    public String getModel() {
        return model;
    }
}
