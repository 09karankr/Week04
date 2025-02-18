package annotations.basicexcercise.useoveride;

class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Dog is making sound");
    }

}
