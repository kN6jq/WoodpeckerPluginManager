package me.gv7.woodpecker.plugin;

public class WoodpeckerPluginManager implements IPluginManager{
    @Override
    public void registerPluginManagerCallbacks(IPluginManagerCallbacks iPluginManagerCallbacks) {

        // 注册漏洞利用面板信息
        final VulPluginInfo vulInfo = new VulPluginInfo();

        // 注册单个网站扫描面板
        final InfoPluginInfo infoPlugin = new InfoPluginInfo();

        iPluginManagerCallbacks.registerVulPlugin(vulInfo);
        iPluginManagerCallbacks.registerInfoDetectorPlugin(infoPlugin);
    }
}
