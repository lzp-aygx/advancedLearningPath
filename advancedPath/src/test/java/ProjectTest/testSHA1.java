package ProjectTest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lizhupeng on 2017/10/20.
 */
public class testSHA1 {


    public static void main(String[] args) throws NoSuchAlgorithmException {

        String path = "http://parter.api.chuchujie.com/sqe/Order/get_order_list_v2";
//        System.out.println(getsha1("40711","59ef98cc310e37a068bd2f0c07cceaf8cee6981c","1508471040711"));
        System.out.println(getsha1("4071159ef98cc310e37a068bd2f0c07cceaf8cee6981c1508471040711"));


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
