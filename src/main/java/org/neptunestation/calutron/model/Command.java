package org.neptunestation.calutron.model;

public interface Command {
    String[] getArguments(String... tokens);
    Command getCommand (String... tokens);
    void setContext (CommandContext ctx);
    CommandContext getContext ();
    CommandSet getCommands ();
    void addCommands (Command... commands);
    boolean acceptsCommandString (String command);
    void setCalutronModel (CalutronModel calutronModel);
    CalutronModel getCalutronModel ();
    String getCommandString ();
    String[] getCommandTokens ();
    void setCommandString (String command);
    void execute ();
    void execute (String... args);}
