package framework;

public abstract class ItemCreator {

    public Item create() {
        Item item = null;

        String name = "체력물약";

        //step1
        requestItemInfo(name);
        //step2
        item = createItem();
        //step3
        createItemLog();

        return item;
    }

    protected abstract void requestItemInfo(String name);
    protected abstract void createItemLog();
    protected abstract Item createItem();
}
