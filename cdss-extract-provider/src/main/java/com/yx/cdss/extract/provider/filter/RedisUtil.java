package com.yx.cdss.extract.provider.filter;
/*==========================================================================
 * Copyright (C) Wit2Cloud Co.,Ltd
 * All Rights Reserved.
 * Created By 开源学社
 ==========================================================================*/

import org.redisson.misc.Hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author John Goo
 * @version 1.0
 * @ClassName: RedisUtil
 * @Desc: TODO
 * @history v1.0
 */
public class RedisUtil {

    private static Map<String,JwtUser> jwtUserMap = new HashMap<>();

    public static void put(String userId,JwtUser jwtUser){
        jwtUserMap.put(userId,jwtUser);
    }

    public static JwtUser get(String userId){
        return jwtUserMap.get(userId);
    }
}
