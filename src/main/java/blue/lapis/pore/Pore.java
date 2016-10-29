/*
 * Pore(RT)
 * Copyright (c) 2014-2016, Lapis <https://github.com/LapisBlue>
 * Copyright (c) 2014-2016, Contributors
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package blue.lapis.pore;

import static com.google.common.base.Preconditions.checkNotNull;

import blue.lapis.pore.event.PoreEventRegistry;
import blue.lapis.pore.impl.PoreServer;
import blue.lapis.pore.launch.PoreEventManager;
import blue.lapis.pore.lib.org.slf4j.bridge.SLF4JBridgeHandler;
import blue.lapis.pore.plugin.PorePluginContainer;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLoadOrder;
import org.slf4j.Logger;
import org.slf4j.helpers.NOPLogger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.game.state.GameAboutToStartServerEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartingServerEvent;
import org.spongepowered.api.event.game.state.GameStoppingServerEvent;
import org.spongepowered.api.plugin.PluginContainer;

/**
 * An implementation of the Bukkit API built on Sponge.
 *
 * @author Lapis Blue
 */
public final class Pore implements PoreEventManager {

    static Pore instance;

    private final Game game;
    private final Logger logger;
    private final PluginContainer plugin;

    private PoreServer server;

    @Inject
    public Pore(Game game, Logger logger, PluginContainer plugin) {
        Preconditions.checkState(instance == null, "Pore is already initialized");
        instance = this;

        this.game = checkNotNull(game, "game");
        this.logger = checkNotNull(logger, "logger");
        this.plugin = checkNotNull(plugin, "plugin");
    }

    public static Pore getInstance() {
        return checkNotNull(instance, "instance");
    }

    public static Game getGame() {
        return getInstance().game;
    }

    public static Logger getLogger() {
        return getInstance().logger;
    }

    public static PluginContainer getPlugin() {
        return getInstance().plugin;
    }

    public static PoreServer getServer() {
        return getInstance().server;
    }

    public static PluginContainer getPlugin(Plugin plugin) {
        return new PorePluginContainer(plugin);
    }

    @Override
    public void onPreInit(GamePreInitializationEvent event) throws Exception {
        // Initialize logging
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        logger.info("Loading Pore server, please wait...");

        server = new PoreServer(game, logger);
        PoreEventRegistry.register();

        server.getLogger().info("Loading plugins");
        server.loadPlugins();
    }

    @Override
    public void onAboutToStart(GameAboutToStartServerEvent event) throws Exception {
        server.enablePlugins(PluginLoadOrder.STARTUP);
    }

    @Override
    public void onStarting(GameStartingServerEvent event) throws Exception {
        server.enablePlugins(PluginLoadOrder.POSTWORLD);
    }

    @Override
    public void onShutdown(GameStoppingServerEvent event) throws Exception {
        logger.info("Disabling Bukkit plugins, please wait...");
        server.disablePlugins();
        logger.info("Finished disabling Bukkit plugins!");
    }

    static Logger testLogger = NOPLogger.NOP_LOGGER;

    public static Logger getTestLogger() {
        return testLogger;
    }

}
