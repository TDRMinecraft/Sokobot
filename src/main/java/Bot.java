import com.sun.org.apache.xpath.internal.operations.Mod;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.sharding.ShardManager;

import javax.security.auth.login.LoginException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class Bot {
    static HashMap<Long, String> prefixes = new HashMap<>();

    private static ShardManager shardManager = Module.SM;

    public static ShardManager getShardManager() {
        return shardManager;
    }


}