package me.gv7.woodpecker.plugin.infos;

import me.gv7.woodpecker.plugin.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 信息收集插件
 */
public class Info implements InfoDetector {

    @Override
    public String getInfoDetectorTabCaption() {
        return "info标签栏中的名称";
    }

    @Override
    public IArgsUsageBinder getInfoDetectorCustomArgs() {
        List<IArg> args = new ArrayList<>();
        final IArg command = InfoPluginInfo.pluginHelper.createArg();
        command.setName("command");
        command.setDefaultValue("whoami");
        command.setDescription("需要转换的命令");
        command.setRequired(true);
        command.setType(0);
        args.add(command);

        IArgsUsageBinder argsUsageBinder = InfoPluginInfo.pluginHelper.createArgsUsageBinder();
        argsUsageBinder.setArgsList(args);
        return argsUsageBinder;

    }

    @Override
    public LinkedHashMap<String, String> doDetect(ITarget iTarget, Map<String, Object> map, IResultOutput iResultOutput) throws Throwable {
        LinkedHashMap<String,String> infos = new LinkedHashMap<String, String>();
        String cmd = (String) map.get("command");
        iResultOutput.successPrintln("cmd: "+cmd);
        return infos;
    }
}
