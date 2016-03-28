package com.allcheer.refmobile.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import com.allcheer.refmobile.constant.PatternExp;

/**
 * 
 * <h1>验证工具类</h1>
 * 通用验证方法
 * @author jiawei.wang
 * @version Validator.java, v1.0, 2015年5月29日 下午1:57:14 jiawei.wang
 */
public class Validator {

    /**
     * 
     * <h2>根据正则表达式验证字符串</h2>
     * @param validateString 待验证字符串
     * @param regExp 正则表达式，要求从PatternExp里获取
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean validateStringByRegExp(String validateString,PatternExp regExp){
        return Pattern.matches(regExp.getPatternString(), validateString);   
    }
    
    /**
     * 
     * <h2>验证('xx','xx')格式的字符串</h2>
     * @param validateString 待验证字符串
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean validateString1(String validateString){
        return validateStringByRegExp(validateString,PatternExp.StringP01);
    }
    
    /**
     * 
     * <h2>验证'xx','xx'格式的字符串</h2>
     * @param validateString 待验证字符串
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean validateString2(String validateString){
        return validateStringByRegExp(validateString,PatternExp.StringP02);
    }
    /**
     * 
     * <h2>时间格式通用验证方法</h2>
     * @param validateString 待验证字符串
     * @param regExp 验证格式
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean validateDateTime(String validateString,
            PatternExp regExp) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(regExp
                .getPatternString());
        try {
            Date date = dateFormat.parse(validateString);
            if (dateFormat.format(date).equals(validateString)) {
                return true;
            }
            return false;
        } catch (ParseException e) {
            return false;
        }
    }
    /**
     * 
     * <h2>验证yyyyMMddHHmmss时间格式</h2>
     * @param validateString 待验证时间字符串
     * @return  true表示验证通过，false表示验证失败 
     */
    public static boolean validateDateTime1(String validateString){
        return validateDateTime(validateString,PatternExp.DateTimeP01);
    }
    /**
     * 
     * <h2>验证yyyy-MM-dd时间格式</h2>
     * @param validateString 待验证时间字符串
     * @return  true表示验证通过，false表示验证失败 
     */
    public static boolean validateDate1(String validateString){
        return validateDateTime(validateString,PatternExp.DateP01);
    }
    
    /**
     * 
     * <h2>验证yyyyMMdd时间格式</h2>
     * @param validateString 待验证时间字符串
     * @return  true表示验证通过，false表示验证失败 
     */
    public static boolean validateDate2(String validateString){
        return validateDateTime(validateString,PatternExp.DateP02);
    }
    
    /**
     * 
     * <h2>验证金额，金额格式要求必须为xxx.xx的字符串,保留两位小数</h2>
     * @param amt 待验证金额串
     * @return true表示验证通过，false表示验证失败 
     */
    public static boolean isAmt(String amt){
        return validateStringByRegExp(amt,PatternExp.AmtP01);
    }
    /**
     * 
     * <h2>验证邮箱</h2>
     * @param email 待验证邮箱
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean isEmail(String email){
        return validateStringByRegExp(email,PatternExp.Email);
    }
    /**
     * 
     * <h2>是否为中文字符</h2>
     * @param str 待验证中文字符
     * @return  true表示验证通过，false表示验证失败
     */
    public static boolean isChinese(String str){
        return validateStringByRegExp(str,PatternExp.Chinese);
    }
    /**
     * 
     * <h2>验证金额，金额格式要求必须为xxxxx的数字串</h2>
     * @param str 待验证金额
     * @return  true表示验证通过，false表示验证失败
     */
    public static boolean isAmt1(String amt){
       return   validateStringByRegExp(amt,PatternExp.AmtP02);
    }
    
    /**
     * 
     * <h2>验证字符串是否全为数字</h2>
     * @param str 待验证数字
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean isNumber(String str){
        return   validateStringByRegExp(str,PatternExp.Number);
     }
    /**
     * 
     * <h2>验证字符串是否全为英文字母</h2>
     * @param str 待验证英文字符
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean isEnglish(String str){
        return   validateStringByRegExp(str,PatternExp.English);
     }
     
    /**
     * 
     * <h2>验证字符串是否为手机号码</h2>
     * @param phoneNo 手机号码
     * @return true表示验证通过，false表示验证失败
     */
    public static boolean isTelephone(String phoneNo){
        return   validateStringByRegExp(phoneNo,PatternExp.TELEPHONE);
    }
}
