package spring.greva.ioc_di.models;

public abstract class AbstractDog extends AbstractPet {
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
