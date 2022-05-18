public class DigitalWatch extends DigitalHelper{

    public String state = "Current";

    public Boolean input(char Q){
        if(this.state.equals("Current")){
            if(Q == 't'){
                return true;
            }else if(Q == 's'){
                this.state = "Modify";
                return true;
            }else if(Q == 'a'){
                this.state = "ALERT";
                return true;
            }
        }else if(this.state.equals("Modify")){
            if(Q == 's'){ //set seconds
                return true;
            }else if(Q == 'm') {
                return true;
            }else if(Q == 'h') {
                return true;
            }else if(Q == 'D') {
                return true;
            }else if(Q == 'M') {
                return true;
            }else if(Q == 'Y') {
                return true;
            }else if(Q == 't') {
                this.state = "Current";
                return true;
            }
        }else if(this.state.equals("ALERT")){
            if(Q == 's'){
                return this.put();
            }else if(Q == 'u') {
                return this.unput();
            } else if(Q == 'c') {
                return this.checking();
            }else if(Q == 't') {
                this.state = "Current";
                return true;
            }
        }
        return false;
    }
}