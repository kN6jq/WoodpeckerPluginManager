package me.gv7.woodpecker.plugin;

import me.gv7.woodpecker.plugin.exploits.Exploit;
import me.gv7.woodpecker.plugin.payloads.Payload;
import me.gv7.woodpecker.plugin.pocs.Poc;

import java.util.ArrayList;
import java.util.List;

public class VulPluginInfo implements IVulPlugin{
    public static IVulPluginCallbacks callbacks;
    public static IPluginHelper pluginHelper;

    @Override
    public void VulPluginMain(IVulPluginCallbacks iVulPluginCallbacks) {
        this.callbacks = iVulPluginCallbacks;
        this.pluginHelper = iVulPluginCallbacks.getPluginHelper();
        iVulPluginCallbacks.setVulPluginName("vul插件");
        iVulPluginCallbacks.setVulPluginAuthor("Xm17");
        iVulPluginCallbacks.setVulPluginVersion("0.0.1");
        iVulPluginCallbacks.setVulProduct("vul插件产品");
        iVulPluginCallbacks.setVulDescription("vul插件描述");


        // 注册漏洞利用插件
        iVulPluginCallbacks.registerExploit(new ArrayList<IExploit>(){{
            add(new Exploit());
        }});

        // 注册漏洞检测插件
        iVulPluginCallbacks.registerPoc(new Poc());

        // 注册payload生成插件
        iVulPluginCallbacks.registerPayloadGenerator(new ArrayList<IPayloadGenerator>(){{
            add(new Payload());
        }});
    }
}
