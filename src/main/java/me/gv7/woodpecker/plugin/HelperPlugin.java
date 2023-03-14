package me.gv7.woodpecker.plugin;

import me.gv7.woodpecker.plugin.helpers.Helper;

import java.util.ArrayList;

public class HelperPlugin implements IHelperPlugin{
    public static IHelperPluginCallbacks callbacks;
    public static IPluginHelper pluginHelper;
    @Override
    public void HelperPluginMain(IHelperPluginCallbacks iHelperPluginCallbacks) {
        this.callbacks = iHelperPluginCallbacks;
        this.pluginHelper = iHelperPluginCallbacks.getPluginHelper();
        iHelperPluginCallbacks.setHelperPluginName("helper插件");
        iHelperPluginCallbacks.setHelperPluginAutor("Xm17");
        iHelperPluginCallbacks.setHelperPluginVersion("0.0.1");
        iHelperPluginCallbacks.setHelperPluginDescription("HelperPlugin");

        // 注册辅助插件
        iHelperPluginCallbacks.registerHelper(new ArrayList<IHelper>(){{
            add(new Helper());

        }});

    }
}
