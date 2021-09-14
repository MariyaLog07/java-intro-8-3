package ru.desnol;

public class WebSite {
    String url;
    int viewCount;
    boolean isFunnySite;
    String[] menuItems = {"login", "logout", "profile"};
    String menuItems0 = "login";
    String menuItems1 = "logout";
    String menuItems2 = "profile";


    public WebSite(String url, boolean isFunnySite) {
        this.url = url;
        this.isFunnySite = isFunnySite;
    }

    public WebSite() {
    }

    void setViewCount(int count) {
        this.viewCount = count;
    }

    boolean isThisSiteIsFunny() {
        System.out.println("!!!!");
        return isFunnySite;
    }

    WebSite open() {
        System.out.println("Opened!");
        if (isFunnySite) {
            System.out.println(":D");
        } else {
            System.out.println(":(");
        }
        return this;
    }

    void printItems() {
        int i = 0;
        while (i < menuItems.length) {
            System.out.println(menuItems[i]);

            i++;
        }

        int a = 0;
        do {
            System.out.println(menuItems[a]);

            a++;
        } while (a < menuItems.length);

        for (String menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }
}