package com.lzp.springSecurity.config;//package com.leeman.config;
//
//import com.leeman.mapper.dataSource1.RoleMapper;
//import org.springframework.security.access.AccessDeniedException;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by lizhupeng on 2017/9/21.
// */
//@Component
//public class WeChatAuthenticationManager implements AuthenticationManager {
//
//    @Resource
//    RoleMapper roleMapper;
//
//    @Override
//    public Authentication authenticate(Authentication auth) throws AuthenticationException {
//        System.out.println("Code: " + auth.getName() + "Authoritise: " + auth.getAuthorities() + "Credentials: " + auth.getCredentials());
//        //根据传入的EmployeeId获取该用户拥有的权限
//        List<String> roleList = roleMapper.getRoleByEmployeeId((String) auth.getPrincipal());
//        List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
//        if (roleList.size() > 0) {
//            for (String authority : roleList) {
//                AUTHORITIES.add(new SimpleGrantedAuthority(authority));
//            }
//            return new UsernamePasswordAuthenticationToken(auth.getName(),
//                    auth.getCredentials(), AUTHORITIES);
//        } else {
//            throw new AccessDeniedException("No access permissions");
//        }
//    }
//}
