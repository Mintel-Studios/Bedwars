import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;
import utils.CommentedConfiguration;

import java.io.File;
import java.io.IOException;

class Bedwars extends JavaPlugin {

    public CommentedConfiguration configFile;

    public void OnEnable() {

        this.generateFiles();


        //Metrics metrics = new Metrics(this, "PROJECT ID");

    }

    public void generateFiles() {
        File file = new File(getDataFolder(), "config.yml");

        if(!file.exists()) saveResource("config.yml", false);

        configFile = CommentedConfiguration.loadConfiguration(file);
        try {
            configFile.syncWithConfig(file, getResource("config.yml"), "stupid_option"); //decorations
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
