import java.util.Objects;

public class DriverRemote implements Driver{
    private String browserVersion;
    private String browserName;

    public DriverRemote(String browserVersion, String browserName) {
        this.browserName = browserName;
        this.browserVersion = browserVersion;
    };
    @Override
    public String getDriver() {
        return Objects.equals(this.browserName, "Chrome") ? "ChromeRemote" : "FirefoxRemote";
    }

    @Override
    public String toString() {
        return "DriverRemote{" +
                "browserVersion='" + browserVersion + '\'' +
                ", browserName='" + browserName + '\'' +
                '}';
    }
}
