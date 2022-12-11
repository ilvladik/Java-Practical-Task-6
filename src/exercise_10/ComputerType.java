package exercise_10;

public enum ComputerType {

    ProDesk("Intel Core i5", "P22v G4", "8 RAM 1,25 TB ROM"),
    G4("Intel Core i5", "P22v G4", "8 RAM 0,25 TB ROM");

    private final String processor;
    private final String monitor;
    private final String memory;

    ComputerType(String processor, String monitor, String memory) {
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getMemory() {
        return memory;
    }
}
