package tfar.xlpackets.mixin;

import net.minecraft.server.network.packet.CustomPayloadC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CustomPayloadC2SPacket.class)
public abstract class CustomPayloadC2CPacketMixin {
    @ModifyConstant(method = "read", constant = @Constant(intValue = 32767))
    private int xlPackets(int old) {
        return 2000000000;
    }
}
