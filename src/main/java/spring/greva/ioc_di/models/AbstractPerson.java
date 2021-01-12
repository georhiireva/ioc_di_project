package spring.greva.ioc_di.models;

import java.util.UUID;

public abstract class AbstractPerson implements IPerson {
    private IPet _pet;
    private String _name;
    private IPerson _friend;

    public AbstractPerson(IPet pet, String name) {
        _pet = pet;
        _name = name;
        System.out.println("Person + " + name + " is created!");
    }

    public AbstractPerson(){}

    @Override
    public void callPet() {
        System.out.println("Hello, " + _pet.getName() + ", come here!");
        _pet.say();
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @Override
    public IPerson getFriend() {
        return _friend;
    }

    @Override
    public void setFriend(IPerson friend) {
        _friend = friend;
        System.out.println("Setter for person "+ this.getName() + ". Friend is " + friend.getName());
    }

    @Override
    public String getID() {
        return UUID.randomUUID().toString();
    }

    @Override
    public IPet getPet() {
        return _pet;
    }

    @Override
    public void setPet(IPet pet) {
        _pet = pet;
    }
}
