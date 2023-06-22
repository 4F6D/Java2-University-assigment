package Game;

public abstract class GameObject implements Attack, Attackable {
    protected String[] actionHistory = new String[10];
    protected int i = 0;

    protected void logAction(String s) {
        if(i <= actionHistory.length && s != null) {
            actionHistory[i] = s;
            i++;
        }
    }

    public void print() {
        for(int i = 0; i < actionHistory.length; i++) {
            if(actionHistory[i] != null) { System.out.println(actionHistory[i]); }
        }
    }

    public String save() {
        for(int i = 0; i < actionHistory.length; i++) {
            return actionHistory[i];
        }
        return "END OF LOG";
    }
}
