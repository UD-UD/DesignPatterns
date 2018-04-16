package TheCommandPattern;

public class SteroOnWithCD implements Command {

    Stereo stereo ;

    public SteroOnWithCD(Stereo streo) {
        this.stereo = streo;
    }

    @Override
    public void exceute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(2);
    }
}
