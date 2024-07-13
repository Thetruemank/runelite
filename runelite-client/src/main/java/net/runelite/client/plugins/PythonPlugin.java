package net.runelite.client.plugins;

import org.python.util.PythonInterpreter;

public class PythonPlugin extends Plugin
{
    private final String script;

    public PythonPlugin(String script)
    {
        this.script = script;
    }

    @Override
    protected void startUp() throws Exception
    {
        try (PythonInterpreter pyInterp = new PythonInterpreter())
        {
            pyInterp.execfile(script);
        }
    }

    @Override
    protected void shutDown() throws Exception
    {
        // Implement any necessary shutdown logic for the Python plugin
    }
}
