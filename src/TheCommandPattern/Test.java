package TheCommandPattern;

public class Test {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light light_1 = new Light();
        Light light_2 = new Light();

        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light_1);
        LightOffCommand lightOffCommand = new LightOffCommand(light_1);

        LightOnCommand lightOnCommand_1 = new LightOnCommand(light_2);
        LightOffCommand lightOffCommand_1 = new LightOffCommand(light_2);

        SteroOnWithCD steroOnWithCD = new SteroOnWithCD(stereo);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControl.setCommand(1,lightOnCommand_1,lightOffCommand_1);
        remoteControl.setCommand(2,steroOnWithCD,null);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);


    }
}
