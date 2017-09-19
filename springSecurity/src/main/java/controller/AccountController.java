package controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lizhupeng on 2017/9/19.
 */

@Controller
@RequestMapping(value="/account")
public class AccountController {

    @Resource
    private AuthenticationManager myAuthenticationManager;


    public String  login(@RequestParam(defaultValue="") String employeeId, @RequestParam(defaultValue="") String openId, HttpServletRequest request){
        if(!checkValidateCode(request)){
            return "验证码错误！";
        }
        employeeId = employeeId.trim();
        UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(employeeId, openId);
/*        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(CwSysUser.class,"cwSysUser");
        detachedCriteria.add(Restrictions.eq("userNo", username));
        if(cwSysUserService.countUser(detachedCriteria)==0){
            return new LoginInfo().failed().msg("用户名: "+username+" 不存在.");
        }
*/        try {
            Authentication authentication = myAuthenticationManager.authenticate(authRequest); //调用loadUserByUsername
            SecurityContextHolder.getContext().setAuthentication(authentication);
            HttpSession session = request.getSession();
            session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext()); // 这个非常重要，否则验证后将无法登陆
            return authentication.getName();
        } catch (AuthenticationException ex) {
            return  "用户名或密码错误";
        }
    }


    /**
     * 验证码判断
     * @param request
     * @return
     */
    protected boolean checkValidateCode(HttpServletRequest request) {
        String result_verifyCode = request.getSession().getAttribute("verifyResult")
                .toString(); // 获取存于session的验证值
        // request.getSession().setAttribute("verifyResult", null);
        String user_verifyCode = request.getParameter("verifyCode");// 获取用户输入验证码
        if (null == user_verifyCode || !result_verifyCode.equalsIgnoreCase(user_verifyCode)) {
            return false;
        }
        return true;
    }


}
