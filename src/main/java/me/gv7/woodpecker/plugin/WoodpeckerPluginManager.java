package me.gv7.woodpecker.plugin;

public class WoodpeckerPluginManager implements IPluginManager{

    @Override
    public void registerPluginManagerCallbacks(IPluginManagerCallbacks iPluginManagerCallbacks) {
        // 注册漏洞利用面板信息
        final VulPluginInfo vulInfo = new VulPluginInfo();
        iPluginManagerCallbacks.registerVulPlugin(vulInfo);

        // 注册信息收集面板信息
        final InfoPluginInfo infoPlugin = new InfoPluginInfo();
        iPluginManagerCallbacks.registerInfoDetectorPlugin(infoPlugin);

        // 注册辅助插件面板信息
        final HelperPlugin helperPlugin = new HelperPlugin();
        iPluginManagerCallbacks.registerHelperPlugin(helperPlugin);

    }
}
