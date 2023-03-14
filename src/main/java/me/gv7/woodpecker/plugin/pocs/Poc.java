package me.gv7.woodpecker.plugin.pocs;

import me.gv7.woodpecker.plugin.*;

/**
 * 漏洞验证插件
 */
public class Poc implements IPoc {

    @Override
    public IScanResult doVerify(ITarget iTarget, IResultOutput iResultOutput) throws Throwable {
        String url =  iTarget.getAddress();
        iResultOutput.successPrintln("url: "+url);
        iResultOutput.successPrintln("漏洞验证成功");

        // 漏洞验证结果
        IScanResult scanResult = VulPluginInfo.pluginHelper.createScanResult();
        scanResult.setExists(true);
        
        return null;
    }
}
