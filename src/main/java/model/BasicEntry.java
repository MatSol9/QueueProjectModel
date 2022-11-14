package model;


public class BasicEntry {
    private String locator;
    private String entry;

    public BasicEntry(String locator, String entry) {
        this.locator = locator;
        this.entry = entry;
    }

    public String getLocator() {
        return locator;
    }

    public void setLocator(String locator) {
        this.locator = locator;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
}
