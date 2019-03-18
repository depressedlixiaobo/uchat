package com.lux.uchat.service;

import com.lux.uchat.domain.User;
import com.lux.uchat.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserService {
    @Autowired
    private UserDao _dao ;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private StringRedisTemplate  stringRedisTemplate;

    @Cacheable(value="getuserList" ,keyGenerator = "emptyGenerator")
    public List<User> getuserList(){

        List<User> userList =   _dao.getuserList();

         //redisTemplate.opsForValue().set("userlist11",userList.get(0));
        return  userList;
    }

    /**
     * 注册用户
     * @param user
     * @return 用户Id
     */
    public  Long registryUser(User user){
        String salt = "luxchat";
         String newPassWord =  user.getPassWord();
         String pwMd5 =  DigestUtils.md5DigestAsHex((salt+newPassWord).getBytes());
         user.setPassWord(pwMd5);
        return _dao.registryUser(user);
    }
     public  List<User> findUser(User user){
        return  _dao.findUser(user);
    }
}
