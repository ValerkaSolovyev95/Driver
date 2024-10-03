import java.util.Objects;

public class DriverLocal implements Driver {
    private String browserVersion;
    private String browserName;

    public DriverLocal(String browserVersion, String browserName) {
        this.browserVersion = browserVersion;
        this.browserName = browserName;
    }

    @Override
    public String toString() {
        return "DriverLocal{" +
                "browserVersion='" + browserVersion + '\'' +
                ", browserName='" + browserName + '\'' +
                '}';
    }

    @Override
    public String getDriver() {
        return Objects.equals(this.browserName, "Chrome") ? "Chrome" : "Firefox";
    }
}
