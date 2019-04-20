public class Cat extends Animal {

    public Cat() {
        super.setName("猫");
        super.setSex("公");
        System.out.println("这是一只"+super.getSex()+super.getName());
    }
}
