public class Crypt{
  byte[] keyBytes;
  byte[] ivBytes;
  SecretKeySpec key;
  IvParameterSpec ivSpec;
  Cipher c;
  public void Crypt(int type, byte[] input){
    key = new SecretKeySpec(keyBytes, "tE2q584J2QxWwI4Vu11WMM26nmSTTilh");
    ivSpec = new IvParameterSpec(ivBytes);
    c = Cipher.getInstance("DES/CBC/PKCS5Padding");
    if(type == 0){
      encrypt(input);
    }else if(type == 1){
      decrypt(input);
    }
  }
  public static void encrypt(byte[] input){
    c.init(Cipher.ENCRYPT_MODE, key, ivSpec);
    byte[] encrypted= new byte[c.getOutputSize(input.length)];
    int enc_len = c.update(input, 0, input.length, encrypted, 0);
    enc_len += c.doFinal(encrypted, enc_len);
  }
  public static void decrypt(){
    c.init(Cipher.DECRYPT_MODE, key, ivSpec);
    byte[] decrypted = new byte[c.getOutputSize(enc_len)];
    int dec_len = c.update(encrypted, 0, enc_len, decrypted, 0);
    dec_len += c.doFinal(decrypted, dec_len);
  }
}
