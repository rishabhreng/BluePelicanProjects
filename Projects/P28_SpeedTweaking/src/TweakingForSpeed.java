// shows that arithmetic simplification and bitwise operations save time
// about 53.75% faster on first time trial

public class TweakingForSpeed {
    public static void main(String[] args) {
        int p = 386, q = 581, n = 0;
//plain
        System.out.println("Hello");
        for (long x = 0; x < 20_000_000_000.0; x++) {
            for (int j = 0; j < 1000; j++) {
                n = ((p * 2) + q) / 2;
            }
        }
        System.out.println(n);
// enchanced speed
        for (long x = 0; x < 20_000_000_000.0; x++) {
            n = p + (q >> 1);
        }
        System.out.println(n);
    }
}
