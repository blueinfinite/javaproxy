import com.blueinfinite.*;
import org.junit.Test;

public class TestProxy {

    /** 普通方式 */
    @Test
    public void test1() {
        Custom1 c = new Custom1();
        c.follow();
        c.edit();
    }

    /** 进一步封装 */
    @Test
    public void proxy2() {
        Custom2 c = new Custom2();
        c.follow();
        c.edit();
    }

    /** 静态代理 */
    @Test
    public void proxy3() {
        Custom3Proxy c = new Custom3ProxyImpl(new Custom3());
        c.follow();
        c.edit();
    }

    /** 动态代理 */
    @Test
    public void proxy4() {
        Custom3Proxy proxy = DynamicProxy.getObj(new Custom3());
        proxy.follow();
        proxy.edit();
    }
}
