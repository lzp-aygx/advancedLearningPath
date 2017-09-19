package service;

import domain.Account;
import org.springframework.stereotype.Service;

/**
 * Created by lizhupeng on 2017/9/18.
 */
@Service
public interface AccountHandler {

    Account findByOpenId(String openId);
}
