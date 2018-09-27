package answers.designPatterns.commandPattern;

public class TurnOffCommand implements CommandInterface {

    private Lamp lamp;

    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.off();
    }

    @Override
    public void unexecute() {
        lamp.on();
    }
}
