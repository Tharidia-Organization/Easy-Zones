package com.THproject.tharidia_things;

import com.THproject.tharidia_things.network.ZoneMusicPacket;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@Mod(TharidiaThings.MODID)
public class TharidiaThings {
    public static final String MODID = "tharidiathings";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TharidiaThings(IEventBus modEventBus, ModContainer modContainer) {
        // Register network packets
        modEventBus.addListener(this::registerPayloads);
        
        LOGGER.info("Tharidia Things - Zone Music System Loaded");
    }
    
    private void registerPayloads(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("1");
        registrar.playToClient(
            ZoneMusicPacket.TYPE,
            ZoneMusicPacket.STREAM_CODEC,
            (packet, context) -> packet.handle(context)
        );
    }
}
