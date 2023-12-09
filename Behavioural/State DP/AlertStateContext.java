public class AlertStateContext {
    MobileAlertState state;
    public AlertStateContext(){
        state= new Ringer();
    }
    public void setState(MobileAlertState s){
        state=s;
    }
    public MobileAlertState getState(){
        return state;
    }
    public void work(){
        System.out.println(" checking the current Context state and working accordingly \n");
        state.work(this);
    }
}
