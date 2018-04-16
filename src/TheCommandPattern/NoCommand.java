package TheCommandPattern;

public class NoCommand implements Command {
    @Override
    public void exceute() {
        System.out.println("Nothing to run");
    }
}
