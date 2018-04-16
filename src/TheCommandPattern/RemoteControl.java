package TheCommandPattern;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand =  new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].exceute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].exceute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("RemoteControl{" +
                    "onCommand=" + onCommands[i].getClass().getName() +
                    ", offCommands=" + offCommands[i].getClass().getName() +
                    '}' + "\n");
        }
        return stringBuffer.toString();
    }
}
