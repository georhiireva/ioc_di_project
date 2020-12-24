package spring.greva.ioc_di.models;

public abstract class AbstractCat extends AbstractPet {
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
