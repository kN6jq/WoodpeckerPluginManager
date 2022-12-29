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
    public void VulPluginMain(IVulPluginCallbacks vulPluginCallbacks) {
        callbacks = vulPluginCallbacks;
        pluginHelper = vulPluginCallbacks.getPluginHelper();
        // 填写漏洞模块的信息
        callbacks.setVulPluginName("插件名称");
        callbacks.setVulPluginAuthor("Xm17");
        callbacks.setVulPluginVersion("0.0.1");
        callbacks.setVulName("漏洞名称");
        callbacks.setVulSeverity(vulPluginCallbacks.VUL_CATEGORY_RCE);
        callbacks.setVulProduct("产品");
        // 这里开始注册Exploit模块，Exploit模块的作用为对漏洞发起攻击
        List<IExploit> exploitList = new ArrayList<>();
        exploitList.add(new Exploit());
        callbacks.registerExploit(exploitList);

        // 注册Poc 做多个网址漏洞检测用
        callbacks.registerPoc(new Poc());

        // 注册Payload 模块的作用是exploit模块打不了，使用payload模块生成payload，然后进行手工利用
        List<IPayloadGenerator> payloads = new ArrayList<>();
        payloads.add(new Payload());
        callbacks.registerPayloadGenerator(payloads);
    }
}
