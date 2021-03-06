package com.example.xfans.js.bridge;

import android.util.Log;

import com.example.xfans.js.api.CMD;

/**
 * Created by xfans on 2014/12/13.
 * 工具类
 */
public class Utils {
    /**
     * String to Enum
     * @param cmdStr
     * @return
     */
    public static CMD getCmd(String cmdStr) {
        Log.d("Utils", "cmdStr:"+cmdStr);
        CMD cmd = CMD.NULL;
        try {
            cmd = CMD.valueOf(cmdStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return cmd;
    }
}
