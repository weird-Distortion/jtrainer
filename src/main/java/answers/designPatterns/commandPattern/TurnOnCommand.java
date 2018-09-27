package answers.designPatterns.commandPattern;

public class TurnOnCommand implements CommandInterface {

    private Lamp lamp;

    public TurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.on();
    }

    @Override
    public void unexecute() {
        lamp.off();
    }
}
