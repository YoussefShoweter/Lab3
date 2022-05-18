public class Options {

    public int FrenchVanilla = 0;
    public int Mochaticino = 0;
    public int SparklingWater = 0;
    public int Lotus = 0;

    public void AddFrenchVanilla(int i){
        this.FrenchVanilla += i;
    }

    public void AddMocha(int i){
        this.Mochaticino += i;
    }


    public void AddSparkleWaterFizz(int i){
        this.SparklingWater += i;
    }

    public void AddLotus(int i){
        this.Lotus += i;
    }

    public boolean PourFrenchV(){
        if(this.FrenchVanilla <= 0){
            return false;
        }
        this.FrenchVanilla--;
        return true;
    }

    public boolean OrderMocha(){
        if(this.Mochaticino <= 0){
            return false;
        }
        this.Mochaticino--;
        return true;
    }

    public boolean AddSparkleF(){
        if(this.SparklingWater <= 0){
            return false;
        }
        this.SparklingWater--;
        return true;
    }

    public boolean SmashLotus(){
        if(this.Lotus <= 0){
            return false;
        }
        this.Lotus--;
        return true;
    }
}