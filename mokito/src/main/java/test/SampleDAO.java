package test;

import java.util.List;

/**
 * Created by hao.e.chen on 9/6/2017.
 */
public class SampleDAO {
    public String findOne(int id) {
        return String.valueOf(id);
    }

    public String getByName(String name) {
        return name + "ok";
    }

    public String getConnect(int timeout) {
        return "Connection";
    }

    public String getConnect(String timeout) {
        return "Connection";
    }

    public String getConnect(List timeout) {
        return "Connection";
    }
}
