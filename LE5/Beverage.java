abstract class Beverage{
    protected void pour(int q){
        System.out.println("Pour " + q + " ml.");
    }
    abstract void addCondiment();
    protected void stir(){};
    private void serve(){
        System.out.println("Drink Served.");
    }
    void template(int q){
        pour(q);
        addCondiment();
        stir();
        serve();
    }
}