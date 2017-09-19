package service;

import domain.Account;
import org.springframework.stereotype.Service;

/**
 * Created by lizhupeng on 2017/9/18.
 */
@Service
public class AccountHandlerImpl implements AccountHandler{

    //    注入Mapper
    private Account account;

    @Override
    public Account findByOpenId(String openId) {
        return null;
    }


}
