package assignments.lab_5.skeleton.command;

import assignments.lab_5.skeleton.command.commands.NoCommand;

import java.util.Arrays;
import java.util.Stack;

public class CommandControl {

    private Command[] doCommands;
    private Stack<Command> undoCommands, redoCommands;

    public CommandControl() {
        doCommands = new Command[3];
        undoCommands = new Stack<>();
        redoCommands = new Stack<>();

        Command noCommand = new NoCommand();
        Arrays.fill(doCommands, noCommand);
    }

    public void setDoCommand( int slot,Command doCommand){
        doCommands[slot] = doCommand;
    }

    public void executeDoCommand(int slot){
        doCommands[slot].execute();
        undoCommands.push(doCommands[slot]);
    }

    public void redoCommand(){

    }

    public void undoCommand(){

    }
}
