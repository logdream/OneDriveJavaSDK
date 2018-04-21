package de.tuberlin.onedrivesdk.common;

/**
 * The different scopes for using the OneDrive API. These scopes are used in the authentication process.
 */
public enum OneDriveScope {
    SIGNIN("wl.signin"),
    OFFLINE_ACCESS("wl.offline_access"),
    READONLY("onedrive.readonly"),
    READWRITE("onedrive.readwrite"),
    APPFOLDER("onedrive.appfolder"),
    FsREAD("files.read"),//	授予对用户的所有 OneDrive 文件的只读权限。
    FsREADALL("files.read.all"),//	授予对用户的所有 OneDrive 文件（包括与用户共享的文件）的只读权限。
    FsRW("files.readwrite"), //	授予对用户的所有 OneDrive 文件的读取和写入权限。
    FsRWALL("files.readwrite.all");	//授予对用户的所有 OneDrive 文件（包括与用户共享的文件）的读取和写入权限。
    private String code;

    OneDriveScope(String s){
        this.code = s;
    }

    public String getCode(){
        return code;
    }
}
