package com.bbh.shop.povider;

import com.bbh.shop.api.entity.Admin;
import com.bbh.shop.provider.service.AdminServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by test on 2015/6/25.
 */
public class AdminServiceImplTest  extends BaseTest {
    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminServiceImpl adminService;
    @Test
    public  void  test(){
        Admin admin=  adminService.findByUsername("aaaa");
    }


}
