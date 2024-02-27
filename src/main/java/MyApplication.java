public class MyApplication {
    public static void main(String[] args) {
        DefaultCarImpl car = new DefaultCarImpl();
        car.setPedalPleasure(5);
        float speed = car.getSpeed();
        System.out.println("Speed" +speed);
    }
}
