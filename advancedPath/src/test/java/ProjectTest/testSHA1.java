package ProjectTest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lizhupeng on 2017/10/20.
 */
public class testSHA1 {


    public static void main(String[] args) throws NoSuchAlgorithmException {
        String extattr = "{\"attrs\": [{\"name\": \"工号\",\"value\": \"LM000343\"},{\"name\": \"公司\",\"value\": \"理文\"}]}";






    }



    private static String getsha1(String  str) throws NoSuchAlgorithmException {
//        String[] array = new String[] {nonce,appsecret, timestamp };
//        StringBuffer sb = new StringBuffer();
//        // 字符串排序
//        Arrays.sort(array);
//        for (int i = 0; i < 3; i++) {
//            sb.append(array[i]);
//        }
//        String str = sb.toString();
        // SHA1签名生成
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        StringBuffer hexstr = new StringBuffer();
        String shaHex = "";
        for (int i = 0; i < digest.length; i++) {
            shaHex = Integer.toHexString(digest[i] & 0xFF);
            if (shaHex.length() < 2) {
                hexstr.append(0);
            }
            hexstr.append(shaHex);
        }
        String signature =  hexstr.toString();
        System.out.println(signature);
        return signature;
    }
}
