package org.neptunestation.calutron.commands;

import org.neptunestation.calutron.*;
import org.neptunestation.calutron.model.*;

public class SetUsername extends AbstractCommand {
    public SetUsername (CommandContext ctx, String commandString) {
        super(ctx, commandString);}
    @Override public void execute () {
        ((Calutron)getContext().getState()).setSetting("USERNAME", System.console().readLine("Username: "));}}
