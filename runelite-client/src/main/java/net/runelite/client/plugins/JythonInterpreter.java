import org.python.util.PythonInterpreter;
import net.runelite.client.RuneLite;

public class JythonInterpreter {
    private PythonInterpreter interpreter;

    public JythonInterpreter() {
        this.interpreter = new PythonInterpreter();
    }

    public void executeScript(String script) {
        this.interpreter.exec(script);
    }

    public void exposeAPI() {
        this.interpreter.set("client", RuneLite.getClient());
        // Add more API objects as needed
    }
}
