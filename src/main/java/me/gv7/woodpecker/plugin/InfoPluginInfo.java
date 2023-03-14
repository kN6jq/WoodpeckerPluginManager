package me.gv7.woodpecker.plugin;

import me.gv7.woodpecker.plugin.infos.Info;

import java.util.ArrayList;
import java.util.List;

public class InfoPluginInfo implements InfoDetectorPlugin{
    public static InfoDetectorPluginCallbacks callbacks;
    public static IPluginHelper pluginHelper;

    @Override
    public void InfoDetectorPluginMain(InfoDetectorPluginCallbacks infoDetectorPluginCallbacks) {
        this.callbacks = infoDetectorPluginCallbacks;
        this.pluginHelper = infoDetectorPluginCallbacks.getPluginHelper();
        infoDetectorPluginCallbacks.setInfoDetectorPluginAuthor("Xm17");
        infoDetectorPluginCallbacks.setInfoDetectorPluginName("info插件");
        infoDetectorPluginCallbacks.setInfoDetectorPluginVersion("0.0.1");
        infoDetectorPluginCallbacks.setInfoDetectorPluginDescription("InfoPlugin");

        // 注册信息收集插件
        infoDetectorPluginCallbacks.registerInfoDetector(new ArrayList<InfoDetector>(){{
            add(new Info());
        }});

    }
}
