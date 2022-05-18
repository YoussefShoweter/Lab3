public class DigitalHelper {

    public boolean
            Authunticate = false;

    public boolean put(){
        if(this.Authunticate){
            return false;
        }
        this.Authunticate = true;
        return true;
    }

    public boolean unput(){
        if(!this.Authunticate){
            return false;
        }
        this.Authunticate = false;
        return true;
    }

    public boolean checking(){
        boolean tem = this.Authunticate;
        this.Authunticate = false;
        return tem;
    }

}