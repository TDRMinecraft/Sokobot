import com.vdurmont.emoji.EmojiManager;
import de.dseelp.discordsystem.api.commands.Command;
import de.dseelp.discordsystem.api.commands.CommandSender;
import de.dseelp.discordsystem.api.commands.CommandType;

public class PlayCommand extends Command {

    public PlayCommand() {
        super(null, "Play", CommandType.DISCORD_GUILD , "playSoko", "startGame", "Soko" );
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings, Command command) {
        Game.run





    }
}
