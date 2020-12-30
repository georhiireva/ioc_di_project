package spring.greva.ioc_di.models;

public interface IPerson extends IIdentifier {
    void callPet();
    String getName();
    void setName(String name);
    IPerson getFriend();
    void setFriend(IPerson friend);
}
