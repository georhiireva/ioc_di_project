package spring.greva.ioc_di.models;

public abstract class AbstractPerson implements IPerson {
    private IPet _IPet;

    public AbstractPerson(IPet IPet) {
        _IPet = IPet;
    }

    @Override
    public void callPet() {
        System.out.println("Hello, " + _IPet.getName() + ", come here!");
        _IPet.say();
    }
}
