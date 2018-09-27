package answers.designPatterns.commandPattern;

public class RemoteController {
    private TurnOnCommand turnOnCommand;
    private TurnOffCommand turnOffCommand;

    public RemoteController(TurnOnCommand turnOnCommand, TurnOffCommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void turnOn() {
        turnOnCommand.execute();
    }

    public void turnOff() {
        turnOffCommand.execute();
    }
}
