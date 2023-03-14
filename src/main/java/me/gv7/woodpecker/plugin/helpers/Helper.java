package me.gv7.woodpecker.plugin.helpers;

import me.gv7.woodpecker.plugin.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 辅助插件,用于生成payload
 */
public class Helper implements IHelper {
    @Override
    public String getHelperTabCaption() {
        return "helper标签栏中的名称";
    }

    @Override
    public IArgsUsageBinder getHelperCutomArgs() {
        List<IArg> args = new ArrayList<>();
        final IArg command = HelperPlugin.pluginHelper.createArg();
        command.setName("command");
        command.setDefaultValue("whoami");
        command.setDescription("需要转换的命令");
        command.setRequired(true);
        command.setType(0);
        args.add(command);

        IArgsUsageBinder argsUsageBinder = HelperPlugin.pluginHelper.createArgsUsageBinder();
        argsUsageBinder.setArgsList(args);
        return argsUsageBinder;
    }

    @Override
    public void doHelp(Map<String, Object> map, IResultOutput iResultOutput) throws Throwable {
        String cmd = (String) map.get("command");
        iResultOutput.successPrintln("cmd: "+cmd);
    }
}
