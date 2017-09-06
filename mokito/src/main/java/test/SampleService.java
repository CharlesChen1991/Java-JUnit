package test;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
public class SampleService {
    public String getProfile(String name) {
        return "profile of " + name;
    }

    public String getResult(String result) {
        return "calling real method";
    }
}
