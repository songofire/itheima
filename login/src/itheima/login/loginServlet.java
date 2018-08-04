package itheima.login;

import itheima.dao.DataQuery;
import itheima.domain.User;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*@WebServlet(name = "loginServlet",urlPatterns = "/loginServlet")*/
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取提交的用户密码
        /*随便做点修改更新到GitHub分支*/
        System.out.println("随便打点东西咯");

        /*Ijust checkout branch issue and do something updage*/
        System.out.println("我刚刚切换到事情分支和作了一点修改");

        /*I just create branch issue9 and want to have a Test*/
        System.out.println("远程分支没有Branch issue9,现在准备用push,远程创建一个分支");


        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
    /*    HashMap<String, String> userMap = new HashMap<>();
        userMap.put("username",username);
        userMap.put("password",password);

        //打包成User对象
        User user = new User();
        try {
            BeanUtils.populate(user,userMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }*/
        User user = new User();
        user.setPassword(password);
        user.setUsername(username);

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        //连接数据库作比较
        DataQuery dq = new DataQuery();
        User loginUser = dq.userQuery(user);
        //根据信息跳转
        if (loginUser != null) {
            response.getWriter().print("Login Successful");
        } else {
            //密码打错,跳转到login页面输出错误信息
            /*response.getWriter().print("Login Failed");*/
            request.setAttribute("loginInfo", "登录有误请重新输入");
            request.getRequestDispatcher("/index.jsp").forward(request, response);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                doPost(request,response);
    }
}
