# xyp-client-code-java
Төрийн мэдээлэл солилцооны ХУР системийн хэрэглэгчийн жишээ кодыг Java хэл дээр бэлтгэв.

## Шаардлага
    java version 11.0.8
    mvn version 3.8.8

[Constants.java](./src/main/java/mn/gov/xyp/Constants.java) кодын шаардлагатай мэдээллийг бөглөх. Үүнд:

```java 
//ҮДТ - өөс олгогдсон accessToken мэдээлэл
public static final String ACCESS_TOKEN = "qwertyuoisdfjlkm12dfgklskd4";
//ҮДТ өөс олгогдсон openVPN key-ийн мэдээллийг агуулж буй файлын зам.
public static final String KEY_PATH = "src/key.key";
//Иргэний регистрийн дугаар
public static final String REGNUM = "АА00112233";
#Тоон гарын үсэг зурах client программын  local дээр ажиллаж буй хаяг. 
//ESIGN CLIENT программын хувьд тогтмол "127.0.0.1:97001" байна.
public static final String ESIGN_URL = "ws://127.0.0.1:59001";
```
[key.key](./src/key.key) файлд ҮДТ-өөс олгогдсон openVPN key-ийн мэдээллийг хуулна.

xyp.gov.mn сайтын тоон гэрчилгээг JAVA итгэмжлэгдсэн гэрчилгээн санд нэмсэн байх шаардлагатай. Үүнд:

1. JKS файл үүсгэх Эхлээд VPN сүлжээнд холбогдоход өгөгдсөн тоон гэрчилгээ болон хувийн түлхүүрийг pkcs12 форматтай болгох ёстой.

```bash
$ openssl pkcs12 -export -in <certificate_file> -inkey "private_key_file" -name "xyp" -out <output_file.p12>
Enter Export Password:
Verifying - Enter Export Password:

#pkcs12 формат нь тоон гэрчилгээ хувийн түлхүүрийг нууц үгээр хамгаалдаг тул нууц үгийг заавал оруулж өгнө.
```
```bash
#Java keytool ашиглан “JKS” файл үүсгэх.

$ keytool -importkeystore -deststorepass 'KEY_STORE_PASS' -destkeystore <jks_file_name.jks> -srckeystore <pkcs12_file.p12> -srcstoretype PKCS12
Importing keystore <pkcs12_file.p12> to <jks_file_name.jks>...
Enter source keystore password:
Entry for alias xyp successfully imported.
Import command completed:  1 entries successfully imported, 0 entries failed or cancelled

#KEY_STORE_PASS нь .p12 файлын нууц үгтэй ижилхэн байх ёстойг анхаарна уу... Ижилхэн биш бол JAVA - "Cannot recover key" Exception өгдөг.
```
2. xyp.gov.mn сайтын тоон гэрчилгээг JAVA итгэмжлэгдсэн гэрчилгээн санд нэмэх. [InstallCert.java](./src/main/java/init/InstallCert.java) кодыг зааврын дагуу ажиллуулах.
```bash
$ javac InstallCert.java
$ java InstallCert xyp.gov.mn:443
---------------------------------------------------------------
Server sent 3 certificate(s):

1 Subject CN=xyp.gov.mn, EMAILADDRESS=info@datacenter.gov.mn, O=National Data Center, OU=National Data Center, ST=Tuv, C=MN, L=Ulaanbaatar
Issuer  CN=Mongolian National Issuing CA, O=ITPTA, OID.2.5.4.51="P.O.B-785, ITPTA Building", STREET="Chinggis Square -1, Chingeltei", L=Ulaanbaatar, C=MN
sha1    1e 02 12 0d 1a 7f b0 3d 79 11 0d 3a 2a 36 84 af 3e 75 26 dd
md5     94 81 3e 68 a8 45 15 a0 cf fa 9d e4 fc a3 c8 3b

2 Subject CN=Mongolian National Root CA, O=ITPTA, C=MN
Issuer  CN=Mongolian National Root CA, O=ITPTA, C=MN
sha1    fe c5 53 5b 04 a9 09 7b b0 fb d0 e0 31 37 67 f8 57 d3 b4 6b
md5     87 35 1c cb f4 23 1d 6f b6 26 fa c8 3b 3f c3 ac

3 Subject CN=Mongolian National Issuing CA, O=ITPTA, OID.2.5.4.51="P.O.B-785, ITPTA Building", STREET="Chinggis Square -1, Chingeltei", L=Ulaanbaatar, C=MN
Issuer  CN=Mongolian National Root CA, O=ITPTA, C=MN
sha1    e6 a7 75 f9 2d 5e 32 dc 95 5f 3b 5c f7 44 df a0 fa 8b af 66
md5     f7 20 ef 52 0b ad e5 7c 83 9a 59 65 5a 71 08 26

Enter certificate to add to trusted keystore or 'q' to quit: [1]  # Enter дар.
.........................................................
.........................................................
Added certificate to keystore 'cacerts' using alias 'xyp.gov.mn-1'
```
3. Үүссэн cacerts файлыг $JAVA_HOME/jre/lib/security хавтсанд хуулах. Хуулахаас өмнө cacerts файлыг нөөцлөж авна уу.
4. Ашиглах wsdl ийг mn.gov.xyp хавтсанд хуулна. Жишээ болгон citizen-1.5.0 хуулсан байгаа.
```bash
$ wsimport -d mn.gov.xyp.citzen https://xyp.gov.mn/citizen-1.5.0/ws?WSDL
```
## Сервис дуудах
Иргэнийг тоон гарын үсгээр баталгаажуулан дуудахдаа [DigitalSignatureApprove.java](./src/main/java/mn/gov/xyp/DigitalSignatureApprove.java)
кодын main() функцыг ажилуулна.

[comment]: <> (Иргэнийг OTP кодоор баталгаажуулан дуудахдаа [OTPApprove.java]&#40;./src/main/java/mn/gov/xyp/OTPApprove.java&#41;)

[comment]: <> (кодын main&#40;&#41; функцыг ажилуулна.)
Иргэнийг OTP кодоор баталгаажуулан дуудах код удахгүй нэмэгдэнэ.