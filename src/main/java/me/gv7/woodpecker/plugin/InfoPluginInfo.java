package me.gv7.woodpecker.plugin;

import me.gv7.woodpecker.plugin.infos.Info;

import java.util.ArrayList;
import java.util.List;

public class InfoPluginInfo implements InfoDetectorPlugin{



    // 信息探测接口，插件通过实现该接口，可实现对目标全方位信息探测。
    @Override
    public void InfoDetectorPluginMain(InfoDetectorPluginCallbacks callbacks) {

        callbacks.setInfoDetectorPluginAuthor("Xm17");
        callbacks.setInfoDetectorPluginName("插件名称");
        callbacks.setInfoDetectorPluginVersion("v0.1.0");
        callbacks.setInfoDetectorPluginDescription("插件描述");

        List<InfoDetector> infoDetectors = new ArrayList<>();


        //注册单个网站的url扫描接口
        infoDetectors.add(new Info());

        callbacks.registerInfoDetector(infoDetectors);
    }
}
