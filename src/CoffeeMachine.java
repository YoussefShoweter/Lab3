public class CoffeeMachine extends Options{

    public String state = "Rekt";

    public Boolean input(char Q){
        if(this.state.equals("Rekt")){
            if(Q == 'c'){ //coffee
                return (this.AddSparkleF() && this.OrderMocha());
            }else if(Q == 'l'){ //latte
                return (this.AddSparkleF() && this.OrderMocha() && this.PourFrenchV());
            }else if(Q == 'm'){ //mocha
                return (this.PourFrenchV() && this.OrderMocha() && this.SmashLotus());
            }
            else if(Q == 'z'){
                this.state = "Zero";
                return true;
            }
        }else if(this.state.equals("Zero")){
            if(Q == 'b'){ //beans
                this.AddMocha(1);
                return true;
            }else if(Q == 'w'){ //water
                this.AddSparkleWaterFizz(1);
                return true;
            }else if(Q == 'm'){ //milk
                this.AddFrenchVanilla(1);
                return true;
            }else if(Q == 'c'){ //choco
                this.AddLotus(1);
                return true;
            }
            else if(Q == 'v'){
                this.state = "Rekt";
                return true;
            }
        }
        return false;
    }
}