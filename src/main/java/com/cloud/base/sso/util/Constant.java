package com.cloud.base.sso.util;


/**
 * 各服务接口
 *
 * @author Jon_China
 * @create 2017/11/11
 */
public final class Constant {
    /**用户服务*/
    private static final String USER_SERVICE = "http://user-microservice";

    /**获取公钥*/
    public static final String GET_PUBLIC_KEY = USER_SERVICE + "/get-public-key";
    /**用户登录*/
    public static final String USER_LOGIN = USER_SERVICE + "/login";
    /**检测token是否有效*/
    public static final String CHECK_TOKEN = USER_SERVICE + "/token/check-token/{1}";
    /**根据用户id查询用户信息*/
    public static final String GET_USER_INFO_BY_ID = USER_SERVICE + "/get-user-detail/{1}";
    /**根据条件查询用户列表*/
    public static final String GET_USER_LIST = USER_SERVICE + "/get-user-list?message={1}";
    /**保存角色信息*/
    public static final String SAVE_ROLE_INFO = USER_SERVICE + "/role/save-role";
    /**保存权限信息*/
    public static final String SAVE_AUTHORITY = USER_SERVICE + "/auth/save-auth";
    /**用户是否登录*/
    public static final String GET_USER_IS_LOGIN = USER_SERVICE + "/is-login/{tokenId}";
    /**获取系统菜单*/
    public static final String GET_ALL_MENUS = USER_SERVICE + "/auth/get-all-menus/{appName}/{userId}";
    /**业务系统分页查询*/
    public static final String GET_SYSTEM_INFO_BY_NAME = USER_SERVICE + "/system-info/get-system-info?systemName={systemName}&pageSize={pageSize}&pageIndex={pageIndex}";
    /**保存业务系统信息接口*/
    public static final String SAVE_SYSTEM_INFO = USER_SERVICE + "/system-info/save-system-info";
    /**权限信息分页查询*/
    public static final String GET_ALL_AUTHORITIES_BY_PAGE = USER_SERVICE + "/auth/get-all-auth?name={name}&pageIndex={pageIndex}&pageSize={pageSize}&appName={appName}&itemType={itemType}";
    /**角色信息分页查询*/
    public static final String GET_ALL_ROLE = USER_SERVICE + "/role/get-roles?roleName={roleName}&appId={appId}&pageIndex={pageIndex}&pageSize={pageSize}";
    /**内部用户保存*/
    public static final String SAVE_USER = USER_SERVICE + "/save-user";
    /**角色分配用户*/
    public static final String ALLOCATION_USERS = USER_SERVICE + "/role/allocation-users";
    /**角色权限分配*/
    public static final String ALLOCATION_AUTH = USER_SERVICE + "/auth/allocation-auth";
    /**获取用户权限信息*/
    public static final String GET_USER_PRIVILEGE = USER_SERVICE + "/auth/check-privilege?userId={userId}&appId={appId}&uri={uri}";
}