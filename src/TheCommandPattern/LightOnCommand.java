package TheCommandPattern;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void exceute() {
        light.on();
    }
}