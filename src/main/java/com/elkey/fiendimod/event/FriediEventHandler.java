package com.elkey.fiendimod.event;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class FriediEventHandler {

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event){
        System.out.println("LOGGED!!!!!!!");
        //Minecraft.getInstance().player.displayClientMessage(Component.literal("HELLOAAAA!!"), true);

    }


}
