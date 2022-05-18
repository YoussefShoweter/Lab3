public class HelperinATM {

    public int Cash = 0;

    public void AddFlow(int i){
        this.Cash += i;
    }

    public boolean TakeMoney(){
        if(this.Cash <= 0){
            return false;
        }
        this.Cash--;
        return true;
    }

}