interface Testable{
    void display();
}
class Test implements Testable{
    public void display(){      //Need to define display as public because it was by default public in interface. 
        System.out.println("Inside Test.");
    }
}