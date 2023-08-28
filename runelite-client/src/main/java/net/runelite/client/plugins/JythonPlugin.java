package net.runelite.client.plugins;

import org.python.util.PythonInterpreter;
import org.python.core.PyObject;

public class JythonPlugin extends Plugin
{
	private PyObject jythonObject;

	public JythonPlugin(PyObject jythonObject)
	{
		this.jythonObject = jythonObject;
	}

	@Override
	protected void startUp() throws Exception
	{
		PyObject startUpMethod = jythonObject.__getattr__("startUp");
		startUpMethod.__call__();
	}

	@Override
	protected void shutDown() throws Exception
	{
		PyObject shutDownMethod = jythonObject.__getattr__("shutDown");
		shutDownMethod.__call__();
	}

	@Override
	public void resetConfiguration()
	{
		PyObject resetConfigurationMethod = jythonObject.__getattr__("resetConfiguration");
		resetConfigurationMethod.__call__();
	}
}
