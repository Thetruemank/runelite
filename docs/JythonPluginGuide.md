from net.runelite.client.plugins import Plugin, PluginDescriptor

@PluginDescriptor(
    name="My Jython Plugin",
    description="A simple Jython plugin."
)
class MyJythonPlugin(Plugin):
    def startUp(self):
        print("My Jython Plugin started!")

    def shutDown(self):
        print("My Jython Plugin stopped!")
```

## Using the Client's API from Jython
You can use the Runelite client's API from Jython just like you would from Java. Here is an example of how to get the client's player:

```python
from net.runelite.api import Client

class MyJythonPlugin(Plugin):
    def startUp(self):
        player = Client.getLocalPlayer()
        print("Player name: " + player.getName())
