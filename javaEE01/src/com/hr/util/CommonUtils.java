package com.hr.util;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

public class CommonUtils {
    public static <T> T transfer(HttpServletRequest req,T target){
        try {
            BeanUtils.populate(target,req.getParameterMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return target;
    }
}
