package spring.greva.ioc_di.models;

public abstract class AbstractPet implements IPet {
    private String _name;

    public AbstractPet() {
        System.out.println(this.getClass().getSimpleName() + " is created");
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;
    }
}
