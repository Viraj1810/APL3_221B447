class Rum extends Decorator{
    Rum(Offering offering){
        this.offering = offering;
    }
    String getname(){
        return offering.getname() + " with Rum";
    }
    int price(){
        return offering.price() + 50;
    }
}