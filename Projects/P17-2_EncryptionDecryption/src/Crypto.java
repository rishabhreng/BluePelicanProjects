public class Crypto {

    public String encrypt(String sentence) {
        sentence =sentence.replace("v","ag");
        sentence =sentence.replace("V","ag");
        sentence =sentence.replace("m","ssad");
        sentence =sentence.replace("M","ssad");
        sentence =sentence.replace("g","jeb..w");
        sentence =sentence.replace("G","jeb.ww");
        sentence =sentence.replace("b","dug>?/");
        sentence =sentence.replace("B","dug>?/");

        return sentence;
    }

    public String decrypt(String sentence) {
        sentence =sentence.replace("ag","v");
        //sentence =sentence.replace("ag","V");
        sentence =sentence.replace("ssad","m");
        //sentence =sentence.replace("ssad","M");
        sentence =sentence.replace("jeb..w","g");
        //sentence =sentence.replace("jeb.ww","W");
        sentence =sentence.replace("dug>?/","b");
        //sentence =sentence.replace("dug>?/","B");

        return sentence;
    }
}
