package TheCommandPattern;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void exceute() {
        light.off();
    }
}
