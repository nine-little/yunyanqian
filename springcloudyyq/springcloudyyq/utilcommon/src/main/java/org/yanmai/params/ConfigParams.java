package org.yanmai.params;

/**
 * 公共参数配置
 *
 * @author
 *
 */
public class ConfigParams {

    public static String SERVERNAME = "yyq";


    // 融云有关
    public class RONGYUN {
        public static final String RONGYUN_APPKEY = "8w7jv4qb7tjyy";
        public static final String RONGYUN_APPSERCET = "GZMXNuDXrEdXK";

    }

    //加密有关参数
    public final static String RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCL8fhOPzKQa4TT4AxxNH3v75ikV4nxsEFP463cEy+LU9NCkLFoH/Dwu/I8R+TYMX12XBDeIQJh05M7ic6me0P10AXWFT0TK7qY6uSH5hsnieSVPyWRzPSrPWtyv9hVUwHoImEhXpK981BQ8jTPMfWEhUgbSPIMvxiWsTal/hkihwIDAQAB";
    public final static String RSA_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIvx+E4/MpBrhNPgDHE0fe/vmKRXifGwQU/jrdwTL4tT00KQsWgf8PC78jxH5NgxfXZcEN4hAmHTkzuJzqZ7Q/XQBdYVPRMrupjq5IfmGyeJ5JU/JZHM9Ks9a3K/2FVTAegiYSFekr3zUFDyNM8x9YSFSBtI8gy/GJaxNqX+GSKHAgMBAAECgYEAhOpjwMWLW9mSxb2Fc7u8ZTe2TViLPs79qUgAqAZc4MLT4uQUa2Xy7GJFtvU9qAyRMepNZvwJDCrsKt8/M6Xdq+HDWCyONi3IEZd5eRCVkhbn8mQTY8mwiANtCSBStiUeaz8t4zdth0VT4xaxpppPyjcMCXVe10z9raEGdRCoTzECQQC+d1xfVbCIfnvDHmfB5SzJec1O7cqVqaXZ8Vb8AGlCuJZIxNP+w99/BiCz9wkbOO/d0l9HjGOflQyrxj86+IyJAkEAvBidocpvwNmVHV09PTfSyBuc5eQ/iPi3oe3p8gfXocxhU/1pXVImb81W1LmSRJev1x0X+2QnELp8yZwvihkSjwJBALMnuQafpn6tYqKlHfm/JMKaxGiiubTPL4byQNynUluFHy9xnOr9uWNVEzvUeYdWpiFjuWWmgyrfW1zUDDPfCOkCQGPxGGCM9ZAcjDSMBCvw61hUA6vK+U9ICBpMFY/6RsK7m8NK1J83NSEWk9p3t5YmmtHLraBveKpUzFU7Xa8c31UCQDZ94n4GvzvQO6Ma7jK/Mg/atltiKEadP2vQGQDLROdmwTCYitUm+8Q+8jhnq+CKRWVL/t2UlOYCHf5A3OomNyQ=";
    public static final String RSA_IOS_PUBLIC_KRY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDJmRtFWRaFikf8R61NW29i2U1aax7PJs8luR930eG5r0L4LrbZNFbSu3amSQ22q9hMJ/UtQCYeOB02Qv0F5GzRCxxWRFxfDyfFzMuyvXyaYInJN4EbXdFMtHZnauMqJdAuqrSLuA52fq26VWTbqb5m5lOoMpXSyNBoFQm6rxQsYwIDAQAB";
    public static final String RSA_IOS_PRIVATE_KRY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAMmZG0VZFoWKR/xHrU1bb2LZTVprHs8mzyW5H3fR4bmvQvguttk0VtK7dqZJDbar2Ewn9S1AJh44HTZC/QXkbNELHFZEXF8PJ8XMy7K9fJpgick3gRtd0Uy0dmdq4yol0C6qtIu4DnZ+rbpVZNupvmbmU6gyldLI0GgVCbqvFCxjAgMBAAECgYEAi3Ojj6b+k0WCYhra4IX9WO1kOsWavETmSfvyrpm6gQ2hT7hQt5Mi9AbFHmWuXMwmhRem27RiKck7O8u+5xKJyh59Am9AklsVMO3Fd6YbbH2LWUuVxAKBrXMTeJigBBQwtFjTZw/OdEOvkR2Ded8WqC+KhV0epjVFC9M4jEbCmaECQQDoKKFlmjBXgFAC01M7O/ciC94kNwegGWBVX0vaYcHtpN+gNWygENUBw2vPZHRlOB0TWFY/8M49xGTTAd0fi/HbAkEA3k0MOjYVTtZotIJsHYEfbUt/UIIEsi2EJYf1bJwf5y/nAPdEZAwE1w2hM0rpvlaQcbEOqRZG/GWxGq40pBUKGQJAH1xluQjkIN3XcRpE8wp9rt61imTYpdrntYCjCYQNI2ITR1wQKWs8qvlQFfr28jlrTBKxy/9mjNd72zk0Oq+34wJAcgIb0kLofK1Tt7fn0N3nCzucCOMVm3fifQkUYmZTqlKT65fk2FadqNlRoie6ZyaoH9bJiQhm0Y0p3mAXmUs9CQJAP7H/MqdGlHNzny9P9PF6my89imITVgoCMJV94Hfg7UFOSXq3NTxwPq3NgfQPZ0nNPrcL7hWORDpXA2bn3I2ThQ==";
    public final static String RSA_IOS_VERSION = "ios_1";
    public final static String RSA_ANDROID_VERSION = "android_1";
    //token配置
    public static final String VERSION = "1";//token版本
    public static final int EXPIRED = 30 * 60 * 60 * 24; //token有效期一个月有效有效

    public static final String PRIVATE_TOKEN ="nonghangzhuanyongtoken789987456654123321=";

    //public static final String ACCREDIT_TOKEN ="df98abd4-cc89-4861-81f2-44388eb43949";
    public static final String ACCREDIT_TOKEN ="b4e2a37d-1755-4a33-a50a-84795a453552";
    //区分平台
    public final static String PLATFORM_IOS = "ios";

    // 用户头像
    public static class USER_HEAD {
        public static String DEFAULT_HEAD_URL1 = "http://7xledi.com1.z0.glb.clouddn.com/head1.png";
        public static String DEFAULT_HEAD_URL2 = "http://7xledi.com1.z0.glb.clouddn.com/head2.png";
        public static String DEFAULT_HEAD_URL3 = "http://7xledi.com1.z0.glb.clouddn.com/head3.png";
        public static String DEFAULT_HEAD_URL4 = "http://7xledi.com1.z0.glb.clouddn.com/head4.png";
    }


    //附件类型
    public class ATTACHMENT_PART{
        public static final String USER_HEARED="1";//个人版

    }

    /**
     * 私有化金融机构类型
     */
    public static final String BANKTYPE = "A1";
    /**
     * session保存数据
     */
    public static final String USER = "user";
    /**
     * 享家
     */
    public final static String APK_NAME_XJ = "xjapp";

    /**
     * 享分期
     */
    public final static String APK_NAME_XFQ = "xfqapp";

    /**
     * 访调通
     */
    public final static String APK_NAME_FDT = "fdtapp";
    /**
     * 中行
     */
    public final static String APK_NAME_BOC = "bocapp";

    /**
     * 助助贷家装版
     */
    public final static String APK_NAME_ZZDJZ = "zzdjzapp";


    /**
     * 定制版app名称
     */
    public final static String APK_NAME = "abczzdapp";

    /**
     * 扫描二维码url
     */
    public static final String WEB_SITE="https://login.daixinlian.com/qr";

    public final static String DURYIMAGE = "https://login.daixinlian.com/img/user_rongyun.png";


    public static boolean isDebug = true ;

    //文件类型
    public class FILETYPE{
        public static final String IMAGE_TYPE = "image";//图片类型
        public static final String AUDIO_TYPE = "vedio";//音频
    }


}
