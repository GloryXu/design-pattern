package strategy;

/**
 * 求吴国开个绿灯
 */
public class GiveGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
