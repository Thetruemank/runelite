# RuneLite Class

The 'RuneLite' class is the main class of the RuneLite project. It is responsible for initializing the application and managing its main functionalities.

## Methods and Fields

Here are the methods and fields in the 'RuneLite' class:

* `RUNELITE_DIR`: This field represents the directory where RuneLite's data is stored.
* `CACHE_DIR`: This field represents the directory where RuneLite's cache data is stored.
* `PLUGINS_DIR`: This field represents the directory where RuneLite's plugins are stored.
* `SCREENSHOT_DIR`: This field represents the directory where RuneLite's screenshots are stored.
* `LOGS_DIR`: This field represents the directory where RuneLite's logs are stored.
* `DEFAULT_SESSION_FILE`: This field represents the default session file of RuneLite.
* `injector`: This field is an instance of the Injector class, which is used for dependency injection.
* `pluginManager`: This field is an instance of the PluginManager class, which is used for managing plugins.
* `externalPluginManager`: This field is an instance of the ExternalPluginManager class, which is used for managing external plugins.
* `eventBus`: This field is an instance of the EventBus class, which is used for event handling.
* `configManager`: This field is an instance of the ConfigManager class, which is used for managing configurations.
* `sessionManager`: This field is an instance of the SessionManager class, which is used for managing sessions.
* `discordService`: This field is an instance of the DiscordService class, which is used for managing Discord integration.
* `clientSessionManager`: This field is an instance of the ClientSessionManager class, which is used for managing client sessions.
* `clientUI`: This field is an instance of the ClientUI class, which is used for managing the user interface.
* `overlayManager`: This field is an instance of the OverlayManager class, which is used for managing overlays.
* `tooltipOverlay`: This field is an instance of the TooltipOverlay class, which is used for managing tooltips.
* `worldMapOverlay`: This field is an instance of the WorldMapOverlay class, which is used for managing the world map overlay.
* `applet`: This field is an instance of the Applet class, which is used for managing the applet.
* `client`: This field is an instance of the Client class, which is used for managing the client.
* `runtimeConfig`: This field is an instance of the RuntimeConfig class, which is used for managing the runtime configuration.
* `telemetryClient`: This field is an instance of the TelemetryClient class, which is used for managing telemetry.

## Method and Field Descriptions

Here are the detailed descriptions of the methods and fields in the 'RuneLite' class:

* `RUNELITE_DIR`: This directory is where RuneLite's data is stored. It is usually located in the user's home directory.
* `CACHE_DIR`: This directory is where RuneLite's cache data is stored. It is a subdirectory of the `RUNELITE_DIR`.
* `PLUGINS_DIR`: This directory is where RuneLite's plugins are stored. It is a subdirectory of the `RUNELITE_DIR`.
* `SCREENSHOT_DIR`: This directory is where RuneLite's screenshots are stored. It is a subdirectory of the `RUNELITE_DIR`.
* `LOGS_DIR`: This directory is where RuneLite's logs are stored. It is a subdirectory of the `RUNELITE_DIR`.
* `DEFAULT_SESSION_FILE`: This is the default session file of RuneLite. It is located in the `RUNELITE_DIR`.
* `injector`: This is an instance of the Injector class, which is used for dependency injection. It is used to inject dependencies into the 'RuneLite' class.
* `pluginManager`: This is an instance of the PluginManager class, which is used for managing plugins. It is responsible for loading, unloading, and managing the lifecycle of plugins.
* `externalPluginManager`: This is an instance of the ExternalPluginManager class, which is used for managing external plugins. It is responsible for loading, unloading, and managing the lifecycle of external plugins.
* `eventBus`: This is an instance of the EventBus class, which is used for event handling. It is responsible for dispatching events to registered listeners.
* `configManager`: This is an instance of the ConfigManager class, which is used for managing configurations. It is responsible for loading, saving, and managing configurations.
* `sessionManager`: This is an instance of the SessionManager class, which is used for managing sessions. It is responsible for creating, destroying, and managing sessions.
* `discordService`: This is an instance of the DiscordService class, which is used for managing Discord integration. It is responsible for connecting to Discord, updating the user's status, and managing Discord events.
* `clientSessionManager`: This is an instance of the ClientSessionManager class, which is used for managing client sessions. It is responsible for creating, destroying, and managing client sessions.
* `clientUI`: This is an instance of the ClientUI class, which is used for managing the user interface. It is responsible for creating, updating, and managing the user interface.
* `overlayManager`: This is an instance of the OverlayManager class, which is used for managing overlays. It is responsible for creating, updating, and managing overlays.
* `tooltipOverlay`: This is an instance of the TooltipOverlay class, which is used for managing tooltips. It is responsible for creating, updating, and managing tooltips.
* `worldMapOverlay`: This is an instance of the WorldMapOverlay class, which is used for managing the world map overlay. It is responsible for creating, updating, and managing the world map overlay.
* `applet`: This is an instance of the Applet class, which is used for managing the applet. It is responsible for creating, updating, and managing the applet.
* `client`: This is an instance of the Client class, which is used for managing the client. It is responsible for creating, updating, and managing the client.
* `runtimeConfig`: This is an instance of the RuntimeConfig class, which is used for managing the runtime configuration. It is responsible for loading, saving, and managing the runtime configuration.
* `telemetryClient`: This is an instance of the TelemetryClient class, which is used for managing telemetry. It is responsible for sending telemetry data to the telemetry server.
