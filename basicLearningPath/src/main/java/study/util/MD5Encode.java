package study.util;

import sun.misc.BASE64Encoder;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lizhupeng on 2016/11/22.
 */
public class MD5Encode {
    public static void main(String[] args) throws Exception {
        String message = null;
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd mm:HH:ss");
        String nowDate = dateFormat.format(now);
        System.out.println(nowDate);
        message = "";
        System.out.println(message);
        String MD5Message = encodeToMD5(message);
        System.out.println(MD5Message);
        //进行Base64编码
        System.out.println(new BASE64Encoder().encode(MD5Message.getBytes()));
        //进行URL编码
        System.out.println(URLEncoder.encode(new BASE64Encoder().encode(MD5Message.getBytes()),"UTF8"));
    }


    /*将字符串进行md5加密*/
    public  static  String encodeToMD5 (String message) throws Exception {
        MessageDigest md5Digest = MessageDigest.getInstance("MD5");
        byte[] md5 = md5Digest.digest(message.getBytes("utf-8"));
        String result = convertByteToHexString(md5);
        return result;
    }

    /*将byte数组转换成16进制输出*/
    public static String convertByteToHexString(byte[] bytes) {
        String result="";
        for (int i=0;i<bytes.length;i++){
            int temp = bytes[i] &0xff;
            String temphex =Integer.toHexString(temp);
            if(temphex.length()<2)
            {
                result +="0"+temphex;
            }
            else{
                result +=temphex;
            }
        }
        return result;
    }
}
