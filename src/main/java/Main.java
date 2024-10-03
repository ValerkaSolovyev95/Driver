public class Main {
    public static void main(String[] args) {
        Driver driver = new DriverRemote("45", "Chrome");
        Driver driver1 = new DriverLocal("45", "Chrome");
        DriverInit driverInit = new DriverInit(driver, false);
        System.out.println(driverInit.getDriver());
    }
}
