package statictest;

public class Test {
    public static final int STATICTEST_NEIBU=0;
    public static final int STATICTEST_VIP=1;
    public static final int STATICTEST_LUREN=2;
    public void maishu(float jiaqian,int shenfen) {
        switch (shenfen) {
            case Test.STATICTEST_NEIBU:
               System.out.println(jiaqian*0.5);
               break;
            case Test.STATICTEST_VIP:
                System.out.println(jiaqian*0.8);
                break;
            case Test.STATICTEST_LUREN:
                System.out.println(jiaqian*1);
                break;
        }
    }
}
