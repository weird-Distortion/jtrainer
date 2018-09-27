package answers.designPatterns.commandPattern;

public class CommandSimulator {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        RemoteController controller = new RemoteController(new TurnOnCommand(lamp), new TurnOffCommand(lamp));
        controller.turnOn();
        System.out.println(lamp.isOn());
        controller.turnOff();
        System.out.println(lamp.isOn());
    }
}
