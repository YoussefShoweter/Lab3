public class ATM extends HelperinATM{

    public String state = "UnSuccesfulylog";

    public Boolean input(char c){
        if(this.state.equals("UnSuccesfulylog")){
            if(c == 'l'){
                this.state = "Correctin ";
                return true;
            }else if(c == 'u'){
                this.state = "Availible";
                return true;
            }
        }else if(this.state.equals("Correctin ")){
            if(c == 'w'){
                return this.TakeMoney();
            }else if(c == 'd') {
                this.AddFlow(1);
                return true;
            }else if(c == 'o') {
                this.state = "UnSuccesfulylog";
                return true;
            }
        }else if(this.state.equals("Availible")){
            if(c == 'f'){
                this.AddFlow(1);
                return true;
            }else if(c == 'l') {
                this.state = "UnSuccesfulylog";
                return true;
            }
        }
        return false;
    }
}