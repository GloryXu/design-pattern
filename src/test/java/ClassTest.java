import org.junit.Test;

public class ClassTest {

    @Test
    public void testClass() {
        A a = new A();
        B b = new B();
        System.out.println(a.getClass().isInterface());
        System.out.println(a.getClass().isLocalClass());
        System.out.println(a.getClass().isMemberClass());
        System.out.println(a.getClass().isAnonymousClass());
        System.out.println(a.getClass().isAssignableFrom(b.getClass()));
        System.out.println(b.getClass().asSubclass(a.getClass()));
    }
}
