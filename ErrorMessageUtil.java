package cn.studyou.baselibrary.utils;

import android.content.Context;

/**
 * 基本功能：错误信息反馈信息
 * 创建：王杰
 * 创建时间：16/3/11
 * 邮箱：w489657152@gmail.com
 */
public class ErrorMessageUtil {
    public  static String printErrorMessage(Context context,String methodName ,String errorMessage){
        return "\n############################errorMessage start ##############################\n"+MobileUtil.printMobileInfo(context)+MobileUtil.printSystemInfo()+"\n错误信息："+errorMessage+"\n方法名："+methodName+"\n当前app版本号："+VersionUtil.getVersion(context)+"\n############################errorMessage end##############################";
    }
}
