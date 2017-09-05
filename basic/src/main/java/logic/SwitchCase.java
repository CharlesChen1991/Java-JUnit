package logic;

/**
 * Created by hao.e.chen on 9/4/2017.
 */
public class SwitchCase {
    public String sayHello(int userRole) {
        String returnMes;
        switch (userRole) {
            case 1:
                returnMes = "Dear";
                break;
            case 2:
                returnMes = "Hello";
                break;
            case 3:
                returnMes = "Hey";
                break;
            default:
                throw new ClassCastException("What?");
        }
        return returnMes;
    }
}
