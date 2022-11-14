package requests;

public class BasicDataRequest {
    private String locator;

    public BasicDataRequest(String locator) {
        this.locator = locator;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }
}
