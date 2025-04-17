class Gin extends Decorator{
    Gin(Offering offering){
        this.offering = offering;
    }
    String getname(){
        return offering.getname() + " with Gin";
    }
    int price(){
        return offering.price() + 30;
    }
}