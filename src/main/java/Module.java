import de.dseelp.discordsystem.api.Discord;
import de.dseelp.discordsystem.api.modules.NewModule;
import de.dseelp.discordsystem.utils.console.ConsoleSystem;
import de.dseelp.discordsystem.utils.console.logging.LogSystem;
import net.dv8tion.jda.api.sharding.ShardManager;

@NewModule(description = "Soko Module" , version = "1.0" , authors = "PolyMars", name = "Soko Module")
public class Module extends de.dseelp.discordsystem.api.modules.Module {

   public static  ShardManager SM = Discord.getBot().getShardManager();
    @Override
    public void onEnable() {


     System.out.println("[SOKO] Module Startet!");

    }

    @Override
    public void onDisable() {


     System.out.println("[SOKO] Module is now Off!");
    }
}
