package controllers;

import models.Users;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by garming on 2016/10/18.
 */
public class DemoController extends Controller {
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        Users users = Users.find.byId(1L);
        users.name = "9999991";
        users.save();
        return ok(users.name);
    }
}
