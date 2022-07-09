package com.lwh.shoppingwebsite.util;

/**
 * @Author : lwh
 * @Create : 2021/12/14
 * @Version:2021-12 -14-1
 */
public class AjaxResult {
    private String message;

    private boolean success  = true;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
