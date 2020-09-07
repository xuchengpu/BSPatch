package com.xcp.bspatch;

public class BsPatchUtils {

    public static native int patch(String oldApk,String newApk,String patchFile);

}
